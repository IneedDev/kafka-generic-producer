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
 * <p>Java class for parcelCodeDefinitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="parcelCodeDefinitionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exact"/&gt;
 *     &lt;enumeration value="RegExp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "parcelCodeDefinitionType")
@XmlEnum
public enum ParcelCodeDefinitionType {

    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("RegExp")
    REG_EXP("RegExp");
    private final String value;

    ParcelCodeDefinitionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParcelCodeDefinitionType fromValue(String v) {
        for (ParcelCodeDefinitionType c: ParcelCodeDefinitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
