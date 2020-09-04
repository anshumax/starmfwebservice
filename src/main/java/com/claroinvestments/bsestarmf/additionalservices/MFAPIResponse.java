
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
 *         &lt;element name="MFAPIResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "mfapiResult"
})
@XmlRootElement(name = "MFAPIResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class MFAPIResponse {

    @XmlElement(name = "MFAPIResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected String mfapiResult;

    /**
     * Gets the value of the mfapiResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFAPIResult() {
        return mfapiResult;
    }

    /**
     * Sets the value of the mfapiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFAPIResult(String value) {
        this.mfapiResult = value;
    }

}
