//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:21 PM CEST 
//


package pl.inpost.szop.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laundryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="laundryStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomerDelivering"/&gt;
 *     &lt;enumeration value="CustomerStored"/&gt;
 *     &lt;enumeration value="CustomerSent"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="InTransit"/&gt;
 *     &lt;enumeration value="Stored"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="ReturnedToAgency"/&gt;
 *     &lt;enumeration value="Avizo"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "laundryStatus")
@XmlEnum
public enum LaundryStatus {

    @XmlEnumValue("CustomerDelivering")
    CUSTOMER_DELIVERING("CustomerDelivering"),
    @XmlEnumValue("CustomerStored")
    CUSTOMER_STORED("CustomerStored"),
    @XmlEnumValue("CustomerSent")
    CUSTOMER_SENT("CustomerSent"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("Stored")
    STORED("Stored"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("ReturnedToAgency")
    RETURNED_TO_AGENCY("ReturnedToAgency"),
    @XmlEnumValue("Avizo")
    AVIZO("Avizo"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    LaundryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaundryStatus fromValue(String v) {
        for (LaundryStatus c: LaundryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
