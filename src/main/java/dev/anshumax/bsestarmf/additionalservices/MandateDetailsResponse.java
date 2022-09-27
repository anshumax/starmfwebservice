
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MandateDetails" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ArrayOfMandateDetails" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateDetailsResponse", propOrder = {
    "mandateDetails",
    "message",
    "status"
})
public class MandateDetailsResponse {

    @XmlElement(name = "MandateDetails", nillable = true)
    protected ArrayOfMandateDetails mandateDetails;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

    /**
     * Gets the value of the mandateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMandateDetails }
     *     
     */
    public ArrayOfMandateDetails getMandateDetails() {
        return mandateDetails;
    }

    /**
     * Sets the value of the mandateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMandateDetails }
     *     
     */
    public void setMandateDetails(ArrayOfMandateDetails value) {
        this.mandateDetails = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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

}
