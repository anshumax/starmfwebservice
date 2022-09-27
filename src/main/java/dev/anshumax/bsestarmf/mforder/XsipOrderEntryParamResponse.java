
package dev.anshumax.bsestarmf.mforder;

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
 *         &lt;element name="xsipOrderEntryParamResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "xsipOrderEntryParamResult"
})
@XmlRootElement(name = "xsipOrderEntryParamResponse")
public class XsipOrderEntryParamResponse {

    @XmlElement(nillable = true)
    protected String xsipOrderEntryParamResult;

    /**
     * Gets the value of the xsipOrderEntryParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsipOrderEntryParamResult() {
        return xsipOrderEntryParamResult;
    }

    /**
     * Sets the value of the xsipOrderEntryParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsipOrderEntryParamResult(String value) {
        this.xsipOrderEntryParamResult = value;
    }

}
