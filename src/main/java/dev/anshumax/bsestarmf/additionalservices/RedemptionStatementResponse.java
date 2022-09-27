
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionStatementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionStatementResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionDetails" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ArrayOfRedemptionDetails" minOccurs="0"/&gt;
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
@XmlType(name = "RedemptionStatementResponse", propOrder = {
    "message",
    "redemptionDetails",
    "status"
})
public class RedemptionStatementResponse {

    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "RedemptionDetails", nillable = true)
    protected ArrayOfRedemptionDetails redemptionDetails;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

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
     * Gets the value of the redemptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRedemptionDetails }
     *     
     */
    public ArrayOfRedemptionDetails getRedemptionDetails() {
        return redemptionDetails;
    }

    /**
     * Sets the value of the redemptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRedemptionDetails }
     *     
     */
    public void setRedemptionDetails(ArrayOfRedemptionDetails value) {
        this.redemptionDetails = value;
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
