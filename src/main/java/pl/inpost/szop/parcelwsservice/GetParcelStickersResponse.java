//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.parcelwsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getParcelStickersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getParcelStickersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="printout" type="{http://services.szop.inpost.pl/}parcelStickersResultVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getParcelStickersResponse", propOrder = {
    "printout"
})
public class GetParcelStickersResponse {

    protected ParcelStickersResultVO printout;

    /**
     * Gets the value of the printout property.
     * 
     * @return
     *     possible object is
     *     {@link ParcelStickersResultVO }
     *     
     */
    public ParcelStickersResultVO getPrintout() {
        return printout;
    }

    /**
     * Sets the value of the printout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcelStickersResultVO }
     *     
     */
    public void setPrintout(ParcelStickersResultVO value) {
        this.printout = value;
    }

}
