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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifika\u010dní a aloka\u010dní údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_IR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Stav" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Spisova_znacka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}spisova_znacka_IR"/&gt;
 *         &lt;element name="Osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}osoba_IR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_IR", propOrder = {
    "platnostOd",
    "klicARES",
    "stav",
    "spisovaZnacka",
    "osoba"
})
public class ZakladniUdajeIR {

    @XmlElement(name = "Platnost_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Klic_ARES")
    protected int klicARES;
    @XmlElement(name = "Stav")
    protected Integer stav;
    @XmlElement(name = "Spisova_znacka", required = true)
    protected SpisovaZnackaIR spisovaZnacka;
    @XmlElement(name = "Osoba")
    protected OsobaIR osoba;

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the klicARES property.
     * 
     */
    public int getKlicARES() {
        return klicARES;
    }

    /**
     * Sets the value of the klicARES property.
     * 
     */
    public void setKlicARES(int value) {
        this.klicARES = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStav(Integer value) {
        this.stav = value;
    }

    /**
     * Gets the value of the spisovaZnacka property.
     * 
     * @return
     *     possible object is
     *     {@link SpisovaZnackaIR }
     *     
     */
    public SpisovaZnackaIR getSpisovaZnacka() {
        return spisovaZnacka;
    }

    /**
     * Sets the value of the spisovaZnacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpisovaZnackaIR }
     *     
     */
    public void setSpisovaZnacka(SpisovaZnackaIR value) {
        this.spisovaZnacka = value;
    }

    /**
     * Gets the value of the osoba property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaIR }
     *     
     */
    public OsobaIR getOsoba() {
        return osoba;
    }

    /**
     * Sets the value of the osoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaIR }
     *     
     */
    public void setOsoba(OsobaIR value) {
        this.osoba = value;
    }

}
