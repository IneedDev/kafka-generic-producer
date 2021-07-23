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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paymentTerminalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTerminalVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://facades.client.szop.positiveadvisory.pl/}paymentTerminalType" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountToReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionsCountToReport" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineStatus" type="{http://facades.client.szop.positiveadvisory.pl/}boxMachineStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTerminalVO", propOrder = {
    "name",
    "assignedTo",
    "postCode",
    "lastReportDate",
    "type",
    "boxMachineName",
    "terminalUserId",
    "agencyName",
    "amountToReport",
    "transactionsCountToReport",
    "boxMachineStatus"
})
public class PaymentTerminalVO {

    protected String name;
    protected String assignedTo;
    protected String postCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReportDate;
    @XmlSchemaType(name = "string")
    protected PaymentTerminalType type;
    protected String boxMachineName;
    protected String terminalUserId;
    protected List<String> agencyName;
    protected String amountToReport;
    protected Long transactionsCountToReport;
    @XmlSchemaType(name = "string")
    protected BoxMachineStatus boxMachineStatus;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedTo(String value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the lastReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReportDate() {
        return lastReportDate;
    }

    /**
     * Sets the value of the lastReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReportDate(XMLGregorianCalendar value) {
        this.lastReportDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerminalType }
     *     
     */
    public PaymentTerminalType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerminalType }
     *     
     */
    public void setType(PaymentTerminalType value) {
        this.type = value;
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
     * Gets the value of the terminalUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalUserId() {
        return terminalUserId;
    }

    /**
     * Sets the value of the terminalUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalUserId(String value) {
        this.terminalUserId = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgencyName() {
        if (agencyName == null) {
            agencyName = new ArrayList<String>();
        }
        return this.agencyName;
    }

    /**
     * Gets the value of the amountToReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountToReport() {
        return amountToReport;
    }

    /**
     * Sets the value of the amountToReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountToReport(String value) {
        this.amountToReport = value;
    }

    /**
     * Gets the value of the transactionsCountToReport property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionsCountToReport() {
        return transactionsCountToReport;
    }

    /**
     * Sets the value of the transactionsCountToReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionsCountToReport(Long value) {
        this.transactionsCountToReport = value;
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

}
