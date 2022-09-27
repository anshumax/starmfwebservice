
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MandateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MandateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UMRNNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UploadDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateDetails", propOrder = {
    "amount",
    "approvedDate",
    "bankAccNo",
    "bankBranch",
    "bankName",
    "clientCode",
    "clientName",
    "collectionType",
    "mandateId",
    "mandateType",
    "memberCode",
    "regnDate",
    "remarks",
    "status",
    "umrnNo",
    "uploadDate"
})
public class MandateDetails {

    @XmlElement(name = "Amount", nillable = true)
    protected String amount;
    @XmlElement(name = "ApprovedDate", nillable = true)
    protected String approvedDate;
    @XmlElement(name = "BankAccNo", nillable = true)
    protected String bankAccNo;
    @XmlElement(name = "BankBranch", nillable = true)
    protected String bankBranch;
    @XmlElement(name = "BankName", nillable = true)
    protected String bankName;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "ClientName", nillable = true)
    protected String clientName;
    @XmlElement(name = "CollectionType", nillable = true)
    protected String collectionType;
    @XmlElement(name = "MandateId", nillable = true)
    protected String mandateId;
    @XmlElement(name = "MandateType", nillable = true)
    protected String mandateType;
    @XmlElement(name = "MemberCode", nillable = true)
    protected String memberCode;
    @XmlElement(name = "RegnDate", nillable = true)
    protected String regnDate;
    @XmlElement(name = "Remarks", nillable = true)
    protected String remarks;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "UMRNNo", nillable = true)
    protected String umrnNo;
    @XmlElement(name = "UploadDate", nillable = true)
    protected String uploadDate;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedDate(String value) {
        this.approvedDate = value;
    }

    /**
     * Gets the value of the bankAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNo() {
        return bankAccNo;
    }

    /**
     * Sets the value of the bankAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNo(String value) {
        this.bankAccNo = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionType(String value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the mandateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateId() {
        return mandateId;
    }

    /**
     * Sets the value of the mandateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateId(String value) {
        this.mandateId = value;
    }

    /**
     * Gets the value of the mandateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateType() {
        return mandateType;
    }

    /**
     * Sets the value of the mandateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateType(String value) {
        this.mandateType = value;
    }

    /**
     * Gets the value of the memberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * Sets the value of the memberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCode(String value) {
        this.memberCode = value;
    }

    /**
     * Gets the value of the regnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDate() {
        return regnDate;
    }

    /**
     * Sets the value of the regnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDate(String value) {
        this.regnDate = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the umrnNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMRNNo() {
        return umrnNo;
    }

    /**
     * Sets the value of the umrnNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMRNNo(String value) {
        this.umrnNo = value;
    }

    /**
     * Gets the value of the uploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets the value of the uploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDate(String value) {
        this.uploadDate = value;
    }

	@Override
	public String toString() {
		return "MandateDetails [amount=" + amount + " | approvedDate=" + approvedDate + " | bankAccNo=" + bankAccNo
				+ " | bankBranch=" + bankBranch + " | bankName=" + bankName + " | clientCode=" + clientCode
				+ " | clientName=" + clientName + " | collectionType=" + collectionType + " | mandateId=" + mandateId
				+ " | mandateType=" + mandateType + " | memberCode=" + memberCode + " | regnDate=" + regnDate
				+ " | remarks=" + remarks + " | status=" + status + " | umrnNo=" + umrnNo + " | uploadDate="
				+ uploadDate + "]";
	}
    
    
}
