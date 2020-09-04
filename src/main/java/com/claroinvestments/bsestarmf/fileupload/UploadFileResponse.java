
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
 *         &lt;element name="UploadFileResult" type="{http://schemas.datacontract.org/2004/07/StarMFFileUploadService}Response" minOccurs="0"/&gt;
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
    "uploadFileResult"
})
@XmlRootElement(name = "UploadFileResponse")
public class UploadFileResponse {

    @XmlElement(name = "UploadFileResult", nillable = true)
    protected Response uploadFileResult;

    /**
     * Gets the value of the uploadFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getUploadFileResult() {
        return uploadFileResult;
    }

    /**
     * Sets the value of the uploadFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setUploadFileResult(Response value) {
        this.uploadFileResult = value;
    }

}
