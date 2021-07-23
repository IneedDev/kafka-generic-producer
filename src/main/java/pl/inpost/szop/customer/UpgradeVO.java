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
 * <p>Java class for upgradeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upgradeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upgradePackVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upgradePackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://facades.client.szop.positiveadvisory.pl/}upgradeStatus" minOccurs="0"/&gt;
 *         &lt;element name="readiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="prepared" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upgradeVO", propOrder = {
    "upgradePackVersion",
    "upgradePackDescription",
    "groupName",
    "groupCode",
    "date",
    "status",
    "readiness",
    "activeChangeDate",
    "prepared"
})
public class UpgradeVO {

    protected String upgradePackVersion;
    protected String upgradePackDescription;
    protected String groupName;
    protected String groupCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "string")
    protected UpgradeStatus status;
    protected String readiness;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeChangeDate;
    protected boolean prepared;

    /**
     * Gets the value of the upgradePackVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradePackVersion() {
        return upgradePackVersion;
    }

    /**
     * Sets the value of the upgradePackVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradePackVersion(String value) {
        this.upgradePackVersion = value;
    }

    /**
     * Gets the value of the upgradePackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradePackDescription() {
        return upgradePackDescription;
    }

    /**
     * Sets the value of the upgradePackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradePackDescription(String value) {
        this.upgradePackDescription = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeStatus }
     *     
     */
    public UpgradeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeStatus }
     *     
     */
    public void setStatus(UpgradeStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the readiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadiness() {
        return readiness;
    }

    /**
     * Sets the value of the readiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadiness(String value) {
        this.readiness = value;
    }

    /**
     * Gets the value of the activeChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveChangeDate() {
        return activeChangeDate;
    }

    /**
     * Sets the value of the activeChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveChangeDate(XMLGregorianCalendar value) {
        this.activeChangeDate = value;
    }

    /**
     * Gets the value of the prepared property.
     * 
     */
    public boolean isPrepared() {
        return prepared;
    }

    /**
     * Sets the value of the prepared property.
     * 
     */
    public void setPrepared(boolean value) {
        this.prepared = value;
    }

}
