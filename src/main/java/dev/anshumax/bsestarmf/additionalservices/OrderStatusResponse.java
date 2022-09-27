
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
 *         &lt;element name="OrderStatusResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}OrderResponse" minOccurs="0"/&gt;
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
    "orderStatusResult"
})
@XmlRootElement(name = "OrderStatusResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class OrderStatusResponse {

    @XmlElement(name = "OrderStatusResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected OrderResponse orderStatusResult;

    /**
     * Gets the value of the orderStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponse }
     *     
     */
    public OrderResponse getOrderStatusResult() {
        return orderStatusResult;
    }

    /**
     * Sets the value of the orderStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponse }
     *     
     */
    public void setOrderStatusResult(OrderResponse value) {
        this.orderStatusResult = value;
    }

}
