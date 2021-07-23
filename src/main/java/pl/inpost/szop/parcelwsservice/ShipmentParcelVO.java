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
 * <p>Java class for shipmentParcelVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipmentParcelVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipmentVO" type="{http://services.szop.inpost.pl/}shipmentVO" minOccurs="0"/&gt;
 *         &lt;element name="parcelType" type="{http://services.szop.inpost.pl/}deliveryPackType" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addresseeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalPhones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="codAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="scanned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="status" type="{http://services.szop.inpost.pl/}shipmentParcelStatus" minOccurs="0"/&gt;
 *         &lt;element name="lockLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lockTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="senderBoxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multipleParcelsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multipleParcelsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="waybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipmentParcelVO", propOrder = {
    "shipmentVO",
    "parcelType",
    "phone",
    "addresseeEmail",
    "customerReference",
    "additionalPhones",
    "insuranceAmount",
    "codAmount",
    "scanned",
    "status",
    "lockLogin",
    "lockTime",
    "senderBoxMachineName",
    "boxMachineName",
    "additional1",
    "additional2",
    "additional3",
    "validationMessage",
    "carrierReference",
    "multipleParcelsId",
    "multipleParcelsCount",
    "waybillNumber"
})
public class ShipmentParcelVO {

    protected ShipmentVO shipmentVO;
    @XmlSchemaType(name = "string")
    protected DeliveryPackType parcelType;
    protected String phone;
    protected String addresseeEmail;
    protected String customerReference;
    protected String additionalPhones;
    protected BigDecimal insuranceAmount;
    protected BigDecimal codAmount;
    protected boolean scanned;
    @XmlSchemaType(name = "string")
    protected ShipmentParcelStatus status;
    protected String lockLogin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockTime;
    protected String senderBoxMachineName;
    protected String boxMachineName;
    protected String additional1;
    protected String additional2;
    protected String additional3;
    protected String validationMessage;
    protected String carrierReference;
    protected String multipleParcelsId;
    protected Integer multipleParcelsCount;
    protected String waybillNumber;

    /**
     * Gets the value of the shipmentVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentVO }
     *     
     */
    public ShipmentVO getShipmentVO() {
        return shipmentVO;
    }

    /**
     * Sets the value of the shipmentVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentVO }
     *     
     */
    public void setShipmentVO(ShipmentVO value) {
        this.shipmentVO = value;
    }

    /**
     * Gets the value of the parcelType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPackType }
     *     
     */
    public DeliveryPackType getParcelType() {
        return parcelType;
    }

    /**
     * Sets the value of the parcelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPackType }
     *     
     */
    public void setParcelType(DeliveryPackType value) {
        this.parcelType = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the addresseeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeEmail() {
        return addresseeEmail;
    }

    /**
     * Sets the value of the addresseeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeEmail(String value) {
        this.addresseeEmail = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the additionalPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalPhones() {
        return additionalPhones;
    }

    /**
     * Sets the value of the additionalPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalPhones(String value) {
        this.additionalPhones = value;
    }

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceAmount(BigDecimal value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodAmount(BigDecimal value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the scanned property.
     * 
     */
    public boolean isScanned() {
        return scanned;
    }

    /**
     * Sets the value of the scanned property.
     * 
     */
    public void setScanned(boolean value) {
        this.scanned = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentParcelStatus }
     *     
     */
    public ShipmentParcelStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentParcelStatus }
     *     
     */
    public void setStatus(ShipmentParcelStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the lockLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockLogin() {
        return lockLogin;
    }

    /**
     * Sets the value of the lockLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockLogin(String value) {
        this.lockLogin = value;
    }

    /**
     * Gets the value of the lockTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockTime() {
        return lockTime;
    }

    /**
     * Sets the value of the lockTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockTime(XMLGregorianCalendar value) {
        this.lockTime = value;
    }

    /**
     * Gets the value of the senderBoxMachineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBoxMachineName() {
        return senderBoxMachineName;
    }

    /**
     * Sets the value of the senderBoxMachineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBoxMachineName(String value) {
        this.senderBoxMachineName = value;
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
     * Gets the value of the additional1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional1() {
        return additional1;
    }

    /**
     * Sets the value of the additional1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional1(String value) {
        this.additional1 = value;
    }

    /**
     * Gets the value of the additional2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional2() {
        return additional2;
    }

    /**
     * Sets the value of the additional2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional2(String value) {
        this.additional2 = value;
    }

    /**
     * Gets the value of the additional3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional3() {
        return additional3;
    }

    /**
     * Sets the value of the additional3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional3(String value) {
        this.additional3 = value;
    }

    /**
     * Gets the value of the validationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationMessage() {
        return validationMessage;
    }

    /**
     * Sets the value of the validationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationMessage(String value) {
        this.validationMessage = value;
    }

    /**
     * Gets the value of the carrierReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierReference() {
        return carrierReference;
    }

    /**
     * Sets the value of the carrierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierReference(String value) {
        this.carrierReference = value;
    }

    /**
     * Gets the value of the multipleParcelsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleParcelsId() {
        return multipleParcelsId;
    }

    /**
     * Sets the value of the multipleParcelsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleParcelsId(String value) {
        this.multipleParcelsId = value;
    }

    /**
     * Gets the value of the multipleParcelsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultipleParcelsCount() {
        return multipleParcelsCount;
    }

    /**
     * Sets the value of the multipleParcelsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultipleParcelsCount(Integer value) {
        this.multipleParcelsCount = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNumber(String value) {
        this.waybillNumber = value;
    }

}
