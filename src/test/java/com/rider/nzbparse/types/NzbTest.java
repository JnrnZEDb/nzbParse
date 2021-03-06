package com.rider.nzbparse.types;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test of the Nzb class
 *
 * @author Ciaron Rider
 */
public class NzbTest {
    /**
     * Method used for comparing two ages to the nearest second.
     *
     * @param first First age
     * @param second Second age
     * @return True if the ages are within 1s of each other or false if not
     */
    private boolean ageCompare(final long first,
                               final long second) {
        return Math.abs(first - second) < 1000;
    }

    /**
     * Test of addFile, of class Nzb.
     */
    @Test
    public void testAddFile() {
        final Nzb nzb = new Nzb();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);

        nzb.addFile(file1);
        Assert.assertTrue("Error in \"addFile\" in \"Nzb\"", nzb.getFiles().contains(file1));

        nzb.addFile(file2);
        Assert.assertTrue("Error in \"addFile\" in \"Nzb\"", nzb.getFiles().contains(file2));
    }

    /**
     * Test of addFiles, of class Nzb.
     */
    @Test
    public void testAddFiles() {
        final Nzb nzb = new Nzb();
        final List<FileItem> files = new ArrayList<>();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);

        files.add(file1);
        files.add(file2);

        nzb.addFiles(files);
        Assert.assertTrue("Error in \"addFiles\" in \"Nzb\"", nzb.getFiles().contains(file1));
        Assert.assertTrue("Error in \"addFiles\" in \"Nzb\"", nzb.getFiles().contains(file2));
    }

    /**
     * Test of removeFile, of class Nzb.
     */
    @Test
    public void testRemoveFile() {
        final Nzb nzb = new Nzb();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);

        nzb.addFile(file1);
        nzb.addFile(file2);

        nzb.removeFile(file1);
        Assert.assertFalse("Error in \"removeFile\" in \"Nzb\"", nzb.getFiles().contains(file1));
        Assert.assertTrue("Error in \"removeFile\" in \"Nzb\"", nzb.getFiles().contains(file2));

        nzb.removeFile(file2);
        Assert.assertFalse("Error in \"removeFile\" in \"Nzb\"", nzb.getFiles().contains(file2));
    }

    /**
     * Test of clearFiles, of class Nzb.
     */
    @Test
    public void testClearFiles() {
        final Nzb nzb = new Nzb();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);

        nzb.addFile(file1);
        nzb.addFile(file2);

        nzb.clearFiles();
        Assert.assertFalse("Error in \"clearFiles\" in \"Nzb\"", nzb.getFiles().contains(file1));
        Assert.assertFalse("Error in \"clearFiles\" in \"Nzb\"", nzb.getFiles().contains(file2));
        Assert.assertEquals("Error in \"clearFiles\" in \"Nzb\"", 0, nzb.getFiles().size());
    }

    /**
     * Test of addMetaDatum, of class Nzb.
     */
    @Test
    public void testAddMetaDatum() {
        final Nzb nzb = new Nzb();
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        nzb.addMetaDatum(metaDatum1);
        Assert.assertTrue("Error in \"addMetaDatum\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum1));

        nzb.addMetaDatum(metaDatum2);
        Assert.assertTrue("Error in \"addMetaDatum\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum2));
    }

    /**
     * Test of addMetaData, of class Nzb.
     */
    @Test
    public void testAddMetaData() {
        final Nzb nzb = new Nzb();
        final List<MetaDatum> metaDatums = new ArrayList<>();
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        metaDatums.add(metaDatum1);
        metaDatums.add(metaDatum2);

        nzb.addMetaData(metaDatums);
        Assert.assertTrue("Error in \"addMetaData\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum1));
        Assert.assertTrue("Error in \"addMetaData\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum2));
    }

    /**
     * Test of removeMetaDatum, of class Nzb.
     */
    @Test
    public void testRemoveMetaDatum() {
        final Nzb nzb = new Nzb();
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        nzb.addMetaDatum(metaDatum1);
        nzb.addMetaDatum(metaDatum2);

        nzb.removeMetaDatum(metaDatum1);
        Assert.assertFalse("Error in \"removeMetaDatum\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum1));
        Assert.assertTrue("Error in \"removeMetaDatum\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum2));

        nzb.removeMetaDatum(metaDatum2);
        Assert.assertFalse("Error in \"removeMetaDatum\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum2));
    }

    /**
     * Test of clearMetaData, of class Nzb.
     */
    @Test
    public void testClearMetaData() {
        final Nzb nzb = new Nzb();
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        nzb.addMetaDatum(metaDatum1);
        nzb.addMetaDatum(metaDatum2);

        nzb.clearMetaData();
        Assert.assertFalse("Error in \"clearMetaData\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum1));
        Assert.assertFalse("Error in \"clearMetaData\" in \"Nzb\"", nzb.getMetaData().contains(metaDatum2));
        Assert.assertEquals("Error in \"clearMetaData\" in \"Nzb\"", 0, nzb.getMetaData().size());
    }

    /**
     * Test of copy constructor, of class Nzb.
     */
    @Test
    public void testCopy() {
        final Nzb nzb = new Nzb();
        final FileItem fileItem1 = new FileItem("subject1", "poster1", 1);
        final FileItem fileItem2 = new FileItem("subject2", "poster2", 2);
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        nzb.addFile(fileItem1);
        nzb.addFile(fileItem2);

        nzb.addMetaDatum(metaDatum1);
        nzb.addMetaDatum(metaDatum2);

        final Nzb copyTo = new Nzb(nzb);

        Assert.assertTrue("Copy constructor in \"Nzb\" does not set \"files\" properly", copyTo.getFiles().contains(fileItem1));
        Assert.assertTrue("Copy constructor in \"Nzb\" does not set \"files\" properly", copyTo.getFiles().contains(fileItem2));
        Assert.assertTrue("Copy constructor in \"Nzb\" does not set \"metaData\" properly", copyTo.getMetaData().contains(metaDatum1));
        Assert.assertTrue("Copy constructor in \"Nzb\" does not set \"metaData\" properly", copyTo.getMetaData().contains(metaDatum2));

        try {
            new Nzb(null);
            Assert.fail("Passing null to copy constructor of \"Nzb\" did not throw NullPointerException");
        } catch (final NullPointerException exception) {
            // Expected
        }
    }

    /**
     * Test of sort, of class Nzb.
     */
    @Test
    public void testSort() {
        final Nzb nzb = new Nzb();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final Segment segment1 = new Segment(1, "segment1", 1);
        final Segment segment2 = new Segment(2, "segment2", 2);

        file1.addSegment(segment1);
        file1.addSegment(segment2);
        file2.addSegment(segment1);
        file2.addSegment(segment2);
        nzb.addFile(file1);
        nzb.addFile(file2);

        nzb.sort();

        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file1, nzb.getFiles().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(0).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(0).getSegments().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file2, nzb.getFiles().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(1).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(1).getSegments().get(1));

        nzb.clearFiles();
        nzb.addFile(file2);
        nzb.addFile(file1);

        nzb.sort();

        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file1, nzb.getFiles().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(0).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(0).getSegments().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file2, nzb.getFiles().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(1).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(1).getSegments().get(1));

        file1.clearSegments();
        file1.addSegment(segment2);
        file1.addSegment(segment1);
        file2.clearSegments();
        file2.addSegment(segment2);
        file2.addSegment(segment1);
        nzb.clearFiles();
        nzb.addFile(file1);
        nzb.addFile(file2);

        nzb.sort();

        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file1, nzb.getFiles().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(0).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(0).getSegments().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file2, nzb.getFiles().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(1).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(1).getSegments().get(1));

        nzb.clearFiles();
        nzb.addFile(file2);
        nzb.addFile(file1);

        nzb.sort();

        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file1, nzb.getFiles().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(0).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(0).getSegments().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files properly", file2, nzb.getFiles().get(1));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment1, nzb.getFiles().get(1).getSegments().get(0));
        Assert.assertEquals("\"sort\" method in \"Nzb\" does not sort files' segments properly", segment2, nzb.getFiles().get(1).getSegments().get(1));
    }

    /**
     * Test of calculateSize, of class Nzb.
     */
    @Test
    public void testCalculateSize() {
        final Nzb nzb = new Nzb();

        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);

        file1.addSegment(new Segment(0, "test1", 10));
        file1.addSegment(new Segment(1, "test2", 20));

        file2.addSegment(new Segment(0, "test3", 30));
        file2.addSegment(new Segment(1, "test4", 40));

        Assert.assertEquals("Error in \"calculateSize\" in \"Nzb\"", 0, nzb.calculateSize());

        nzb.addFile(file1);
        Assert.assertEquals("Error in \"calculateSize\" in \"Nzb\"", 30, nzb.calculateSize());

        nzb.addFile(file2);
        Assert.assertEquals("Error in \"calculateSize\" in \"Nzb\"", 100, nzb.calculateSize());

        nzb.removeFile(file1);
        Assert.assertEquals("Error in \"calculateSize\" in \"Nzb\"", 70, nzb.calculateSize());

        nzb.removeFile(file2);
        Assert.assertEquals("Error in \"calculateSize\" in \"Nzb\"", 0, nzb.calculateSize());
    }

    /**
     * Test of calculateNewestPublishDate, of class Nzb.
     */
    @Test
    public void testCalculateNewestPublishDate() {
        final Nzb nzb = new Nzb();

        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final FileItem file3 = new FileItem("subject3", "poster2", 3);

        nzb.addFile(file1);
        Assert.assertEquals("Error in \"calculateNewestPublishDate\" in \"Nzb\"", 1000, nzb.calculateNewestPublishDate());

        nzb.addFile(file2);
        Assert.assertEquals("Error in \"calculateNewestPublishDate\" in \"Nzb\"", 2000, nzb.calculateNewestPublishDate());

        nzb.addFile(file3);
        Assert.assertEquals("Error in \"calculateNewestPublishDate\" in \"Nzb\"", 3000, nzb.calculateNewestPublishDate());

        nzb.removeFile(file2);
        Assert.assertEquals("Error in \"calculateNewestPublishDate\" in \"Nzb\"", 3000, nzb.calculateNewestPublishDate());

        nzb.removeFile(file3);
        Assert.assertEquals("Error in \"calculateNewestPublishDate\" in \"Nzb\"", 1000, nzb.calculateNewestPublishDate());
    }

    /**
     * Test of calculateOldestPublishDate, of class Nzb.
     */
    @Test
    public void testCalculateOldestPublishDate() {
        final Nzb nzb = new Nzb();

        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final FileItem file3 = new FileItem("subject3", "poster2", 3);

        nzb.addFile(file1);
        Assert.assertEquals("Error in \"calculateOldestPublishDate\" in \"Nzb\"", 1000, nzb.calculateOldestPublishDate());

        nzb.addFile(file2);
        Assert.assertEquals("Error in \"calculateOldestPublishDate\" in \"Nzb\"", 1000, nzb.calculateOldestPublishDate());

        nzb.addFile(file3);
        Assert.assertEquals("Error in \"calculateOldestPublishDate\" in \"Nzb\"", 1000, nzb.calculateOldestPublishDate());

        nzb.removeFile(file1);
        Assert.assertEquals("Error in \"calculateOldestPublishDate\" in \"Nzb\"", 2000, nzb.calculateOldestPublishDate());

        nzb.removeFile(file2);
        Assert.assertEquals("Error in \"calculateOldestPublishDate\" in \"Nzb\"", 3000, nzb.calculateOldestPublishDate());
    }

    /**
     * Test of calculateNewestAge, of class Nzb.
     */
    @Test
    public void testCalculateNewestAge() {
        final Nzb nzb = new Nzb();

        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final FileItem file3 = new FileItem("subject3", "poster3", 3);

        nzb.addFile(file1);
        Assert.assertTrue("Error in \"calculateNewestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 1000, nzb.calculateNewestAge()));

        nzb.addFile(file2);
        Assert.assertTrue("Error in \"calculateNewestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 2000, nzb.calculateNewestAge()));

        nzb.addFile(file3);
        Assert.assertTrue("Error in \"calculateNewestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 3000, nzb.calculateNewestAge()));

        nzb.removeFile(file2);
        Assert.assertTrue("Error in \"calculateNewestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 3000, nzb.calculateNewestAge()));

        nzb.removeFile(file3);
        Assert.assertTrue("Error in \"calculateNewestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 1000, nzb.calculateNewestAge()));
    }

    /**
     * Test of calculateOldestAge, of class Nzb.
     */
    @Test
    public void testCalculateOldestAge() {
        final Nzb nzb = new Nzb();

        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final FileItem file3 = new FileItem("subject3", "poster2", 3);

        nzb.addFile(file1);
        Assert.assertTrue("Error in \"calculateOldestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 1000, nzb.calculateOldestAge()));

        nzb.addFile(file2);
        Assert.assertTrue("Error in \"calculateOldestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 1000, nzb.calculateOldestAge()));

        nzb.addFile(file3);
        Assert.assertTrue("Error in \"calculateOldestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 1000, nzb.calculateOldestAge()));

        nzb.removeFile(file1);
        Assert.assertTrue("Error in \"calculateOldestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 2000, nzb.calculateOldestAge()));

        nzb.removeFile(file2);
        Assert.assertTrue("Error in \"calculateOldestAge\" in \"Nzb\"", ageCompare(System.currentTimeMillis() - 3000, nzb.calculateOldestAge()));
    }

    /**
     * Test of equals, of class Nzb.
     */
    @Test
    public void testEquals() {
        final Nzb nzb1 = new Nzb();
        Nzb nzb2 = new Nzb();
        final FileItem file1 = new FileItem("subject1", "poster1", 1);
        final FileItem file2 = new FileItem("subject2", "poster2", 2);
        final MetaDatum metaDatum1 = new MetaDatum("name1", "value1");
        final MetaDatum metaDatum2 = new MetaDatum("name2", "value2");

        nzb1.addFile(file1);
        nzb1.addFile(file2);

        nzb1.addMetaDatum(metaDatum1);
        nzb1.addMetaDatum(metaDatum2);

        nzb2.addFile(file1);
        nzb2.addFile(file2);

        nzb2.addMetaDatum(metaDatum1);
        nzb2.addMetaDatum(metaDatum2);

        Assert.assertEquals("Error in \"equals\" method of \"Nzb\"", nzb1, nzb2);

        nzb2.removeFile(file2);
        Assert.assertNotSame("Error in \"equals\" method of \"Segment\"", nzb1, nzb2);

        nzb2.addFile(file2);
        Assert.assertEquals("Error in \"equals\" method of \"Nzb\"", nzb1, nzb2);

        nzb2.removeMetaDatum(metaDatum2);
        Assert.assertNotSame("Error in \"equals\" method of \"Segment\"", nzb1, nzb2);

        nzb2.addMetaDatum(metaDatum2);
        Assert.assertEquals("Error in \"equals\" method of \"Nzb\"", nzb1, nzb2);
    }
}
