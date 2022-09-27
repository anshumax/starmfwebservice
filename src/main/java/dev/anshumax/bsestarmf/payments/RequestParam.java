
package dev.anshumax.bsestarmf.payments;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IFSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogOutURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orders" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestParam", namespace = "http://schemas.datacontract.org/2004/07/StarMFPaymentGatewayService", propOrder = {
    "accNo",
    "bankID",
    "clientCode",
    "encryptedPassword",
    "ifsc",
    "logOutURL",
    "memberCode",
    "mode",
    "orders",
    "totalAmount"
})
public class RequestParam {

    @XmlElement(name = "AccNo", nillable = true)
    protected String accNo;
    @XmlElement(name = "BankID", nillable = true)
    protected String bankID;
    @XmlElement(name = "ClientCode", nillable = true)
    protected String clientCode;
    @XmlElement(name = "EncryptedPassword", nillable = true)
    protected String encryptedPassword;
    @XmlElement(name = "IFSC", nillable = true)
    protected String ifsc;
    @XmlElement(name = "LogOutURL", nillable = true)
    protected String logOutURL;
    @XmlElement(name = "MemberCode", nillable = true)
    protected String memberCode;
    @XmlElement(name = "Mode", nillable = true)
    protected String mode;
    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfstring orders;
    @XmlElement(name = "TotalAmount", nillable = true)
    protected String totalAmount;

    /**
     * Gets the value of the accNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * Sets the value of the accNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNo(String value) {
        this.accNo = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
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
     * Gets the value of the encryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * Sets the value of the encryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPassword(String value) {
        this.encryptedPassword = value;
    }

    /**
     * Gets the value of the ifsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFSC() {
        return ifsc;
    }

    /**
     * Sets the value of the ifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFSC(String value) {
        this.ifsc = value;
    }

    /**
     * Gets the value of the logOutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOutURL() {
        return logOutURL;
    }

    /**
     * Sets the value of the logOutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOutURL(String value) {
        this.logOutURL = value;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOrders(ArrayOfstring value) {
        this.orders = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

}
