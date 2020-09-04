
package com.claroinvestments.bsestarmf.additionalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvOrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provOrderDetails" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ArrayOfProvOrderDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvOrderResponse", propOrder = {
    "message",
    "status",
    "provOrderDetails"
})
public class ProvOrderResponse {

    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(nillable = true)
    protected ArrayOfProvOrderDetails provOrderDetails;

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

    /**
     * Gets the value of the provOrderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProvOrderDetails }
     *     
     */
    public ArrayOfProvOrderDetails getProvOrderDetails() {
        return provOrderDetails;
    }

    /**
     * Sets the value of the provOrderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProvOrderDetails }
     *     
     */
    public void setProvOrderDetails(ArrayOfProvOrderDetails value) {
        this.provOrderDetails = value;
    }

}
