//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.customerattributes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnosticOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="diagnosticOrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Requesting"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Downloading"/&gt;
 *     &lt;enumeration value="Downloaded"/&gt;
 *     &lt;enumeration value="DownloadAborted"/&gt;
 *     &lt;enumeration value="Deleting"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "diagnosticOrderStatus")
@XmlEnum
public enum DiagnosticOrderStatus {

    @XmlEnumValue("Requesting")
    REQUESTING("Requesting"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Downloading")
    DOWNLOADING("Downloading"),
    @XmlEnumValue("Downloaded")
    DOWNLOADED("Downloaded"),
    @XmlEnumValue("DownloadAborted")
    DOWNLOAD_ABORTED("DownloadAborted"),
    @XmlEnumValue("Deleting")
    DELETING("Deleting"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    DiagnosticOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticOrderStatus fromValue(String v) {
        for (DiagnosticOrderStatus c: DiagnosticOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
