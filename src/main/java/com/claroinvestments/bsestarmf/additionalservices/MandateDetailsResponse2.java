
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
 *         &lt;element name="MandateDetailsResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}MandateDetailsResponse" minOccurs="0"/&gt;
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
    "mandateDetailsResult"
})
@XmlRootElement(name = "MandateDetailsResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class MandateDetailsResponse2 {

    @XmlElement(name = "MandateDetailsResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected MandateDetailsResponse mandateDetailsResult;

    /**
     * Gets the value of the mandateDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MandateDetailsResponse }
     *     
     */
    public MandateDetailsResponse getMandateDetailsResult() {
        return mandateDetailsResult;
    }

    /**
     * Sets the value of the mandateDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateDetailsResponse }
     *     
     */
    public void setMandateDetailsResult(MandateDetailsResponse value) {
        this.mandateDetailsResult = value;
    }

}
