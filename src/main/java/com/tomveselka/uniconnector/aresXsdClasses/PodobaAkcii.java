//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.11 at 07:10:59 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for podoba_akcii.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="podoba_akcii"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="v listinné podob\u011b"/&gt;
 *     &lt;enumeration value="v zaknihované podob\u011b"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "podoba_akcii")
@XmlEnum
public enum PodobaAkcii {

    @XmlEnumValue("v listinn\u00e9 podob\u011b")
    V_LISTINNÉ_PODOB\u011a("v listinn\u00e9 podob\u011b"),
    @XmlEnumValue("v zaknihovan\u00e9 podob\u011b")
    V_ZAKNIHOVANÉ_PODOB\u011a("v zaknihovan\u00e9 podob\u011b");
    private final String value;

    PodobaAkcii(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PodobaAkcii fromValue(String v) {
        for (PodobaAkcii c: PodobaAkcii.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
