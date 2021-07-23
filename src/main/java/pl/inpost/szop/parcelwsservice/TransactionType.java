//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.parcelwsservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Benefit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionType")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Benefit")
    BENEFIT("Benefit");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
