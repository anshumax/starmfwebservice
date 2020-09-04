
package com.claroinvestments.bsestarmf.mforder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderEntryParamResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderEntryParamResult"
})
@XmlRootElement(name = "orderEntryParamResponse")
public class OrderEntryParamResponse {

    @XmlElement(nillable = true)
    protected String orderEntryParamResult;

    /**
     * Gets the value of the orderEntryParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderEntryParamResult() {
        return orderEntryParamResult;
    }

    /**
     * Sets the value of the orderEntryParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderEntryParamResult(String value) {
        this.orderEntryParamResult = value;
    }

}
