
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
 *         &lt;element name="Param" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}AllotmentStatementRequest" minOccurs="0"/&gt;
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
@XmlRootElement(name = "AllotmentStatement", namespace = "http://www.bsestarmf.in/2016/01/")
public class AllotmentStatement {

    @XmlElement(name = "Param", namespace = "http://www.bsestarmf.in/2016/01/", nillable = true)
    protected AllotmentStatementRequest param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link AllotmentStatementRequest }
     *     
     */
    public AllotmentStatementRequest getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllotmentStatementRequest }
     *     
     */
    public void setParam(AllotmentStatementRequest value) {
        this.param = value;
    }

}
