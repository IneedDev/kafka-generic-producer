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
 * <p>Java class for transactionSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NewPack"/&gt;
 *     &lt;enumeration value="Operator"/&gt;
 *     &lt;enumeration value="PrePaid"/&gt;
 *     &lt;enumeration value="Promotion"/&gt;
 *     &lt;enumeration value="UnderOverPayment"/&gt;
 *     &lt;enumeration value="Reclamation"/&gt;
 *     &lt;enumeration value="NewPackFromBoxMachine"/&gt;
 *     &lt;enumeration value="FV"/&gt;
 *     &lt;enumeration value="CORRECTION"/&gt;
 *     &lt;enumeration value="PayForReturn"/&gt;
 *     &lt;enumeration value="ExpandAvizo"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="PackSizeChange"/&gt;
 *     &lt;enumeration value="DispatchOrder"/&gt;
 *     &lt;enumeration value="Registration"/&gt;
 *     &lt;enumeration value="ParcelCancellation"/&gt;
 *     &lt;enumeration value="PreLabeledPayment"/&gt;
 *     &lt;enumeration value="UnderpaidCompensation"/&gt;
 *     &lt;enumeration value="OverpaidCompensation"/&gt;
 *     &lt;enumeration value="EndOfWeekCollectionChargeCompensation"/&gt;
 *     &lt;enumeration value="ReturnedToSenderCharge"/&gt;
 *     &lt;enumeration value="UnpaidParcelAutoPayment"/&gt;
 *     &lt;enumeration value="LockerPackages"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionSource")
@XmlEnum
public enum TransactionSource {

    @XmlEnumValue("NewPack")
    NEW_PACK("NewPack"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("PrePaid")
    PRE_PAID("PrePaid"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("UnderOverPayment")
    UNDER_OVER_PAYMENT("UnderOverPayment"),
    @XmlEnumValue("Reclamation")
    RECLAMATION("Reclamation"),
    @XmlEnumValue("NewPackFromBoxMachine")
    NEW_PACK_FROM_BOX_MACHINE("NewPackFromBoxMachine"),
    FV("FV"),
    CORRECTION("CORRECTION"),
    @XmlEnumValue("PayForReturn")
    PAY_FOR_RETURN("PayForReturn"),
    @XmlEnumValue("ExpandAvizo")
    EXPAND_AVIZO("ExpandAvizo"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    COD("COD"),
    @XmlEnumValue("PackSizeChange")
    PACK_SIZE_CHANGE("PackSizeChange"),
    @XmlEnumValue("DispatchOrder")
    DISPATCH_ORDER("DispatchOrder"),
    @XmlEnumValue("Registration")
    REGISTRATION("Registration"),
    @XmlEnumValue("ParcelCancellation")
    PARCEL_CANCELLATION("ParcelCancellation"),
    @XmlEnumValue("PreLabeledPayment")
    PRE_LABELED_PAYMENT("PreLabeledPayment"),
    @XmlEnumValue("UnderpaidCompensation")
    UNDERPAID_COMPENSATION("UnderpaidCompensation"),
    @XmlEnumValue("OverpaidCompensation")
    OVERPAID_COMPENSATION("OverpaidCompensation"),
    @XmlEnumValue("EndOfWeekCollectionChargeCompensation")
    END_OF_WEEK_COLLECTION_CHARGE_COMPENSATION("EndOfWeekCollectionChargeCompensation"),
    @XmlEnumValue("ReturnedToSenderCharge")
    RETURNED_TO_SENDER_CHARGE("ReturnedToSenderCharge"),
    @XmlEnumValue("UnpaidParcelAutoPayment")
    UNPAID_PARCEL_AUTO_PAYMENT("UnpaidParcelAutoPayment"),
    @XmlEnumValue("LockerPackages")
    LOCKER_PACKAGES("LockerPackages");
    private final String value;

    TransactionSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionSource fromValue(String v) {
        for (TransactionSource c: TransactionSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
