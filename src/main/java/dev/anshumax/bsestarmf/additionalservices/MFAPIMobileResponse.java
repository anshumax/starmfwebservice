
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
 *         &lt;element name="MFAPIMobileResult" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}Response" minOccurs="0"/&gt;
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
    "mfapiMobileResult"
})
@XmlRootElement(name = "MFAPIMobileResponse", namespace = "http://www.bsestarmf.in/2016/01/")
public class MFAPIMobileResponse {

    @XmlElement(name = "MFAPIMobileResult", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected Response mfapiMobileResult;

    /**
     * Gets the value of the mfapiMobileResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getMFAPIMobileResult() {
        return mfapiMobileResult;
    }

    /**
     * Sets the value of the mfapiMobileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setMFAPIMobileResult(Response value) {
        this.mfapiMobileResult = value;
    }

}
