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
 * <p>Java class for boxMachineComponentVO.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="boxMachineComponentVO"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HAL"/&gt;
 *     &lt;enumeration value="ReceiptPrinter"/&gt;
 *     &lt;enumeration value="LabelPrinter"/&gt;
 *     &lt;enumeration value="FiscalPrinter"/&gt;
 *     &lt;enumeration value="CardAcceptor"/&gt;
 *     &lt;enumeration value="BillAcceptor"/&gt;
 *     &lt;enumeration value="CoinAcceptor"/&gt;
 *     &lt;enumeration value="ShockSensor"/&gt;
 *     &lt;enumeration value="PowerSensor"/&gt;
 *     &lt;enumeration value="OverVoltageSensor"/&gt;
 *     &lt;enumeration value="FloodSensor"/&gt;
 *     &lt;enumeration value="DoorSensorH"/&gt;
 *     &lt;enumeration value="DoorSensorL"/&gt;
 *     &lt;enumeration value="Fan"/&gt;
 *     &lt;enumeration value="Heater"/&gt;
 *     &lt;enumeration value="HumiRegulator"/&gt;
 *     &lt;enumeration value="AirConditioner"/&gt;
 *     &lt;enumeration value="Buzzer"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="DamagedCompartments"/&gt;
 *     &lt;enumeration value="SoiledCompartments"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Modem"/&gt;
 *     &lt;enumeration value="DiskSMART"/&gt;
 *     &lt;enumeration value="Dvr"/&gt;
 *     &lt;enumeration value="Fatek"/&gt;
 *     &lt;enumeration value="IWR724"/&gt;
 *     &lt;enumeration value="MB1I1"/&gt;
 *     &lt;enumeration value="CommunicationIn"/&gt;
 *     &lt;enumeration value="CommunicationOut"/&gt;
 *     &lt;enumeration value="BoxMachine"/&gt;
 *     &lt;enumeration value="NotAuthorizedOpenedCompartments"/&gt;
 *     &lt;enumeration value="Expander"/&gt;
 *     &lt;enumeration value="IRTouch"/&gt;
 *     &lt;enumeration value="BarcodeScanner"/&gt;
 *     &lt;enumeration value="BinarySensor"/&gt;
 *     &lt;enumeration value="UnclosedCompartments"/&gt;
 *     &lt;enumeration value="GMBL"/&gt;
 *     &lt;enumeration value="LCD"/&gt;
 *     &lt;enumeration value="T0"/&gt;
 *     &lt;enumeration value="T1"/&gt;
 *     &lt;enumeration value="T2"/&gt;
 *     &lt;enumeration value="U0"/&gt;
 *     &lt;enumeration value="H0"/&gt;
 *     &lt;enumeration value="P0"/&gt;
 *     &lt;enumeration value="I0"/&gt;
 *     &lt;enumeration value="Control"/&gt;
 *     &lt;enumeration value="CardIdScanner"/&gt;
 *     &lt;enumeration value="Storage"/&gt;
 *     &lt;enumeration value="CompartmentTemperature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "boxMachineComponentVO")
@XmlEnum
public enum BoxMachineComponentVO {

    HAL("HAL"),
    @XmlEnumValue("ReceiptPrinter")
    RECEIPT_PRINTER("ReceiptPrinter"),
    @XmlEnumValue("LabelPrinter")
    LABEL_PRINTER("LabelPrinter"),
    @XmlEnumValue("FiscalPrinter")
    FISCAL_PRINTER("FiscalPrinter"),
    @XmlEnumValue("CardAcceptor")
    CARD_ACCEPTOR("CardAcceptor"),
    @XmlEnumValue("BillAcceptor")
    BILL_ACCEPTOR("BillAcceptor"),
    @XmlEnumValue("CoinAcceptor")
    COIN_ACCEPTOR("CoinAcceptor"),
    @XmlEnumValue("ShockSensor")
    SHOCK_SENSOR("ShockSensor"),
    @XmlEnumValue("PowerSensor")
    POWER_SENSOR("PowerSensor"),
    @XmlEnumValue("OverVoltageSensor")
    OVER_VOLTAGE_SENSOR("OverVoltageSensor"),
    @XmlEnumValue("FloodSensor")
    FLOOD_SENSOR("FloodSensor"),
    @XmlEnumValue("DoorSensorH")
    DOOR_SENSOR_H("DoorSensorH"),
    @XmlEnumValue("DoorSensorL")
    DOOR_SENSOR_L("DoorSensorL"),
    @XmlEnumValue("Fan")
    FAN("Fan"),
    @XmlEnumValue("Heater")
    HEATER("Heater"),
    @XmlEnumValue("HumiRegulator")
    HUMI_REGULATOR("HumiRegulator"),
    @XmlEnumValue("AirConditioner")
    AIR_CONDITIONER("AirConditioner"),
    @XmlEnumValue("Buzzer")
    BUZZER("Buzzer"),
    T("T"),
    U("U"),
    H("H"),
    P("P"),
    I("I"),
    @XmlEnumValue("DamagedCompartments")
    DAMAGED_COMPARTMENTS("DamagedCompartments"),
    @XmlEnumValue("SoiledCompartments")
    SOILED_COMPARTMENTS("SoiledCompartments"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Modem")
    MODEM("Modem"),
    @XmlEnumValue("DiskSMART")
    DISK_SMART("DiskSMART"),
    @XmlEnumValue("Dvr")
    DVR("Dvr"),
    @XmlEnumValue("Fatek")
    FATEK("Fatek"),
    @XmlEnumValue("IWR724")
    IWR_724("IWR724"),
    @XmlEnumValue("MB1I1")
    MB_1_I_1("MB1I1"),
    @XmlEnumValue("CommunicationIn")
    COMMUNICATION_IN("CommunicationIn"),
    @XmlEnumValue("CommunicationOut")
    COMMUNICATION_OUT("CommunicationOut"),
    @XmlEnumValue("BoxMachine")
    BOX_MACHINE("BoxMachine"),
    @XmlEnumValue("NotAuthorizedOpenedCompartments")
    NOT_AUTHORIZED_OPENED_COMPARTMENTS("NotAuthorizedOpenedCompartments"),
    @XmlEnumValue("Expander")
    EXPANDER("Expander"),
    @XmlEnumValue("IRTouch")
    IR_TOUCH("IRTouch"),
    @XmlEnumValue("BarcodeScanner")
    BARCODE_SCANNER("BarcodeScanner"),
    @XmlEnumValue("BinarySensor")
    BINARY_SENSOR("BinarySensor"),
    @XmlEnumValue("UnclosedCompartments")
    UNCLOSED_COMPARTMENTS("UnclosedCompartments"),
    GMBL("GMBL"),
    LCD("LCD"),
    @XmlEnumValue("T0")
    T_0("T0"),
    @XmlEnumValue("T1")
    T_1("T1"),
    @XmlEnumValue("T2")
    T_2("T2"),
    @XmlEnumValue("U0")
    U_0("U0"),
    @XmlEnumValue("H0")
    H_0("H0"),
    @XmlEnumValue("P0")
    P_0("P0"),
    @XmlEnumValue("I0")
    I_0("I0"),
    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("CardIdScanner")
    CARD_ID_SCANNER("CardIdScanner"),
    @XmlEnumValue("Storage")
    STORAGE("Storage"),
    @XmlEnumValue("CompartmentTemperature")
    COMPARTMENT_TEMPERATURE("CompartmentTemperature");
    private final String value;

    BoxMachineComponentVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoxMachineComponentVO fromValue(String v) {
        for (BoxMachineComponentVO c: BoxMachineComponentVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
