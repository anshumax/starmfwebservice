
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageResponseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageResponseStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BSELMNDP_MFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSELMNDR_RFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSENONDP_MFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSENONDR_RFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageResponseStatus", propOrder = {
    "bselmndpmfd",
    "bselmndrrfd",
    "bsenondpmfi",
    "bsenondrrfi"
})
public class ImageResponseStatus {

    @XmlElement(name = "BSELMNDP_MFD", nillable = true)
    protected String bselmndpmfd;
    @XmlElement(name = "BSELMNDR_RFD", nillable = true)
    protected String bselmndrrfd;
    @XmlElement(name = "BSENONDP_MFI", nillable = true)
    protected String bsenondpmfi;
    @XmlElement(name = "BSENONDR_RFI", nillable = true)
    protected String bsenondrrfi;

    /**
     * Gets the value of the bselmndpmfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSELMNDPMFD() {
        return bselmndpmfd;
    }

    /**
     * Sets the value of the bselmndpmfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSELMNDPMFD(String value) {
        this.bselmndpmfd = value;
    }

    /**
     * Gets the value of the bselmndrrfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSELMNDRRFD() {
        return bselmndrrfd;
    }

    /**
     * Sets the value of the bselmndrrfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSELMNDRRFD(String value) {
        this.bselmndrrfd = value;
    }

    /**
     * Gets the value of the bsenondpmfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSENONDPMFI() {
        return bsenondpmfi;
    }

    /**
     * Sets the value of the bsenondpmfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSENONDPMFI(String value) {
        this.bsenondpmfi = value;
    }

    /**
     * Gets the value of the bsenondrrfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSENONDRRFI() {
        return bsenondrrfi;
    }

    /**
     * Sets the value of the bsenondrrfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSENONDRRFI(String value) {
        this.bsenondrrfi = value;
    }

}
