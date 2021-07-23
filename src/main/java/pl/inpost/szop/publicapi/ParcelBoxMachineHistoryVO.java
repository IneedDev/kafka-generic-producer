//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.publicapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for parcelBoxMachineHistoryVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcelBoxMachineHistoryVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldBoxMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBoxMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="originalChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="requestor" type="{http://services.szop.inpost.pl/}requestorVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcelBoxMachineHistoryVO", propOrder = {
    "parcelCode",
    "oldBoxMachine",
    "newBoxMachine",
    "context",
    "changeDate",
    "originalChangeDate",
    "requestor"
})
public class ParcelBoxMachineHistoryVO {

    protected String parcelCode;
    protected String oldBoxMachine;
    protected String newBoxMachine;
    protected String context;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalChangeDate;
    protected RequestorVO requestor;

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
     * Gets the value of the oldBoxMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBoxMachine() {
        return oldBoxMachine;
    }

    /**
     * Sets the value of the oldBoxMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBoxMachine(String value) {
        this.oldBoxMachine = value;
    }

    /**
     * Gets the value of the newBoxMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBoxMachine() {
        return newBoxMachine;
    }

    /**
     * Sets the value of the newBoxMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBoxMachine(String value) {
        this.newBoxMachine = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the originalChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalChangeDate() {
        return originalChangeDate;
    }

    /**
     * Sets the value of the originalChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalChangeDate(XMLGregorianCalendar value) {
        this.originalChangeDate = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorVO }
     *     
     */
    public RequestorVO getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorVO }
     *     
     */
    public void setRequestor(RequestorVO value) {
        this.requestor = value;
    }

}