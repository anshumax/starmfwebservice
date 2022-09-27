
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
 *         &lt;element name="Param" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}MFAPIRequest" minOccurs="0"/&gt;
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
    "param"
})
@XmlRootElement(name = "MFAPIMobile", namespace = "http://www.bsestarmf.in/2016/01/")
public class MFAPIMobile {

    @XmlElement(name = "Param", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected MFAPIRequest param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link MFAPIRequest }
     *     
     */
    public MFAPIRequest getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFAPIRequest }
     *     
     */
    public void setParam(MFAPIRequest value) {
        this.param = value;
    }

}
