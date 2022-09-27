
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
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuySell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuySellType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPTxn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllUnitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedeemDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KYCStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubBroCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUINVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "transactionCode",
    "uniqueRefNo",
    "orderID",
    "userID",
    "memberId",
    "clientCode",
    "schemeCode",
    "buySell",
    "buySellType",
    "dpTxn",
    "orderValue",
    "redemptionAmt",
    "allUnitFlag",
    "redeemDate",
    "folioNo",
    "remarks",
    "kycStatus",
    "refNo",
    "subBroCode",
    "euin",
    "euinVal",
    "minRedeem",
    "dpc",
    "ipAddress",
    "password",
    "passKey",
    "param1",
    "param2",
    "param3"
})
@XmlRootElement(name = "spreadOrderEntryParam")
public class SpreadOrderEntryParam {

    @XmlElement(name = "TransactionCode", nillable = true)
    protected String transactionCode;
    @XmlElement(name = "UniqueRefNo", nillable = true)
    protected String uniqueRefNo;
    @XmlElement(name = "OrderID", nillable = true)
    protected String orderID;
    @XmlElement(name = "UserID", nillable = true)
    protected String userID;
    @XmlElement(name = "MemberId", nillable = true)
    protected String memberId;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "SchemeCode", nillable = true)
    protected String schemeCode;
    @XmlElement(name = "BuySell", nillable = true)
    protected String buySell;
    @XmlElement(name = "BuySellType", nillable = true)
    protected String buySellType;
    @XmlElement(name = "DPTxn", nillable = true)
    protected String dpTxn;
    @XmlElement(name = "OrderValue", nillable = true)
    protected String orderValue;
    @XmlElement(name = "RedemptionAmt", nillable = true)
    protected String redemptionAmt;
    @XmlElement(name = "AllUnitFlag", nillable = true)
    protected String allUnitFlag;
    @XmlElement(name = "RedeemDate", nillable = true)
    protected String redeemDate;
    @XmlElement(name = "FolioNo", nillable = true)
    protected String folioNo;
    @XmlElement(name = "Remarks", nillable = true)
    protected String remarks;
    @XmlElement(name = "KYCStatus", nillable = true)
    protected String kycStatus;
    @XmlElement(name = "RefNo", nillable = true)
    protected String refNo;
    @XmlElement(name = "SubBroCode", nillable = true)
    protected String subBroCode;
    @XmlElement(name = "EUIN", nillable = true)
    protected String euin;
    @XmlElement(name = "EUINVal", nillable = true)
    protected String euinVal;
    @XmlElement(name = "MinRedeem", nillable = true)
    protected String minRedeem;
    @XmlElement(name = "DPC", nillable = true)
    protected String dpc;
    @XmlElement(name = "IPAddress", nillable = true)
    protected String ipAddress;
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "PassKey", nillable = true)
    protected String passKey;
    @XmlElement(name = "Param1", nillable = true)
    protected String param1;
    @XmlElement(name = "Param2", nillable = true)
    protected String param2;
    @XmlElement(name = "Param3", nillable = true)
    protected String param3;

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the uniqueRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRefNo() {
        return uniqueRefNo;
    }

    /**
     * Sets the value of the uniqueRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRefNo(String value) {
        this.uniqueRefNo = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
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
     * Gets the value of the buySell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuySell() {
        return buySell;
    }

    /**
     * Sets the value of the buySell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuySell(String value) {
        this.buySell = value;
    }

    /**
     * Gets the value of the buySellType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuySellType() {
        return buySellType;
    }

    /**
     * Sets the value of the buySellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuySellType(String value) {
        this.buySellType = value;
    }

    /**
     * Gets the value of the dpTxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTxn() {
        return dpTxn;
    }

    /**
     * Sets the value of the dpTxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTxn(String value) {
        this.dpTxn = value;
    }

    /**
     * Gets the value of the orderValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderValue() {
        return orderValue;
    }

    /**
     * Sets the value of the orderValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderValue(String value) {
        this.orderValue = value;
    }

    /**
     * Gets the value of the redemptionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionAmt() {
        return redemptionAmt;
    }

    /**
     * Sets the value of the redemptionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionAmt(String value) {
        this.redemptionAmt = value;
    }

    /**
     * Gets the value of the allUnitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllUnitFlag() {
        return allUnitFlag;
    }

    /**
     * Sets the value of the allUnitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllUnitFlag(String value) {
        this.allUnitFlag = value;
    }

    /**
     * Gets the value of the redeemDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemDate() {
        return redeemDate;
    }

    /**
     * Sets the value of the redeemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemDate(String value) {
        this.redeemDate = value;
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
     * Gets the value of the kycStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCStatus() {
        return kycStatus;
    }

    /**
     * Sets the value of the kycStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCStatus(String value) {
        this.kycStatus = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

    /**
     * Gets the value of the subBroCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBroCode() {
        return subBroCode;
    }

    /**
     * Sets the value of the subBroCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBroCode(String value) {
        this.subBroCode = value;
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
     * Gets the value of the euinVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUINVal() {
        return euinVal;
    }

    /**
     * Sets the value of the euinVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUINVal(String value) {
        this.euinVal = value;
    }

    /**
     * Gets the value of the minRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinRedeem() {
        return minRedeem;
    }

    /**
     * Sets the value of the minRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRedeem(String value) {
        this.minRedeem = value;
    }

    /**
     * Gets the value of the dpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPC() {
        return dpc;
    }

    /**
     * Sets the value of the dpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPC(String value) {
        this.dpc = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassKey() {
        return passKey;
    }

    /**
     * Sets the value of the passKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassKey(String value) {
        this.passKey = value;
    }

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the param3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam3() {
        return param3;
    }

    /**
     * Sets the value of the param3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam3(String value) {
        this.param3 = value;
    }

}
