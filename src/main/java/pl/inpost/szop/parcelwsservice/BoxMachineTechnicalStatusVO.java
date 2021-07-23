//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.parcelwsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boxMachineTechnicalStatusVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boxMachineTechnicalStatusVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationDescription1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationDescription2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newTechnicalStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isBis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="status" type="{http://services.szop.inpost.pl/}boxMachineStatus" minOccurs="0"/&gt;
 *         &lt;element name="machineSeries" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="componentStatus" type="{http://services.szop.inpost.pl/}boxMachineComponentStatusVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boxMachineTechnicalStatusVO", propOrder = {
    "boxMachineName",
    "locationDescription",
    "locationDescription1",
    "locationDescription2",
    "newTechnicalStatus",
    "isBis",
    "status",
    "machineSeries",
    "componentStatus"
})
public class BoxMachineTechnicalStatusVO {

    protected String boxMachineName;
    protected String locationDescription;
    protected String locationDescription1;
    protected String locationDescription2;
    protected boolean newTechnicalStatus;
    protected boolean isBis;
    @XmlSchemaType(name = "string")
    protected BoxMachineStatus status;
    protected int machineSeries;
    protected List<BoxMachineComponentStatusVO> componentStatus;

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
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the locationDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription1() {
        return locationDescription1;
    }

    /**
     * Sets the value of the locationDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription1(String value) {
        this.locationDescription1 = value;
    }

    /**
     * Gets the value of the locationDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription2() {
        return locationDescription2;
    }

    /**
     * Sets the value of the locationDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription2(String value) {
        this.locationDescription2 = value;
    }

    /**
     * Gets the value of the newTechnicalStatus property.
     * 
     */
    public boolean isNewTechnicalStatus() {
        return newTechnicalStatus;
    }

    /**
     * Sets the value of the newTechnicalStatus property.
     * 
     */
    public void setNewTechnicalStatus(boolean value) {
        this.newTechnicalStatus = value;
    }

    /**
     * Gets the value of the isBis property.
     * 
     */
    public boolean isIsBis() {
        return isBis;
    }

    /**
     * Sets the value of the isBis property.
     * 
     */
    public void setIsBis(boolean value) {
        this.isBis = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BoxMachineStatus }
     *     
     */
    public BoxMachineStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxMachineStatus }
     *     
     */
    public void setStatus(BoxMachineStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the machineSeries property.
     * 
     */
    public int getMachineSeries() {
        return machineSeries;
    }

    /**
     * Sets the value of the machineSeries property.
     * 
     */
    public void setMachineSeries(int value) {
        this.machineSeries = value;
    }

    /**
     * Gets the value of the componentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxMachineComponentStatusVO }
     * 
     * 
     */
    public List<BoxMachineComponentStatusVO> getComponentStatus() {
        if (componentStatus == null) {
            componentStatus = new ArrayList<BoxMachineComponentStatusVO>();
        }
        return this.componentStatus;
    }

}
