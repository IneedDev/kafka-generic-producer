//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:21 PM CEST 
//


package pl.inpost.szop.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reverseReturnReportVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reverseReturnReportVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatorEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reverseReturnPackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversePackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="usedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="returnCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="senderPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversePackStatus" type="{http://facades.client.szop.positiveadvisory.pl/}packStatus" minOccurs="0"/&gt;
 *         &lt;element name="reverseReturnPackStatus" type="{http://facades.client.szop.positiveadvisory.pl/}packStatus" minOccurs="0"/&gt;
 *         &lt;element name="reversePackStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reverseReturnPackStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="labelAttached" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="returnDescription1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDescription2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDescription3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetAddress" type="{http://facades.client.szop.positiveadvisory.pl/}feDeliveryPackAddressVO" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="primaryParcelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reverseReturnClaimRaised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reverseClaimRaised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reverseReturnReportVO", propOrder = {
    "operatorEmail",
    "reverseReturnPackCode",
    "reversePackCode",
    "code",
    "rma",
    "active",
    "usedDate",
    "creationDate",
    "returnCreationDate",
    "senderPhone",
    "senderEmail",
    "reversePackStatus",
    "reverseReturnPackStatus",
    "reversePackStatusDate",
    "reverseReturnPackStatusDate",
    "labelAttached",
    "returnDescription1",
    "returnDescription2",
    "returnDescription3",
    "targetAddress",
    "expirationDate",
    "primaryParcelCode",
    "reverseReturnClaimRaised",
    "reverseClaimRaised"
})
public class ReverseReturnReportVO {

    protected String operatorEmail;
    protected String reverseReturnPackCode;
    protected String reversePackCode;
    protected long code;
    protected String rma;
    protected boolean active;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnCreationDate;
    protected String senderPhone;
    protected String senderEmail;
    @XmlSchemaType(name = "string")
    protected PackStatus reversePackStatus;
    @XmlSchemaType(name = "string")
    protected PackStatus reverseReturnPackStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reversePackStatusDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reverseReturnPackStatusDate;
    protected boolean labelAttached;
    protected String returnDescription1;
    protected String returnDescription2;
    protected String returnDescription3;
    protected FeDeliveryPackAddressVO targetAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String primaryParcelCode;
    protected Boolean reverseReturnClaimRaised;
    protected Boolean reverseClaimRaised;

    /**
     * Gets the value of the operatorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorEmail() {
        return operatorEmail;
    }

    /**
     * Sets the value of the operatorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorEmail(String value) {
        this.operatorEmail = value;
    }

    /**
     * Gets the value of the reverseReturnPackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseReturnPackCode() {
        return reverseReturnPackCode;
    }

    /**
     * Sets the value of the reverseReturnPackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseReturnPackCode(String value) {
        this.reverseReturnPackCode = value;
    }

    /**
     * Gets the value of the reversePackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversePackCode() {
        return reversePackCode;
    }

    /**
     * Sets the value of the reversePackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversePackCode(String value) {
        this.reversePackCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the rma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRma() {
        return rma;
    }

    /**
     * Sets the value of the rma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRma(String value) {
        this.rma = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the usedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsedDate() {
        return usedDate;
    }

    /**
     * Sets the value of the usedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsedDate(XMLGregorianCalendar value) {
        this.usedDate = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the returnCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnCreationDate() {
        return returnCreationDate;
    }

    /**
     * Sets the value of the returnCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnCreationDate(XMLGregorianCalendar value) {
        this.returnCreationDate = value;
    }

    /**
     * Gets the value of the senderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * Sets the value of the senderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhone(String value) {
        this.senderPhone = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the reversePackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PackStatus }
     *     
     */
    public PackStatus getReversePackStatus() {
        return reversePackStatus;
    }

    /**
     * Sets the value of the reversePackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackStatus }
     *     
     */
    public void setReversePackStatus(PackStatus value) {
        this.reversePackStatus = value;
    }

    /**
     * Gets the value of the reverseReturnPackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PackStatus }
     *     
     */
    public PackStatus getReverseReturnPackStatus() {
        return reverseReturnPackStatus;
    }

    /**
     * Sets the value of the reverseReturnPackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackStatus }
     *     
     */
    public void setReverseReturnPackStatus(PackStatus value) {
        this.reverseReturnPackStatus = value;
    }

    /**
     * Gets the value of the reversePackStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReversePackStatusDate() {
        return reversePackStatusDate;
    }

    /**
     * Sets the value of the reversePackStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReversePackStatusDate(XMLGregorianCalendar value) {
        this.reversePackStatusDate = value;
    }

    /**
     * Gets the value of the reverseReturnPackStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReverseReturnPackStatusDate() {
        return reverseReturnPackStatusDate;
    }

    /**
     * Sets the value of the reverseReturnPackStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReverseReturnPackStatusDate(XMLGregorianCalendar value) {
        this.reverseReturnPackStatusDate = value;
    }

    /**
     * Gets the value of the labelAttached property.
     * 
     */
    public boolean isLabelAttached() {
        return labelAttached;
    }

    /**
     * Sets the value of the labelAttached property.
     * 
     */
    public void setLabelAttached(boolean value) {
        this.labelAttached = value;
    }

    /**
     * Gets the value of the returnDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription1() {
        return returnDescription1;
    }

    /**
     * Sets the value of the returnDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription1(String value) {
        this.returnDescription1 = value;
    }

    /**
     * Gets the value of the returnDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription2() {
        return returnDescription2;
    }

    /**
     * Sets the value of the returnDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription2(String value) {
        this.returnDescription2 = value;
    }

    /**
     * Gets the value of the returnDescription3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription3() {
        return returnDescription3;
    }

    /**
     * Sets the value of the returnDescription3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription3(String value) {
        this.returnDescription3 = value;
    }

    /**
     * Gets the value of the targetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeDeliveryPackAddressVO }
     *     
     */
    public FeDeliveryPackAddressVO getTargetAddress() {
        return targetAddress;
    }

    /**
     * Sets the value of the targetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeDeliveryPackAddressVO }
     *     
     */
    public void setTargetAddress(FeDeliveryPackAddressVO value) {
        this.targetAddress = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the primaryParcelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryParcelCode() {
        return primaryParcelCode;
    }

    /**
     * Sets the value of the primaryParcelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryParcelCode(String value) {
        this.primaryParcelCode = value;
    }

    /**
     * Gets the value of the reverseReturnClaimRaised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseReturnClaimRaised() {
        return reverseReturnClaimRaised;
    }

    /**
     * Sets the value of the reverseReturnClaimRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseReturnClaimRaised(Boolean value) {
        this.reverseReturnClaimRaised = value;
    }

    /**
     * Gets the value of the reverseClaimRaised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseClaimRaised() {
        return reverseClaimRaised;
    }

    /**
     * Sets the value of the reverseClaimRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseClaimRaised(Boolean value) {
        this.reverseClaimRaised = value;
    }

}
