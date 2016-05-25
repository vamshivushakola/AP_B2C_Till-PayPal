
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetBalanceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Balance" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="BalanceTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BalanceHoldings" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "balance",
    "balanceTimeStamp",
    "balanceHoldings"
})
public class GetBalanceResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Balance", required = true)
    protected BasicAmountType balance;
    @XmlElement(name = "BalanceTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar balanceTimeStamp;
    @XmlElement(name = "BalanceHoldings")
    protected List<BasicAmountType> balanceHoldings;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBalance(BasicAmountType value) {
        this.balance = value;
    }

    /**
     * Gets the value of the balanceTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalanceTimeStamp() {
        return balanceTimeStamp;
    }

    /**
     * Sets the value of the balanceTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalanceTimeStamp(XMLGregorianCalendar value) {
        this.balanceTimeStamp = value;
    }

    /**
     * Gets the value of the balanceHoldings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceHoldings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceHoldings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicAmountType }
     * 
     * 
     */
    public List<BasicAmountType> getBalanceHoldings() {
        if (balanceHoldings == null) {
            balanceHoldings = new ArrayList<BasicAmountType>();
        }
        return this.balanceHoldings;
    }

}
