
package com.claroinvestments.bsestarmf.payments;

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
 *         &lt;element name="PaymentGatewayAPIResult" type="{http://schemas.datacontract.org/2004/07/StarMFPaymentGatewayService}Response" minOccurs="0"/&gt;
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
    "paymentGatewayAPIResult"
})
@XmlRootElement(name = "PaymentGatewayAPIResponse")
public class PaymentGatewayAPIResponse {

    @XmlElement(name = "PaymentGatewayAPIResult", nillable = true)
    protected Response paymentGatewayAPIResult;

    /**
     * Gets the value of the paymentGatewayAPIResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getPaymentGatewayAPIResult() {
        return paymentGatewayAPIResult;
    }

    /**
     * Sets the value of the paymentGatewayAPIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setPaymentGatewayAPIResult(Response value) {
        this.paymentGatewayAPIResult = value;
    }

}
