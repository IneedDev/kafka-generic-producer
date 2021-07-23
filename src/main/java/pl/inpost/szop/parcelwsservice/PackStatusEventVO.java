//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.parcelwsservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for packStatusEventVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packStatusEventVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldStatus" type="{http://services.szop.inpost.pl/}packStatus" minOccurs="0"/&gt;
 *         &lt;element name="newStatus" type="{http://services.szop.inpost.pl/}packStatus" minOccurs="0"/&gt;
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="originalChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="courierDocumentNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineSentAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="boxMachineSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="changeSequence" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="customerOperationDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineStatus" type="{http://services.szop.inpost.pl/}boxMachineStatus" minOccurs="0"/&gt;
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
@XmlType(name = "packStatusEventVO", propOrder = {
    "packCode",
    "oldStatus",
    "newStatus",
    "changeDate",
    "boxMachineTimestamp",
    "originalChangeDate",
    "courierDocumentNr",
    "boxMachineSentAttempts",
    "boxMachineSentDate",
    "changeSequence",
    "customerOperationDuration",
    "boxMachineName",
    "boxMachineStatus",
    "requestor"
})
public class PackStatusEventVO {

    protected String packCode;
    @XmlSchemaType(name = "string")
    protected PackStatus oldStatus;
    @XmlSchemaType(name = "string")
    protected PackStatus newStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boxMachineTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalChangeDate;
    protected String courierDocumentNr;
    protected int boxMachineSentAttempts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boxMachineSentDate;
    protected long changeSequence;
    protected BigDecimal customerOperationDuration;
    protected String boxMachineName;
    @XmlSchemaType(name = "string")
    protected BoxMachineStatus boxMachineStatus;
    protected RequestorVO requestor;

    /**
     * Gets the value of the packCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackCode() {
        return packCode;
    }

    /**
     * Sets the value of the packCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackCode(String value) {
        this.packCode = value;
    }

    /**
     * Gets the value of the oldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PackStatus }
     *     
     */
    public PackStatus getOldStatus() {
        return oldStatus;
    }

    /**
     * Sets the value of the oldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackStatus }
     *     
     */
    public void setOldStatus(PackStatus value) {
        this.oldStatus = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PackStatus }
     *     
     */
    public PackStatus getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackStatus }
     *     
     */
    public void setNewStatus(PackStatus value) {
        this.newStatus = value;
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
     * Gets the value of the boxMachineTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoxMachineTimestamp() {
        return boxMachineTimestamp;
    }

    /**
     * Sets the value of the boxMachineTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoxMachineTimestamp(XMLGregorianCalendar value) {
        this.boxMachineTimestamp = value;
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
     * Gets the value of the courierDocumentNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierDocumentNr() {
        return courierDocumentNr;
    }

    /**
     * Sets the value of the courierDocumentNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierDocumentNr(String value) {
        this.courierDocumentNr = value;
    }

    /**
     * Gets the value of the boxMachineSentAttempts property.
     * 
     */
    public int getBoxMachineSentAttempts() {
        return boxMachineSentAttempts;
    }

    /**
     * Sets the value of the boxMachineSentAttempts property.
     * 
     */
    public void setBoxMachineSentAttempts(int value) {
        this.boxMachineSentAttempts = value;
    }

    /**
     * Gets the value of the boxMachineSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoxMachineSentDate() {
        return boxMachineSentDate;
    }

    /**
     * Sets the value of the boxMachineSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoxMachineSentDate(XMLGregorianCalendar value) {
        this.boxMachineSentDate = value;
    }

    /**
     * Gets the value of the changeSequence property.
     * 
     */
    public long getChangeSequence() {
        return changeSequence;
    }

    /**
     * Sets the value of the changeSequence property.
     * 
     */
    public void setChangeSequence(long value) {
        this.changeSequence = value;
    }

    /**
     * Gets the value of the customerOperationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerOperationDuration() {
        return customerOperationDuration;
    }

    /**
     * Sets the value of the customerOperationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerOperationDuration(BigDecimal value) {
        this.customerOperationDuration = value;
    }

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
     * Gets the value of the boxMachineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BoxMachineStatus }
     *     
     */
    public BoxMachineStatus getBoxMachineStatus() {
        return boxMachineStatus;
    }

    /**
     * Sets the value of the boxMachineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxMachineStatus }
     *     
     */
    public void setBoxMachineStatus(BoxMachineStatus value) {
        this.boxMachineStatus = value;
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
