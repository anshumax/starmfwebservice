
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
 *         &lt;element name="ProvOrderStatusResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}ProvOrderResponse" minOccurs="0"/&gt;
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
    "provOrderStatusResult"
})
@XmlRootElement(name = "ProvOrderStatusResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class ProvOrderStatusResponse {

    @XmlElement(name = "ProvOrderStatusResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected ProvOrderResponse provOrderStatusResult;

    /**
     * Gets the value of the provOrderStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProvOrderResponse }
     *     
     */
    public ProvOrderResponse getProvOrderStatusResult() {
        return provOrderStatusResult;
    }

    /**
     * Sets the value of the provOrderStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvOrderResponse }
     *     
     */
    public void setProvOrderStatusResult(ProvOrderResponse value) {
        this.provOrderStatusResult = value;
    }

}
