package com.rider.nzbparse.types;

import com.rider.nzbparse.comparators.SegmentComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Object which contains a list of segments. Never needs to be seen by the end
 * user.
 *
 * @author Ciaron Rider
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segment"
})
@XmlRootElement(name = "segments")
public class Segments {
    /**
     * Used for comparing segments of files.
     */
    @XmlTransient
    private SegmentComparator segmentComparator;

    /**
     * The list of segments.
     */
    private List<Segment> segment;

    /**
     * Protected constructor. Users never need see this
     */
    protected Segments() {
        // Do nothing
    }

    /**
     * Get the list of segments.
     *
     * @return The list of segments
     */
    protected List<Segment> getSegments() {
        if (segment == null) {
            segment = new ArrayList<>();
        }

        return Collections.unmodifiableList(segment);
    }

    /**
     * Add a segment to the list of segments.
     *
     * @param segment The segment to add
     */
    protected void addSegment(final Segment segment) {
        if (this.segment == null) {
            this.segment = new ArrayList<>();
        }

        this.segment.add(segment);
    }

    /**
     * Add segments to the list of segments.
     *
     * @param segments The segments to add
     */
    protected void addSegments(final Collection<? extends Segment> segments) {
        if (segment == null) {
            segment = new ArrayList<>();
        }

        segment.addAll(segments);
    }

    /**
     * Remove a segment from the list of segments.
     *
     * @param segment The segment to remove
     */
    public void removeSegment(final Segment segment) {
        if (this.segment != null) {
            this.segment.remove(segment);
        }
    }

    /**
     * Remove all segments from the list of segments.
     */
    public void clearSegments() {
        if (this.segment != null) {
            this.segment.clear();
        }
    }

    /**
     * Sort the segments in this segments object by index
     */
    protected void sort() {
        if (segmentComparator == null) {
            segmentComparator = new SegmentComparator();
        }

        Collections.sort(segment, segmentComparator);
    }
}
