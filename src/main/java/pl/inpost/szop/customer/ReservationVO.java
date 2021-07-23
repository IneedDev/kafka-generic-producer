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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reservationVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservationVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationType" type="{http://facades.client.szop.positiveadvisory.pl/}reservationType" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeTimeslotName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeTimeslotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carrierName" type="{http://facades.client.szop.positiveadvisory.pl/}carrierName" minOccurs="0"/&gt;
 *         &lt;element name="ownerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reservationDateRange" type="{http://facades.client.szop.positiveadvisory.pl/}dateRangeVO" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://facades.client.szop.positiveadvisory.pl/}reservationStatus" minOccurs="0"/&gt;
 *         &lt;element name="onDeliveryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="reservationReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionType" type="{http://facades.client.szop.positiveadvisory.pl/}restrictionType" minOccurs="0"/&gt;
 *         &lt;element name="reservationCompartment" type="{http://facades.client.szop.positiveadvisory.pl/}reservationCompartmentVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationVO", propOrder = {
    "reservationType",
    "boxMachineName",
    "routeTimeslotName",
    "routeTimeslotNumber",
    "carrierName",
    "ownerEmail",
    "reservationNumber",
    "reservationDate",
    "creationDate",
    "approvalDate",
    "cancellationDate",
    "reservationDateRange",
    "status",
    "onDeliveryAmount",
    "reservationReference",
    "customerEmail",
    "customerPhone",
    "restrictionType",
    "reservationCompartment"
})
public class ReservationVO {

    @XmlSchemaType(name = "string")
    protected ReservationType reservationType;
    protected String boxMachineName;
    protected String routeTimeslotName;
    protected Integer routeTimeslotNumber;
    @XmlSchemaType(name = "string")
    protected CarrierName carrierName;
    protected String ownerEmail;
    protected String reservationNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    protected DateRangeVO reservationDateRange;
    @XmlSchemaType(name = "string")
    protected ReservationStatus status;
    protected BigDecimal onDeliveryAmount;
    protected String reservationReference;
    protected String customerEmail;
    protected String customerPhone;
    @XmlSchemaType(name = "string")
    protected RestrictionType restrictionType;
    protected List<ReservationCompartmentVO> reservationCompartment;

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationType }
     *     
     */
    public ReservationType getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationType }
     *     
     */
    public void setReservationType(ReservationType value) {
        this.reservationType = value;
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
     * Gets the value of the routeTimeslotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteTimeslotName() {
        return routeTimeslotName;
    }

    /**
     * Sets the value of the routeTimeslotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteTimeslotName(String value) {
        this.routeTimeslotName = value;
    }

    /**
     * Gets the value of the routeTimeslotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteTimeslotNumber() {
        return routeTimeslotNumber;
    }

    /**
     * Sets the value of the routeTimeslotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteTimeslotNumber(Integer value) {
        this.routeTimeslotNumber = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierName }
     *     
     */
    public CarrierName getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierName }
     *     
     */
    public void setCarrierName(CarrierName value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the ownerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * Sets the value of the ownerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerEmail(String value) {
        this.ownerEmail = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the reservationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationDate() {
        return reservationDate;
    }

    /**
     * Sets the value of the reservationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationDate(XMLGregorianCalendar value) {
        this.reservationDate = value;
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
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the reservationDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeVO }
     *     
     */
    public DateRangeVO getReservationDateRange() {
        return reservationDateRange;
    }

    /**
     * Sets the value of the reservationDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeVO }
     *     
     */
    public void setReservationDateRange(DateRangeVO value) {
        this.reservationDateRange = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatus }
     *     
     */
    public ReservationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatus }
     *     
     */
    public void setStatus(ReservationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the onDeliveryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnDeliveryAmount() {
        return onDeliveryAmount;
    }

    /**
     * Sets the value of the onDeliveryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnDeliveryAmount(BigDecimal value) {
        this.onDeliveryAmount = value;
    }

    /**
     * Gets the value of the reservationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationReference() {
        return reservationReference;
    }

    /**
     * Sets the value of the reservationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationReference(String value) {
        this.reservationReference = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
    }

    /**
     * Gets the value of the restrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestrictionType() {
        return restrictionType;
    }

    /**
     * Sets the value of the restrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestrictionType(RestrictionType value) {
        this.restrictionType = value;
    }

    /**
     * Gets the value of the reservationCompartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationCompartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationCompartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationCompartmentVO }
     * 
     * 
     */
    public List<ReservationCompartmentVO> getReservationCompartment() {
        if (reservationCompartment == null) {
            reservationCompartment = new ArrayList<ReservationCompartmentVO>();
        }
        return this.reservationCompartment;
    }

}
