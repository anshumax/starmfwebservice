
package com.claroinvestments.bsestarmf.additionalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllotmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllotmentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllottedAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllottedNav" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllottedUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiaryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUINDecl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KYCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTASchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTATransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIPRegnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIPRegnNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubBrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllotmentDetails", propOrder = {
    "allottedAmt",
    "allottedNav",
    "allottedUnit",
    "amount",
    "beneficiaryId",
    "branchCode",
    "clientCode",
    "clientName",
    "dpcFlag",
    "dpTrans",
    "euin",
    "euinDecl",
    "folioNo",
    "isin",
    "internalRefNo",
    "kycFlag",
    "memberCode",
    "orderDate",
    "orderNo",
    "orderType",
    "qty",
    "rtaSchemeCode",
    "rtaTransNo",
    "remarks",
    "reportDate",
    "sipRegnDate",
    "sipRegnNo",
    "stt",
    "schemeCode",
    "settNo",
    "settType",
    "subBrCode",
    "subOrderType",
    "userId",
    "validFlag"
})
public class AllotmentDetails {

    @XmlElement(name = "AllottedAmt", nillable = true)
    protected String allottedAmt;
    @XmlElement(name = "AllottedNav", nillable = true)
    protected String allottedNav;
    @XmlElement(name = "AllottedUnit", nillable = true)
    protected String allottedUnit;
    @XmlElement(name = "Amount", nillable = true)
    protected String amount;
    @XmlElement(name = "BeneficiaryId", nillable = true)
    protected String beneficiaryId;
    @XmlElement(name = "BranchCode", nillable = true)
    protected String branchCode;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "ClientName", nillable = true)
    protected String clientName;
    @XmlElement(name = "DPCFlag", nillable = true)
    protected String dpcFlag;
    @XmlElement(name = "DPTrans", nillable = true)
    protected String dpTrans;
    @XmlElement(name = "EUIN", nillable = true)
    protected String euin;
    @XmlElement(name = "EUINDecl", nillable = true)
    protected String euinDecl;
    @XmlElement(name = "FolioNo", nillable = true)
    protected String folioNo;
    @XmlElement(name = "ISIN", nillable = true)
    protected String isin;
    @XmlElement(name = "InternalRefNo", nillable = true)
    protected String internalRefNo;
    @XmlElement(name = "KYCFlag", nillable = true)
    protected String kycFlag;
    @XmlElement(name = "MemberCode", nillable = true)
    protected String memberCode;
    @XmlElement(name = "OrderDate", nillable = true)
    protected String orderDate;
    @XmlElement(name = "OrderNo", nillable = true)
    protected String orderNo;
    @XmlElement(name = "OrderType", nillable = true)
    protected String orderType;
    @XmlElement(name = "Qty", nillable = true)
    protected String qty;
    @XmlElement(name = "RTASchemeCode", nillable = true)
    protected String rtaSchemeCode;
    @XmlElement(name = "RTATransNo", nillable = true)
    protected String rtaTransNo;
    @XmlElement(name = "Remarks", nillable = true)
    protected String remarks;
    @XmlElement(name = "ReportDate", nillable = true)
    protected String reportDate;
    @XmlElement(name = "SIPRegnDate", nillable = true)
    protected String sipRegnDate;
    @XmlElement(name = "SIPRegnNo", nillable = true)
    protected String sipRegnNo;
    @XmlElement(name = "STT", nillable = true)
    protected String stt;
    @XmlElement(name = "SchemeCode", nillable = true)
    protected String schemeCode;
    @XmlElement(name = "SettNo", nillable = true)
    protected String settNo;
    @XmlElement(name = "SettType", nillable = true)
    protected String settType;
    @XmlElement(name = "SubBrCode", nillable = true)
    protected String subBrCode;
    @XmlElement(name = "SubOrderType", nillable = true)
    protected String subOrderType;
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;
    @XmlElement(name = "ValidFlag", nillable = true)
    protected String validFlag;

    /**
     * Gets the value of the allottedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllottedAmt() {
        return allottedAmt;
    }

    /**
     * Sets the value of the allottedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllottedAmt(String value) {
        this.allottedAmt = value;
    }

    /**
     * Gets the value of the allottedNav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllottedNav() {
        return allottedNav;
    }

    /**
     * Sets the value of the allottedNav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllottedNav(String value) {
        this.allottedNav = value;
    }

    /**
     * Gets the value of the allottedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllottedUnit() {
        return allottedUnit;
    }

    /**
     * Sets the value of the allottedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllottedUnit(String value) {
        this.allottedUnit = value;
    }

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
     * Gets the value of the beneficiaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    /**
     * Sets the value of the beneficiaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryId(String value) {
        this.beneficiaryId = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
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
     * Gets the value of the dpcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPCFlag() {
        return dpcFlag;
    }

    /**
     * Sets the value of the dpcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPCFlag(String value) {
        this.dpcFlag = value;
    }

    /**
     * Gets the value of the dpTrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTrans() {
        return dpTrans;
    }

    /**
     * Sets the value of the dpTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTrans(String value) {
        this.dpTrans = value;
    }

    /**
     * Gets the value of the euin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUIN() {
        return euin;
    }

    /**
     * Sets the value of the euin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUIN(String value) {
        this.euin = value;
    }

    /**
     * Gets the value of the euinDecl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUINDecl() {
        return euinDecl;
    }

    /**
     * Sets the value of the euinDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUINDecl(String value) {
        this.euinDecl = value;
    }

    /**
     * Gets the value of the folioNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNo() {
        return folioNo;
    }

    /**
     * Sets the value of the folioNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioNo(String value) {
        this.folioNo = value;
    }

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the internalRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRefNo() {
        return internalRefNo;
    }

    /**
     * Sets the value of the internalRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRefNo(String value) {
        this.internalRefNo = value;
    }

    /**
     * Gets the value of the kycFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCFlag() {
        return kycFlag;
    }

    /**
     * Sets the value of the kycFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCFlag(String value) {
        this.kycFlag = value;
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
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the rtaSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTASchemeCode() {
        return rtaSchemeCode;
    }

    /**
     * Sets the value of the rtaSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTASchemeCode(String value) {
        this.rtaSchemeCode = value;
    }

    /**
     * Gets the value of the rtaTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTATransNo() {
        return rtaTransNo;
    }

    /**
     * Sets the value of the rtaTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTATransNo(String value) {
        this.rtaTransNo = value;
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
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDate(String value) {
        this.reportDate = value;
    }

    /**
     * Gets the value of the sipRegnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPRegnDate() {
        return sipRegnDate;
    }

    /**
     * Sets the value of the sipRegnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPRegnDate(String value) {
        this.sipRegnDate = value;
    }

    /**
     * Gets the value of the sipRegnNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPRegnNo() {
        return sipRegnNo;
    }

    /**
     * Sets the value of the sipRegnNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPRegnNo(String value) {
        this.sipRegnNo = value;
    }

    /**
     * Gets the value of the stt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTT() {
        return stt;
    }

    /**
     * Sets the value of the stt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTT(String value) {
        this.stt = value;
    }

    /**
     * Gets the value of the schemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * Sets the value of the schemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCode(String value) {
        this.schemeCode = value;
    }

    /**
     * Gets the value of the settNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettNo() {
        return settNo;
    }

    /**
     * Sets the value of the settNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettNo(String value) {
        this.settNo = value;
    }

    /**
     * Gets the value of the settType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettType() {
        return settType;
    }

    /**
     * Sets the value of the settType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettType(String value) {
        this.settType = value;
    }

    /**
     * Gets the value of the subBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBrCode() {
        return subBrCode;
    }

    /**
     * Sets the value of the subBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBrCode(String value) {
        this.subBrCode = value;
    }

    /**
     * Gets the value of the subOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOrderType() {
        return subOrderType;
    }

    /**
     * Sets the value of the subOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOrderType(String value) {
        this.subOrderType = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the validFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * Sets the value of the validFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFlag(String value) {
        this.validFlag = value;
    }
    
    @Override
    public String toString() {
    	return allottedAmt + "|" + allottedNav + "|" + allottedUnit + "|" + amount + "|" + beneficiaryId + "|" + branchCode + "|" + clientCode + "|" + clientName + "|" + dpcFlag + "|" + dpTrans + "|" + euin + "|" + euinDecl + "|" + folioNo + "|" + isin + "|" + internalRefNo + "|" + kycFlag + "|" + memberCode + "|" + orderDate + "|" + orderNo + "|" + orderType + "|" + qty + "|" + rtaSchemeCode + "|" + rtaTransNo + "|" + remarks + "|" + reportDate + "|" + sipRegnDate + "|" + sipRegnNo + "|" + stt + "|" + schemeCode + "|" + settNo + "|" + settType + "|" + subBrCode + "|" + subOrderType + "|" + userId + "|" + validFlag;
    }
    
    public String toVerboseString() {
    	return "allottedAmt: " + allottedAmt + " | " +"allottedNav: " + allottedNav + " | " +"allottedUnit: " + allottedUnit + " | " +"amount: " + amount + " | " +"beneficiaryId: " + beneficiaryId + " | " +"branchCode: " + branchCode + " | " +"clientCode: " + clientCode + " | " +"clientName: " + clientName + " | " +"dpcFlag: " + dpcFlag + " | " +"dpTrans: " + dpTrans + " | " +"euin: " + euin + " | " +"euinDecl: " + euinDecl + " | " +"folioNo: " + folioNo + " | " +"isin: " + isin + " | " +"internalRefNo: " + internalRefNo + " | " +"kycFlag: " + kycFlag + " | " +"memberCode: " + memberCode + " | " +"orderDate: " + orderDate + " | " +"orderNo: " + orderNo + " | " +"orderType: " + orderType + " | " +"qty: " + qty + " | " +"rtaSchemeCode: " + rtaSchemeCode + " | " +"rtaTransNo: " + rtaTransNo + " | " +"remarks: " + remarks + " | " +"reportDate: " + reportDate + " | " +"sipRegnDate: " + sipRegnDate + " | " +"sipRegnNo: " + sipRegnNo + " | " +"stt: " + stt + " | " +"schemeCode: " + schemeCode + " | " +"settNo: " + settNo + " | " +"settType: " + settType + " | " +"subBrCode: " + subBrCode + " | " +"subOrderType: " + subOrderType + " | " +"userId: " + userId + " | " +"validFlag: " + validFlag;
    }
}
