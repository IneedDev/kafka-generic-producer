//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:21 PM CEST 
//


package pl.inpost.szop.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laundryProductByExtraServiceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laundryProductByExtraServiceVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extraServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extraServicePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laundryProductByExtraServiceVO", propOrder = {
    "extraServiceName",
    "extraServicePrice",
    "productName"
})
public class LaundryProductByExtraServiceVO {

    protected String extraServiceName;
    protected BigDecimal extraServicePrice;
    protected List<String> productName;

    /**
     * Gets the value of the extraServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraServiceName() {
        return extraServiceName;
    }

    /**
     * Sets the value of the extraServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraServiceName(String value) {
        this.extraServiceName = value;
    }

    /**
     * Gets the value of the extraServicePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraServicePrice() {
        return extraServicePrice;
    }

    /**
     * Sets the value of the extraServicePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraServicePrice(BigDecimal value) {
        this.extraServicePrice = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductName() {
        if (productName == null) {
            productName = new ArrayList<String>();
        }
        return this.productName;
    }

}
