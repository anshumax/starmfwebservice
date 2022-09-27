
package dev.anshumax.bsestarmf.additionalservices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALLUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuySell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuySellType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPFolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUINDecl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntryBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KYCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MINRedeemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIPRegnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIPRegnNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchemeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubBrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubBrokerARNCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetails", propOrder = {
    "allUnits",
    "amount",
    "buySell",
    "buySellType",
    "clientCode",
    "clientName",
    "dpc",
    "dpFolioNo",
    "dpTrans",
    "date",
    "euin",
    "euinDecl",
    "entryBy",
    "firstOrder",
    "folioNo",
    "isin",
    "internalRefNo",
    "kycFlag",
    "minRedeemFlag",
    "memberCode",
    "memberRemarks",
    "orderNumber",
    "orderRemarks",
    "orderStatus",
    "orderType",
    "sipRegnDate",
    "sipRegnNo",
    "schemeCode",
    "schemeName",
    "settNo",
    "settType",
    "subBrCode",
    "subBrokerARNCode",
    "subOrderType",
    "time",
    "units"
})
public class OrderDetails {

    @XmlElement(name = "ALLUnits", nillable = true)
    protected String allUnits;
    @XmlElement(name = "Amount", nillable = true)
    protected String amount;
    @XmlElement(name = "BuySell", nillable = true)
    protected String buySell;
    @XmlElement(name = "BuySellType", nillable = true)
    protected String buySellType;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "ClientName", nillable = true)
    protected String clientName;
    @XmlElement(name = "DPC", nillable = true)
    protected String dpc;
    @XmlElement(name = "DPFolioNo", nillable = true)
    protected String dpFolioNo;
    @XmlElement(name = "DPTrans", nillable = true)
    protected String dpTrans;
    @XmlElement(name = "Date", nillable = true)
    protected String date;
    @XmlElement(name = "EUIN", nillable = true)
    protected String euin;
    @XmlElement(name = "EUINDecl", nillable = true)
    protected String euinDecl;
    @XmlElement(name = "EntryBy", nillable = true)
    protected String entryBy;
    @XmlElement(name = "FirstOrder", nillable = true)
    protected String firstOrder;
    @XmlElement(name = "FolioNo", nillable = true)
    protected String folioNo;
    @XmlElement(name = "ISIN", nillable = true)
    protected String isin;
    @XmlElement(name = "InternalRefNo", nillable = true)
    protected String internalRefNo;
    @XmlElement(name = "KYCFlag", nillable = true)
    protected String kycFlag;
    @XmlElement(name = "MINRedeemFlag", nillable = true)
    protected String minRedeemFlag;
    @XmlElement(name = "MemberCode", nillable = true)
    protected String memberCode;
    @XmlElement(name = "MemberRemarks", nillable = true)
    protected String memberRemarks;
    @XmlElement(name = "OrderNumber", nillable = true)
    protected String orderNumber;
    @XmlElement(name = "OrderRemarks", nillable = true)
    protected String orderRemarks;
    @XmlElement(name = "OrderStatus", nillable = true)
    protected String orderStatus;
    @XmlElement(name = "OrderType", nillable = true)
    protected String orderType;
    @XmlElement(name = "SIPRegnDate", nillable = true)
    protected String sipRegnDate;
    @XmlElement(name = "SIPRegnNo", nillable = true)
    protected String sipRegnNo;
    @XmlElement(name = "SchemeCode", nillable = true)
    protected String schemeCode;
    @XmlElement(name = "SchemeName", nillable = true)
    protected String schemeName;
    @XmlElement(name = "SettNo", nillable = true)
    protected String settNo;
    @XmlElement(name = "SettType", nillable = true)
    protected String settType;
    @XmlElement(name = "SubBrCode", nillable = true)
    protected String subBrCode;
    @XmlElement(name = "SubBrokerARNCode", nillable = true)
    protected String subBrokerARNCode;
    @XmlElement(name = "SubOrderType", nillable = true)
    protected String subOrderType;
    @XmlElement(name = "Time", nillable = true)
    protected String time;
    @XmlElement(name = "Units", nillable = true)
    protected String units;

    /**
     * Gets the value of the allUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLUnits() {
        return allUnits;
    }

    /**
     * Sets the value of the allUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLUnits(String value) {
        this.allUnits = value;
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
     * Gets the value of the dpFolioNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPFolioNo() {
        return dpFolioNo;
    }

    /**
     * Sets the value of the dpFolioNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPFolioNo(String value) {
        this.dpFolioNo = value;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * Gets the value of the entryBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryBy() {
        return entryBy;
    }

    /**
     * Sets the value of the entryBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryBy(String value) {
        this.entryBy = value;
    }

    /**
     * Gets the value of the firstOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOrder() {
        return firstOrder;
    }

    /**
     * Sets the value of the firstOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOrder(String value) {
        this.firstOrder = value;
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
     * Gets the value of the minRedeemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINRedeemFlag() {
        return minRedeemFlag;
    }

    /**
     * Sets the value of the minRedeemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINRedeemFlag(String value) {
        this.minRedeemFlag = value;
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
     * Gets the value of the memberRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberRemarks() {
        return memberRemarks;
    }

    /**
     * Sets the value of the memberRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberRemarks(String value) {
        this.memberRemarks = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRemarks() {
        return orderRemarks;
    }

    /**
     * Sets the value of the orderRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRemarks(String value) {
        this.orderRemarks = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
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
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeName(String value) {
        this.schemeName = value;
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
     * Gets the value of the subBrokerARNCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBrokerARNCode() {
        return subBrokerARNCode;
    }

    /**
     * Sets the value of the subBrokerARNCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBrokerARNCode(String value) {
        this.subBrokerARNCode = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }
    
    public String prettyPrint() {
    	return "allUnits: " + allUnits + " | " +     "amount: " + amount + " | " +     "buySell: " + buySell + " | " +     "buySellType: " + buySellType + " | " +     "clientCode: " + clientCode + " | " +     "clientName: " + clientName + " | " +     "dpc: " + dpc + " | " +     "dpFolioNo: " + dpFolioNo + " | " +     "dpTrans: " + dpTrans + " | " +     "date: " + date + " | " +     "euin: " + euin + " | " +     "euinDecl: " + euinDecl + " | " +     "entryBy: " + entryBy + " | " +     "firstOrder: " + firstOrder + " | " +     "folioNo: " + folioNo + " | " +     "isin: " + isin + " | " +     "internalRefNo: " + internalRefNo + " | " +     "kycFlag: " + kycFlag + " | " +     "minRedeemFlag: " + minRedeemFlag + " | " +     "memberCode: " + memberCode + " | " +     "memberRemarks: " + memberRemarks + " | " +     "orderNumber: " + orderNumber + " | " +     "orderRemarks: " + orderRemarks + " | " +     "orderStatus: " + orderStatus + " | " +     "orderType: " + orderType + " | " +     "sipRegnDate: " + sipRegnDate + " | " +     "sipRegnNo: " + sipRegnNo + " | " +     "schemeCode: " + schemeCode + " | " +     "schemeName: " + schemeName + " | " +     "settNo: " + settNo + " | " +     "settType: " + settType + " | " +     "subBrCode: " + subBrCode + " | " +     "subBrokerARNCode: " + subBrokerARNCode + " | " +     "subOrderType: " + subOrderType + " | " +     "time: " + time + " | " +     "units: " + units;
    }

	@Override
	public String toString() {
		return allUnits + "; " + amount + "; " + buySell + "; " + buySellType + "; " + clientCode + "; " + clientName
				+ "; " + dpc + "; " + dpFolioNo + "; " + dpTrans + "; " + date + "; " + euin + "; " + euinDecl + "; "
				+ entryBy + "; " + firstOrder + "; " + folioNo + "; " + isin + "; " + internalRefNo + "; " + kycFlag
				+ "; " + minRedeemFlag + "; " + memberCode + "; " + memberRemarks + "; " + orderNumber + "; "
				+ orderRemarks + "; " + orderStatus + "; " + orderType + "; " + sipRegnDate + "; " + sipRegnNo + "; "
				+ schemeCode + "; " + schemeName + "; " + settNo + "; " + settType + "; " + subBrCode + "; "
				+ subBrokerARNCode + "; " + subOrderType + "; " + time + "; " + units;
	}
    

}
