
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
 *         &lt;element name="RedemptionStatementResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}RedemptionStatementResponse" minOccurs="0"/&gt;
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
    "redemptionStatementResult"
})
@XmlRootElement(name = "RedemptionStatementResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class RedemptionStatementResponse2 {

    @XmlElement(name = "RedemptionStatementResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected RedemptionStatementResponse redemptionStatementResult;

    /**
     * Gets the value of the redemptionStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionStatementResponse }
     *     
     */
    public RedemptionStatementResponse getRedemptionStatementResult() {
        return redemptionStatementResult;
    }

    /**
     * Sets the value of the redemptionStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionStatementResponse }
     *     
     */
    public void setRedemptionStatementResult(RedemptionStatementResponse value) {
        this.redemptionStatementResult = value;
    }

}
