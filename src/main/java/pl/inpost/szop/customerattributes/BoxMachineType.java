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
 * <p>Java class for boxMachineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="boxMachineType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="physical"/&gt;
 *     &lt;enumeration value="postOffice"/&gt;
 *     &lt;enumeration value="address"/&gt;
 *     &lt;enumeration value="customerServicePoint"/&gt;
 *     &lt;enumeration value="incoming"/&gt;
 *     &lt;enumeration value="temporary"/&gt;
 *     &lt;enumeration value="internationalShippingPlatform"/&gt;
 *     &lt;enumeration value="temporaryCustomerServicePoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "boxMachineType")
@XmlEnum
public enum BoxMachineType {

    @XmlEnumValue("physical")
    PHYSICAL("physical"),
    @XmlEnumValue("postOffice")
    POST_OFFICE("postOffice"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("customerServicePoint")
    CUSTOMER_SERVICE_POINT("customerServicePoint"),
    @XmlEnumValue("incoming")
    INCOMING("incoming"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),
    @XmlEnumValue("internationalShippingPlatform")
    INTERNATIONAL_SHIPPING_PLATFORM("internationalShippingPlatform"),
    @XmlEnumValue("temporaryCustomerServicePoint")
    TEMPORARY_CUSTOMER_SERVICE_POINT("temporaryCustomerServicePoint");
    private final String value;

    BoxMachineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoxMachineType fromValue(String v) {
        for (BoxMachineType c: BoxMachineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
