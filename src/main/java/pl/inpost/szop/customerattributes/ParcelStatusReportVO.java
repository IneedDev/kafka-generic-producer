//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.customerattributes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for parcelStatusReportVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcelStatusReportVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineLocationDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcelStatusReportVO", propOrder = {
    "boxMachineName",
    "boxMachineLocationDesc",
    "parcelCode",
    "statusChangeDate"
})
public class ParcelStatusReportVO {

    protected String boxMachineName;
    protected String boxMachineLocationDesc;
    protected String parcelCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusChangeDate;

    /**
     * Gets the value of the boxMachineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxMachineName() {
        return boxMachineName;
    }

    /**
     * Sets the value of the boxMachineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxMachineName(String value) {
        this.boxMachineName = value;
    }

    /**
     * Gets the value of the boxMachineLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxMachineLocationDesc() {
        return boxMachineLocationDesc;
    }

    /**
     * Sets the value of the boxMachineLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxMachineLocationDesc(String value) {
        this.boxMachineLocationDesc = value;
    }

    /**
     * Gets the value of the parcelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelCode() {
        return parcelCode;
    }

    /**
     * Sets the value of the parcelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelCode(String value) {
        this.parcelCode = value;
    }

    /**
     * Gets the value of the statusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusChangeDate(XMLGregorianCalendar value) {
        this.statusChangeDate = value;
    }

}
