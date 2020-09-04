
package com.claroinvestments.bsestarmf.fileupload;

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
 *         &lt;element name="Data" type="{http://schemas.datacontract.org/2004/07/StarMFFileUploadService}MandateScanFileData" minOccurs="0"/&gt;
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
    "data"
})
@XmlRootElement(name = "UploadMandateScanFile")
public class UploadMandateScanFile {

    @XmlElement(name = "Data", nillable = true)
    protected MandateScanFileData data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link MandateScanFileData }
     *     
     */
    public MandateScanFileData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateScanFileData }
     *     
     */
    public void setData(MandateScanFileData value) {
        this.data = value;
    }

}
