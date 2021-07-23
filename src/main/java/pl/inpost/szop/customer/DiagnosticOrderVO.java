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
 * <p>Java class for diagnosticOrderVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnosticOrderVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diagnosticOrderType" type="{http://facades.client.szop.positiveadvisory.pl/}diagnosticOrderType" minOccurs="0"/&gt;
 *         &lt;element name="lastStatusChange" type="{http://facades.client.szop.positiveadvisory.pl/}diagnosticOrderStatusChangeVO" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="boxMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downloadMode" type="{http://facades.client.szop.positiveadvisory.pl/}downloadMode" minOccurs="0"/&gt;
 *         &lt;element name="autoDownloadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="downloadedSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="estimatedSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="actualSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="videoCamera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="photoDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="photoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="photoInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localDownloadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="downloadedOrderUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileMD5Hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ftpDeleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnosticOrderVO", propOrder = {
    "orderId",
    "diagnosticOrderType",
    "lastStatusChange",
    "creationDate",
    "boxMachineName",
    "downloadMode",
    "autoDownloadDate",
    "downloadedSize",
    "estimatedSize",
    "actualSize",
    "fileName",
    "description",
    "startDate",
    "endDate",
    "videoCamera",
    "photoDate",
    "photoCount",
    "photoInterval",
    "localDownloadDate",
    "downloadedOrderUrl",
    "fileMD5Hash",
    "ftpDeleteDate"
})
public class DiagnosticOrderVO {

    protected String orderId;
    @XmlSchemaType(name = "string")
    protected DiagnosticOrderType diagnosticOrderType;
    protected DiagnosticOrderStatusChangeVO lastStatusChange;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String boxMachineName;
    @XmlSchemaType(name = "string")
    protected DownloadMode downloadMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autoDownloadDate;
    protected Long downloadedSize;
    protected Long estimatedSize;
    protected Long actualSize;
    protected String fileName;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Integer videoCamera;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar photoDate;
    protected Integer photoCount;
    protected Integer photoInterval;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localDownloadDate;
    protected String downloadedOrderUrl;
    protected String fileMD5Hash;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ftpDeleteDate;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the diagnosticOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderType }
     *     
     */
    public DiagnosticOrderType getDiagnosticOrderType() {
        return diagnosticOrderType;
    }

    /**
     * Sets the value of the diagnosticOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderType }
     *     
     */
    public void setDiagnosticOrderType(DiagnosticOrderType value) {
        this.diagnosticOrderType = value;
    }

    /**
     * Gets the value of the lastStatusChange property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderStatusChangeVO }
     *     
     */
    public DiagnosticOrderStatusChangeVO getLastStatusChange() {
        return lastStatusChange;
    }

    /**
     * Sets the value of the lastStatusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderStatusChangeVO }
     *     
     */
    public void setLastStatusChange(DiagnosticOrderStatusChangeVO value) {
        this.lastStatusChange = value;
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
     * Gets the value of the downloadMode property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadMode }
     *     
     */
    public DownloadMode getDownloadMode() {
        return downloadMode;
    }

    /**
     * Sets the value of the downloadMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadMode }
     *     
     */
    public void setDownloadMode(DownloadMode value) {
        this.downloadMode = value;
    }

    /**
     * Gets the value of the autoDownloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoDownloadDate() {
        return autoDownloadDate;
    }

    /**
     * Sets the value of the autoDownloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoDownloadDate(XMLGregorianCalendar value) {
        this.autoDownloadDate = value;
    }

    /**
     * Gets the value of the downloadedSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDownloadedSize() {
        return downloadedSize;
    }

    /**
     * Sets the value of the downloadedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDownloadedSize(Long value) {
        this.downloadedSize = value;
    }

    /**
     * Gets the value of the estimatedSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedSize() {
        return estimatedSize;
    }

    /**
     * Sets the value of the estimatedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedSize(Long value) {
        this.estimatedSize = value;
    }

    /**
     * Gets the value of the actualSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualSize() {
        return actualSize;
    }

    /**
     * Sets the value of the actualSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualSize(Long value) {
        this.actualSize = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the videoCamera property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVideoCamera() {
        return videoCamera;
    }

    /**
     * Sets the value of the videoCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVideoCamera(Integer value) {
        this.videoCamera = value;
    }

    /**
     * Gets the value of the photoDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPhotoDate() {
        return photoDate;
    }

    /**
     * Sets the value of the photoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPhotoDate(XMLGregorianCalendar value) {
        this.photoDate = value;
    }

    /**
     * Gets the value of the photoCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhotoCount() {
        return photoCount;
    }

    /**
     * Sets the value of the photoCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhotoCount(Integer value) {
        this.photoCount = value;
    }

    /**
     * Gets the value of the photoInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhotoInterval() {
        return photoInterval;
    }

    /**
     * Sets the value of the photoInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhotoInterval(Integer value) {
        this.photoInterval = value;
    }

    /**
     * Gets the value of the localDownloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalDownloadDate() {
        return localDownloadDate;
    }

    /**
     * Sets the value of the localDownloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalDownloadDate(XMLGregorianCalendar value) {
        this.localDownloadDate = value;
    }

    /**
     * Gets the value of the downloadedOrderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadedOrderUrl() {
        return downloadedOrderUrl;
    }

    /**
     * Sets the value of the downloadedOrderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadedOrderUrl(String value) {
        this.downloadedOrderUrl = value;
    }

    /**
     * Gets the value of the fileMD5Hash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileMD5Hash() {
        return fileMD5Hash;
    }

    /**
     * Sets the value of the fileMD5Hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileMD5Hash(String value) {
        this.fileMD5Hash = value;
    }

    /**
     * Gets the value of the ftpDeleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFtpDeleteDate() {
        return ftpDeleteDate;
    }

    /**
     * Sets the value of the ftpDeleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFtpDeleteDate(XMLGregorianCalendar value) {
        this.ftpDeleteDate = value;
    }

}
