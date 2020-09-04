
package com.claroinvestments.bsestarmf.additionalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AOFPanSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AOFPanSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BSERemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageResponseStatus" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ImageResponseStatus" minOccurs="0"/&gt;
 *         &lt;element name="imageUploadStatus" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ImageUploadStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AOFPanSearchResponse", propOrder = {
    "bseRemarks",
    "pan",
    "status",
    "imageResponseStatus",
    "imageUploadStatus"
})
public class AOFPanSearchResponse {

    @XmlElement(name = "BSERemarks", nillable = true)
    protected String bseRemarks;
    @XmlElement(name = "PAN", nillable = true)
    protected String pan;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(nillable = true)
    protected ImageResponseStatus imageResponseStatus;
    @XmlElement(nillable = true)
    protected ImageUploadStatus imageUploadStatus;

    /**
     * Gets the value of the bseRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSERemarks() {
        return bseRemarks;
    }

    /**
     * Sets the value of the bseRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSERemarks(String value) {
        this.bseRemarks = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the imageResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ImageResponseStatus }
     *     
     */
    public ImageResponseStatus getImageResponseStatus() {
        return imageResponseStatus;
    }

    /**
     * Sets the value of the imageResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageResponseStatus }
     *     
     */
    public void setImageResponseStatus(ImageResponseStatus value) {
        this.imageResponseStatus = value;
    }

    /**
     * Gets the value of the imageUploadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ImageUploadStatus }
     *     
     */
    public ImageUploadStatus getImageUploadStatus() {
        return imageUploadStatus;
    }

    /**
     * Sets the value of the imageUploadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageUploadStatus }
     *     
     */
    public void setImageUploadStatus(ImageUploadStatus value) {
        this.imageUploadStatus = value;
    }

}
