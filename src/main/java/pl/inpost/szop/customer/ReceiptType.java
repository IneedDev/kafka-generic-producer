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
 * <p>Java class for receiptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="receiptType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ClientSendPrelabeledParcel"/&gt;
 *     &lt;enumeration value="ClientSendPrelabeledParcelPayment"/&gt;
 *     &lt;enumeration value="ClientSendPrelabeledParcelChangeSizePayment"/&gt;
 *     &lt;enumeration value="ClientSendNotLabeledParcel"/&gt;
 *     &lt;enumeration value="ClientSendNotLabeledParcelPayment"/&gt;
 *     &lt;enumeration value="ClientSendNotPrelabeledParcelChangeSizePayment"/&gt;
 *     &lt;enumeration value="ClientReturnParcel"/&gt;
 *     &lt;enumeration value="BusinessClient"/&gt;
 *     &lt;enumeration value="ClientSendPrelabeledLaundry"/&gt;
 *     &lt;enumeration value="ClientSendNotLabeledLaundry"/&gt;
 *     &lt;enumeration value="ClientCollectParcel"/&gt;
 *     &lt;enumeration value="ClientCollectParcelPayment"/&gt;
 *     &lt;enumeration value="ClientCollectParcelClaim"/&gt;
 *     &lt;enumeration value="ClientCollectPromotionParcel"/&gt;
 *     &lt;enumeration value="ClientFiscalCollectParcel"/&gt;
 *     &lt;enumeration value="ClientFiscalCollectParcelChange"/&gt;
 *     &lt;enumeration value="ClientCollectLaundry"/&gt;
 *     &lt;enumeration value="ClientCollectLaundryPayment"/&gt;
 *     &lt;enumeration value="CourierPickUpParcel"/&gt;
 *     &lt;enumeration value="CourierPutInParcel"/&gt;
 *     &lt;enumeration value="CourierEmergencyTakeOut"/&gt;
 *     &lt;enumeration value="CourierEmergencyAccess"/&gt;
 *     &lt;enumeration value="CourierCleaning"/&gt;
 *     &lt;enumeration value="CourierPutInPromotionParcel"/&gt;
 *     &lt;enumeration value="Courier"/&gt;
 *     &lt;enumeration value="ServiceTestReceipt"/&gt;
 *     &lt;enumeration value="ServiceReportSummary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "receiptType")
@XmlEnum
public enum ReceiptType {

    @XmlEnumValue("ClientSendPrelabeledParcel")
    CLIENT_SEND_PRELABELED_PARCEL("ClientSendPrelabeledParcel"),
    @XmlEnumValue("ClientSendPrelabeledParcelPayment")
    CLIENT_SEND_PRELABELED_PARCEL_PAYMENT("ClientSendPrelabeledParcelPayment"),
    @XmlEnumValue("ClientSendPrelabeledParcelChangeSizePayment")
    CLIENT_SEND_PRELABELED_PARCEL_CHANGE_SIZE_PAYMENT("ClientSendPrelabeledParcelChangeSizePayment"),
    @XmlEnumValue("ClientSendNotLabeledParcel")
    CLIENT_SEND_NOT_LABELED_PARCEL("ClientSendNotLabeledParcel"),
    @XmlEnumValue("ClientSendNotLabeledParcelPayment")
    CLIENT_SEND_NOT_LABELED_PARCEL_PAYMENT("ClientSendNotLabeledParcelPayment"),
    @XmlEnumValue("ClientSendNotPrelabeledParcelChangeSizePayment")
    CLIENT_SEND_NOT_PRELABELED_PARCEL_CHANGE_SIZE_PAYMENT("ClientSendNotPrelabeledParcelChangeSizePayment"),
    @XmlEnumValue("ClientReturnParcel")
    CLIENT_RETURN_PARCEL("ClientReturnParcel"),
    @XmlEnumValue("BusinessClient")
    BUSINESS_CLIENT("BusinessClient"),
    @XmlEnumValue("ClientSendPrelabeledLaundry")
    CLIENT_SEND_PRELABELED_LAUNDRY("ClientSendPrelabeledLaundry"),
    @XmlEnumValue("ClientSendNotLabeledLaundry")
    CLIENT_SEND_NOT_LABELED_LAUNDRY("ClientSendNotLabeledLaundry"),
    @XmlEnumValue("ClientCollectParcel")
    CLIENT_COLLECT_PARCEL("ClientCollectParcel"),
    @XmlEnumValue("ClientCollectParcelPayment")
    CLIENT_COLLECT_PARCEL_PAYMENT("ClientCollectParcelPayment"),
    @XmlEnumValue("ClientCollectParcelClaim")
    CLIENT_COLLECT_PARCEL_CLAIM("ClientCollectParcelClaim"),
    @XmlEnumValue("ClientCollectPromotionParcel")
    CLIENT_COLLECT_PROMOTION_PARCEL("ClientCollectPromotionParcel"),
    @XmlEnumValue("ClientFiscalCollectParcel")
    CLIENT_FISCAL_COLLECT_PARCEL("ClientFiscalCollectParcel"),
    @XmlEnumValue("ClientFiscalCollectParcelChange")
    CLIENT_FISCAL_COLLECT_PARCEL_CHANGE("ClientFiscalCollectParcelChange"),
    @XmlEnumValue("ClientCollectLaundry")
    CLIENT_COLLECT_LAUNDRY("ClientCollectLaundry"),
    @XmlEnumValue("ClientCollectLaundryPayment")
    CLIENT_COLLECT_LAUNDRY_PAYMENT("ClientCollectLaundryPayment"),
    @XmlEnumValue("CourierPickUpParcel")
    COURIER_PICK_UP_PARCEL("CourierPickUpParcel"),
    @XmlEnumValue("CourierPutInParcel")
    COURIER_PUT_IN_PARCEL("CourierPutInParcel"),
    @XmlEnumValue("CourierEmergencyTakeOut")
    COURIER_EMERGENCY_TAKE_OUT("CourierEmergencyTakeOut"),
    @XmlEnumValue("CourierEmergencyAccess")
    COURIER_EMERGENCY_ACCESS("CourierEmergencyAccess"),
    @XmlEnumValue("CourierCleaning")
    COURIER_CLEANING("CourierCleaning"),
    @XmlEnumValue("CourierPutInPromotionParcel")
    COURIER_PUT_IN_PROMOTION_PARCEL("CourierPutInPromotionParcel"),
    @XmlEnumValue("Courier")
    COURIER("Courier"),
    @XmlEnumValue("ServiceTestReceipt")
    SERVICE_TEST_RECEIPT("ServiceTestReceipt"),
    @XmlEnumValue("ServiceReportSummary")
    SERVICE_REPORT_SUMMARY("ServiceReportSummary");
    private final String value;

    ReceiptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiptType fromValue(String v) {
        for (ReceiptType c: ReceiptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
