//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.publicapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parcelStatusReportSortField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="parcelStatusReportSortField"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STATUS_CHANGE_DATE"/&gt;
 *     &lt;enumeration value="PACK_CODE"/&gt;
 *     &lt;enumeration value="LOCATION_DESCRIPTION"/&gt;
 *     &lt;enumeration value="BOX_MACHINE_NAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "parcelStatusReportSortField")
@XmlEnum
public enum ParcelStatusReportSortField {

    STATUS_CHANGE_DATE,
    PACK_CODE,
    LOCATION_DESCRIPTION,
    BOX_MACHINE_NAME;

    public String value() {
        return name();
    }

    public static ParcelStatusReportSortField fromValue(String v) {
        return valueOf(v);
    }

}
