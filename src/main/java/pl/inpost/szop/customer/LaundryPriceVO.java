//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:21 PM CEST 
//


package pl.inpost.szop.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laundryPriceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laundryPriceVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productServicePrice" type="{http://facades.client.szop.positiveadvisory.pl/}laundryProductServicePriceVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laundryPriceVO", propOrder = {
    "priceName",
    "customerEmail",
    "productServicePrice"
})
public class LaundryPriceVO {

    protected String priceName;
    protected List<String> customerEmail;
    protected List<LaundryProductServicePriceVO> productServicePrice;

    /**
     * Gets the value of the priceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceName() {
        return priceName;
    }

    /**
     * Sets the value of the priceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceName(String value) {
        this.priceName = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerEmail() {
        if (customerEmail == null) {
            customerEmail = new ArrayList<String>();
        }
        return this.customerEmail;
    }

    /**
     * Gets the value of the productServicePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productServicePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductServicePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaundryProductServicePriceVO }
     * 
     * 
     */
    public List<LaundryProductServicePriceVO> getProductServicePrice() {
        if (productServicePrice == null) {
            productServicePrice = new ArrayList<LaundryProductServicePriceVO>();
        }
        return this.productServicePrice;
    }

}
