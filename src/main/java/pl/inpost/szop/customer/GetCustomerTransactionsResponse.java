//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:21 PM CEST 
//


package pl.inpost.szop.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerTransactionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerTransactionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountTransactions" type="{http://facades.client.szop.positiveadvisory.pl/}pagingResultVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerTransactionsResponse", propOrder = {
    "accountTransactions"
})
public class GetCustomerTransactionsResponse {

    protected PagingResultVO accountTransactions;

    /**
     * Gets the value of the accountTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link PagingResultVO }
     *     
     */
    public PagingResultVO getAccountTransactions() {
        return accountTransactions;
    }

    /**
     * Sets the value of the accountTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingResultVO }
     *     
     */
    public void setAccountTransactions(PagingResultVO value) {
        this.accountTransactions = value;
    }

}
