//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.11 at 07:10:59 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informace o splacení \u010dástky vkladu v K\u010d, procentech nebo slovy volným textem
 * 
 * <p>Java class for splaceno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splaceno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Procenta" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Ostatni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splaceno", propOrder = {
    "kc",
    "procenta",
    "ostatni"
})
public class Splaceno {

    @XmlElement(name = "Kc")
    protected String kc;
    @XmlElement(name = "Procenta")
    protected String procenta;
    @XmlElement(name = "Ostatni")
    protected String ostatni;

    /**
     * Gets the value of the kc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKc() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKc(String value) {
        this.kc = value;
    }

    /**
     * Gets the value of the procenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcenta() {
        return procenta;
    }

    /**
     * Sets the value of the procenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcenta(String value) {
        this.procenta = value;
    }

    /**
     * Gets the value of the ostatni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstatni() {
        return ostatni;
    }

    /**
     * Sets the value of the ostatni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstatni(String value) {
        this.ostatni = value;
    }

}
