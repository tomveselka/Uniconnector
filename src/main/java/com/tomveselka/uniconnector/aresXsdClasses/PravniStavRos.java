//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.26 at 10:55:39 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pravni_stav_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pravni_stav_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kod_PS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_stav" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_PS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pravni_stav_ros", propOrder = {
    "kodPS",
    "nazevPS"
})
public class PravniStavRos {

    @XmlElement(name = "Kod_PS")
    protected Byte kodPS;
    @XmlElement(name = "Nazev_PS")
    protected String nazevPS;

    /**
     * Gets the value of the kodPS property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getKodPS() {
        return kodPS;
    }

    /**
     * Sets the value of the kodPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setKodPS(Byte value) {
        this.kodPS = value;
    }

    /**
     * Gets the value of the nazevPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPS() {
        return nazevPS;
    }

    /**
     * Sets the value of the nazevPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPS(String value) {
        this.nazevPS = value;
    }

}
