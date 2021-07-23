//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:28:22 PM CEST 
//


package pl.inpost.szop.publicapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userTypeContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userTypeContext"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boxMachineOperator"/&gt;
 *     &lt;enumeration value="consoleOperator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "userTypeContext")
@XmlEnum
public enum UserTypeContext {

    @XmlEnumValue("boxMachineOperator")
    BOX_MACHINE_OPERATOR("boxMachineOperator"),
    @XmlEnumValue("consoleOperator")
    CONSOLE_OPERATOR("consoleOperator");
    private final String value;

    UserTypeContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeContext fromValue(String v) {
        for (UserTypeContext c: UserTypeContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
