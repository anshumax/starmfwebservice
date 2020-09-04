
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
 *         &lt;element name="GetPasswordMobileResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}Response" minOccurs="0"/&gt;
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
    "getPasswordMobileResult"
})
@XmlRootElement(name = "GetPasswordMobileResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class GetPasswordMobileResponse {

    @XmlElement(name = "GetPasswordMobileResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected Response getPasswordMobileResult;

    /**
     * Gets the value of the getPasswordMobileResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getGetPasswordMobileResult() {
        return getPasswordMobileResult;
    }

    /**
     * Sets the value of the getPasswordMobileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setGetPasswordMobileResult(Response value) {
        this.getPasswordMobileResult = value;
    }

}
