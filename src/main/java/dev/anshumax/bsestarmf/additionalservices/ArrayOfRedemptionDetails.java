
package dev.anshumax.bsestarmf.additionalservices;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRedemptionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRedemptionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RedemptionDetails" type="{http://schemas.datacontract.org/2004/07/StarMFWebService}RedemptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRedemptionDetails", propOrder = {
    "redemptionDetails"
})
public class ArrayOfRedemptionDetails {

    @XmlElement(name = "RedemptionDetails", nillable = true)
    protected List<RedemptionDetails> redemptionDetails;

    /**
     * Gets the value of the redemptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionDetails }
     * 
     * 
     */
    public List<RedemptionDetails> getRedemptionDetails() {
        if (redemptionDetails == null) {
            redemptionDetails = new ArrayList<RedemptionDetails>();
        }
        return this.redemptionDetails;
    }

}
