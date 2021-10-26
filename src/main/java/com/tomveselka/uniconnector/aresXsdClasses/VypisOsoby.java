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
 * Výpis jednoho subjektu na str. P\u0159ehledu
 * 
 * <p>Java class for vypis_osoby complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_osoby"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo" minOccurs="0"/&gt;
 *         &lt;element name="ojm" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="jmn" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="zdr" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ang" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="klic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_osoby", propOrder = {
    "stav",
    "ico",
    "klicARES",
    "rc",
    "ojm",
    "jmn",
    "zdr",
    "ang",
    "klic"
})
public class VypisOsoby {

    protected String stav;
    protected String ico;
    @XmlElement(name = "Klic_ARES")
    protected Integer klicARES;
    protected String rc;
    protected String ojm;
    protected String jmn;
    protected Short zdr;
    protected String ang;
    protected String klic;

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStav(String value) {
        this.stav = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the klicARES property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicARES() {
        return klicARES;
    }

    /**
     * Sets the value of the klicARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicARES(Integer value) {
        this.klicARES = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRc() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRc(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the ojm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjm() {
        return ojm;
    }

    /**
     * Sets the value of the ojm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjm(String value) {
        this.ojm = value;
    }

    /**
     * Gets the value of the jmn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmn() {
        return jmn;
    }

    /**
     * Sets the value of the jmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmn(String value) {
        this.jmn = value;
    }

    /**
     * Gets the value of the zdr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZdr() {
        return zdr;
    }

    /**
     * Sets the value of the zdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZdr(Short value) {
        this.zdr = value;
    }

    /**
     * Gets the value of the ang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAng() {
        return ang;
    }

    /**
     * Sets the value of the ang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAng(String value) {
        this.ang = value;
    }

    /**
     * Gets the value of the klic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlic() {
        return klic;
    }

    /**
     * Sets the value of the klic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlic(String value) {
        this.klic = value;
    }

}
