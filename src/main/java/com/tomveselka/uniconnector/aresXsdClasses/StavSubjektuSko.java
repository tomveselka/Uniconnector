//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.06 at 08:15:14 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stav_subjektu_sko.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_subjektu_sko"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aktivní"/&gt;
 *     &lt;enumeration value="Zaniklý"/&gt;
 *     &lt;enumeration value="Fyzicky vymazaný"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "stav_subjektu_sko")
@XmlEnum
public enum StavSubjektuSko {

    @XmlEnumValue("Aktivn\u00ed")
    AKTIVNÍ("Aktivn\u00ed"),
    @XmlEnumValue("Zanikl\u00fd")
    ZANIKLÝ("Zanikl\u00fd"),
    @XmlEnumValue("Fyzicky vymazan\u00fd")
    FYZICKY_VYMAZANÝ("Fyzicky vymazan\u00fd");
    private final String value;

    StavSubjektuSko(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StavSubjektuSko fromValue(String v) {
        for (StavSubjektuSko c: StavSubjektuSko.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
