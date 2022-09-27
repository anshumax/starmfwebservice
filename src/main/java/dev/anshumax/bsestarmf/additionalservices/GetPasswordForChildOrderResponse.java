
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetPasswordForChildOrderResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}Response" minOccurs="0"/&gt;
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
    "getPasswordForChildOrderResult"
})
@XmlRootElement(name = "GetPasswordForChildOrderResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class GetPasswordForChildOrderResponse {

    @XmlElement(name = "GetPasswordForChildOrderResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected Response getPasswordForChildOrderResult;

    /**
     * Gets the value of the getPasswordForChildOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getGetPasswordForChildOrderResult() {
        return getPasswordForChildOrderResult;
    }

    /**
     * Sets the value of the getPasswordForChildOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setGetPasswordForChildOrderResult(Response value) {
        this.getPasswordForChildOrderResult = value;
    }

}
