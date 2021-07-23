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
 * <p>Java class for packStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="packStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Prepared"/&gt;
 *     &lt;enumeration value="CustomerSent"/&gt;
 *     &lt;enumeration value="Sent"/&gt;
 *     &lt;enumeration value="InTransit"/&gt;
 *     &lt;enumeration value="Stored"/&gt;
 *     &lt;enumeration value="Avizo"/&gt;
 *     &lt;enumeration value="CustomerDelivering"/&gt;
 *     &lt;enumeration value="CustomerStored"/&gt;
 *     &lt;enumeration value="LabelExpired"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="RetunedToAgency"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="LabelDestroyed"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Claimed"/&gt;
 *     &lt;enumeration value="ClaimProcessed"/&gt;
 *     &lt;enumeration value="DeliveredToAgency"/&gt;
 *     &lt;enumeration value="ReturnedToSender"/&gt;
 *     &lt;enumeration value="ReturnedToSortingCenter"/&gt;
 *     &lt;enumeration value="DeliveredToSortingCenter"/&gt;
 *     &lt;enumeration value="NotDelivered"/&gt;
 *     &lt;enumeration value="HomeDelivering"/&gt;
 *     &lt;enumeration value="Oversized"/&gt;
 *     &lt;enumeration value="Damaged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "packStatus")
@XmlEnum
public enum PackStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Prepared")
    PREPARED("Prepared"),
    @XmlEnumValue("CustomerSent")
    CUSTOMER_SENT("CustomerSent"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("Stored")
    STORED("Stored"),
    @XmlEnumValue("Avizo")
    AVIZO("Avizo"),
    @XmlEnumValue("CustomerDelivering")
    CUSTOMER_DELIVERING("CustomerDelivering"),
    @XmlEnumValue("CustomerStored")
    CUSTOMER_STORED("CustomerStored"),
    @XmlEnumValue("LabelExpired")
    LABEL_EXPIRED("LabelExpired"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("RetunedToAgency")
    RETUNED_TO_AGENCY("RetunedToAgency"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("LabelDestroyed")
    LABEL_DESTROYED("LabelDestroyed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Claimed")
    CLAIMED("Claimed"),
    @XmlEnumValue("ClaimProcessed")
    CLAIM_PROCESSED("ClaimProcessed"),
    @XmlEnumValue("DeliveredToAgency")
    DELIVERED_TO_AGENCY("DeliveredToAgency"),
    @XmlEnumValue("ReturnedToSender")
    RETURNED_TO_SENDER("ReturnedToSender"),
    @XmlEnumValue("ReturnedToSortingCenter")
    RETURNED_TO_SORTING_CENTER("ReturnedToSortingCenter"),
    @XmlEnumValue("DeliveredToSortingCenter")
    DELIVERED_TO_SORTING_CENTER("DeliveredToSortingCenter"),
    @XmlEnumValue("NotDelivered")
    NOT_DELIVERED("NotDelivered"),
    @XmlEnumValue("HomeDelivering")
    HOME_DELIVERING("HomeDelivering"),
    @XmlEnumValue("Oversized")
    OVERSIZED("Oversized"),
    @XmlEnumValue("Damaged")
    DAMAGED("Damaged");
    private final String value;

    PackStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackStatus fromValue(String v) {
        for (PackStatus c: PackStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}