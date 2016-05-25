
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoNonReferencedCreditRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoNonReferencedCreditRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoNonReferencedCreditRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoNonReferencedCreditRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "doNonReferencedCreditRequestDetails"
})
public class DoNonReferencedCreditRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DoNonReferencedCreditRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails;

    /**
     * Gets the value of the doNonReferencedCreditRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoNonReferencedCreditRequestDetailsType }
     *     
     */
    public DoNonReferencedCreditRequestDetailsType getDoNonReferencedCreditRequestDetails() {
        return doNonReferencedCreditRequestDetails;
    }

    /**
     * Sets the value of the doNonReferencedCreditRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoNonReferencedCreditRequestDetailsType }
     *     
     */
    public void setDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType value) {
        this.doNonReferencedCreditRequestDetails = value;
    }

}
