//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.23 at 11:23:32 AM BST 
//


package com.rider.nzbparse.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groups",
    "segments"
})
@XmlRootElement(name = "file")
public class File {

    @XmlAttribute(name = "subject", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subject;
    @XmlAttribute(name = "poster")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poster;
    @XmlAttribute(name = "date")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String date;
    protected Groups groups;
    protected Segments segments;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the poster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoster() {
        return poster;
    }

    /**
     * Sets the value of the poster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoster(String value) {
        this.poster = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link Segments }
     *     
     */
    public Segments getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Segments }
     *     
     */
    public void setSegments(Segments value) {
        this.segments = value;
    }

}