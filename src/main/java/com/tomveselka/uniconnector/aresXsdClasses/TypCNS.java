//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.26 at 10:55:39 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typ_CNS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typ_CNS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Církev"/&gt;
 *     &lt;enumeration value="Svaz"/&gt;
 *     &lt;enumeration value="Právnická osoba"/&gt;
 *     &lt;enumeration value="Církevní právnická osoba"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typ_CNS")
@XmlEnum
public enum TypCNS {

    @XmlEnumValue("C\u00edrkev")
    CÍRKEV("C\u00edrkev"),
    @XmlEnumValue("Svaz")
    SVAZ("Svaz"),
    @XmlEnumValue("Pr\u00e1vnick\u00e1 osoba")
    PRÁVNICKÁ_OSOBA("Pr\u00e1vnick\u00e1 osoba"),
    @XmlEnumValue("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba")
    CÍRKEVNÍ_PRÁVNICKÁ_OSOBA("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba");
    private final String value;

    TypCNS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypCNS fromValue(String v) {
        for (TypCNS c: TypCNS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
