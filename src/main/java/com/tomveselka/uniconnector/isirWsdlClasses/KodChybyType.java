//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.12 at 07:11:59 PM CEST 
//


package com.tomveselka.uniconnector.isirWsdlClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kodChybyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kodChybyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WS1"/&gt;
 *     &lt;enumeration value="WS2"/&gt;
 *     &lt;enumeration value="WS3"/&gt;
 *     &lt;enumeration value="WS4"/&gt;
 *     &lt;enumeration value="SQL1"/&gt;
 *     &lt;enumeration value="SERVER1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kodChybyType")
@XmlEnum
public enum KodChybyType {

    @XmlEnumValue("WS1")
    WS_1("WS1"),
    @XmlEnumValue("WS2")
    WS_2("WS2"),
    @XmlEnumValue("WS3")
    WS_3("WS3"),
    @XmlEnumValue("WS4")
    WS_4("WS4"),
    @XmlEnumValue("SQL1")
    SQL_1("SQL1"),
    @XmlEnumValue("SERVER1")
    SERVER_1("SERVER1");
    private final String value;

    KodChybyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KodChybyType fromValue(String v) {
        for (KodChybyType c: KodChybyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
