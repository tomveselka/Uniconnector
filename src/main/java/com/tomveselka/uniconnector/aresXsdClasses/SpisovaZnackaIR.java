//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.06 at 08:15:14 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Spisová zna\u010dka pro insolve\u010dní rejst\u0159ík, aby bylo možno d\u011blat p\u0159es ní odkazy na isir.justice.cz. 24.3.2010
 * 
 * <p>Java class for spisova_znacka_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spisova_znacka_IR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Soud" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}soud"/&gt;
 *         &lt;element name="Oddil_vlozka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis"/&gt;
 *         &lt;element name="Vec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rocnik" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spisova_znacka_IR", propOrder = {
    "soud",
    "oddilVlozka",
    "vec",
    "rocnik"
})
public class SpisovaZnackaIR {

    @XmlElement(name = "Soud", required = true)
    protected Soud soud;
    @XmlElement(name = "Oddil_vlozka", required = true)
    protected String oddilVlozka;
    @XmlElement(name = "Vec")
    protected int vec;
    @XmlElement(name = "Rocnik")
    protected int rocnik;

    /**
     * Gets the value of the soud property.
     * 
     * @return
     *     possible object is
     *     {@link Soud }
     *     
     */
    public Soud getSoud() {
        return soud;
    }

    /**
     * Sets the value of the soud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soud }
     *     
     */
    public void setSoud(Soud value) {
        this.soud = value;
    }

    /**
     * Gets the value of the oddilVlozka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOddilVlozka() {
        return oddilVlozka;
    }

    /**
     * Sets the value of the oddilVlozka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOddilVlozka(String value) {
        this.oddilVlozka = value;
    }

    /**
     * Gets the value of the vec property.
     * 
     */
    public int getVec() {
        return vec;
    }

    /**
     * Sets the value of the vec property.
     * 
     */
    public void setVec(int value) {
        this.vec = value;
    }

    /**
     * Gets the value of the rocnik property.
     * 
     */
    public int getRocnik() {
        return rocnik;
    }

    /**
     * Sets the value of the rocnik property.
     * 
     */
    public void setRocnik(int value) {
        this.rocnik = value;
    }

}
