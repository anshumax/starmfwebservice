
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
 *         &lt;element name="SchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DpTxnMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoOfInstallment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstOrderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Euin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EuinVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "schemeCode",
    "memberCode",
    "clientCode",
    "userID",
    "internalRefNo",
    "transMode",
    "dpTxnMode",
    "startDate",
    "frequencyType",
    "frequencyAllowed",
    "installmentAmount",
    "noOfInstallment",
    "remarks",
    "folioNo",
    "firstOrderFlag",
    "subberCode",
    "euin",
    "euinVal",
    "dpc",
    "regId",
    "ipAdd",
    "password",
    "passKey",
    "param1",
    "param2",
    "param3"
})
@XmlRootElement(name = "sipOrderEntryParam")
public class SipOrderEntryParam {

    @XmlElement(name = "TransactionCode", nillable = true)
    protected String transactionCode;
    @XmlElement(name = "UniqueRefNo", nillable = true)
    protected String uniqueRefNo;
    @XmlElement(name = "SchemeCode", nillable = true)
    protected String schemeCode;
    @XmlElement(name = "MemberCode", nillable = true)
    protected String memberCode;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "UserID", nillable = true)
    protected String userID;
    @XmlElement(name = "InternalRefNo", nillable = true)
    protected String internalRefNo;
    @XmlElement(name = "TransMode", nillable = true)
    protected String transMode;
    @XmlElement(name = "DpTxnMode", nillable = true)
    protected String dpTxnMode;
    @XmlElement(name = "StartDate", nillable = true)
    protected String startDate;
    @XmlElement(name = "FrequencyType", nillable = true)
    protected String frequencyType;
    @XmlElement(name = "FrequencyAllowed", nillable = true)
    protected String frequencyAllowed;
    @XmlElement(name = "InstallmentAmount", nillable = true)
    protected String installmentAmount;
    @XmlElement(name = "NoOfInstallment", nillable = true)
    protected String noOfInstallment;
    @XmlElement(name = "Remarks", nillable = true)
    protected String remarks;
    @XmlElement(name = "FolioNo", nillable = true)
    protected String folioNo;
    @XmlElement(name = "FirstOrderFlag", nillable = true)
    protected String firstOrderFlag;
    @XmlElement(name = "SubberCode", nillable = true)
    protected String subberCode;
    @XmlElement(name = "Euin", nillable = true)
    protected String euin;
    @XmlElement(name = "EuinVal", nillable = true)
    protected String euinVal;
    @XmlElement(name = "DPC", nillable = true)
    protected String dpc;
    @XmlElement(name = "RegId", nillable = true)
    protected String regId;
    @XmlElement(name = "IPAdd", nillable = true)
    protected String ipAdd;
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
     * Gets the value of the transMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransMode() {
        return transMode;
    }

    /**
     * Sets the value of the transMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransMode(String value) {
        this.transMode = value;
    }

    /**
     * Gets the value of the dpTxnMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpTxnMode() {
        return dpTxnMode;
    }

    /**
     * Sets the value of the dpTxnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpTxnMode(String value) {
        this.dpTxnMode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyType(String value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the frequencyAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyAllowed() {
        return frequencyAllowed;
    }

    /**
     * Sets the value of the frequencyAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyAllowed(String value) {
        this.frequencyAllowed = value;
    }

    /**
     * Gets the value of the installmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentAmount(String value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the noOfInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfInstallment() {
        return noOfInstallment;
    }

    /**
     * Sets the value of the noOfInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfInstallment(String value) {
        this.noOfInstallment = value;
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
     * Gets the value of the firstOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOrderFlag() {
        return firstOrderFlag;
    }

    /**
     * Sets the value of the firstOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOrderFlag(String value) {
        this.firstOrderFlag = value;
    }

    /**
     * Gets the value of the subberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubberCode() {
        return subberCode;
    }

    /**
     * Sets the value of the subberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubberCode(String value) {
        this.subberCode = value;
    }

    /**
     * Gets the value of the euin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuin() {
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
    public void setEuin(String value) {
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
    public String getEuinVal() {
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
    public void setEuinVal(String value) {
        this.euinVal = value;
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
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegId(String value) {
        this.regId = value;
    }

    /**
     * Gets the value of the ipAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdd() {
        return ipAdd;
    }

    /**
     * Sets the value of the ipAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAdd(String value) {
        this.ipAdd = value;
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
