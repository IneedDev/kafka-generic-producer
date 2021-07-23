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
 * <p>Java class for taskReportReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskReportReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CleanEnded"/&gt;
 *     &lt;enumeration value="CleanBroken"/&gt;
 *     &lt;enumeration value="Finished"/&gt;
 *     &lt;enumeration value="Unfinished"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "taskReportReason")
@XmlEnum
public enum TaskReportReason {

    @XmlEnumValue("CleanEnded")
    CLEAN_ENDED("CleanEnded"),
    @XmlEnumValue("CleanBroken")
    CLEAN_BROKEN("CleanBroken"),
    @XmlEnumValue("Finished")
    FINISHED("Finished"),
    @XmlEnumValue("Unfinished")
    UNFINISHED("Unfinished");
    private final String value;

    TaskReportReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskReportReason fromValue(String v) {
        for (TaskReportReason c: TaskReportReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}