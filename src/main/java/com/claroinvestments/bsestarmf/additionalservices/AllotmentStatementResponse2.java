
package com.claroinvestments.bsestarmf.additionalservices;

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
 *         &lt;element name="AllotmentStatementResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}AllotmentStatementResponse" minOccurs="0"/&gt;
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
    "allotmentStatementResult"
})
@XmlRootElement(name = "AllotmentStatementResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class AllotmentStatementResponse2 {

    @XmlElement(name = "AllotmentStatementResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected AllotmentStatementResponse allotmentStatementResult;

    /**
     * Gets the value of the allotmentStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link AllotmentStatementResponse }
     *     
     */
    public AllotmentStatementResponse getAllotmentStatementResult() {
        return allotmentStatementResult;
    }

    /**
     * Sets the value of the allotmentStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllotmentStatementResponse }
     *     
     */
    public void setAllotmentStatementResult(AllotmentStatementResponse value) {
        this.allotmentStatementResult = value;
    }

}
