//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.06 at 08:15:14 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o jedné živnosti
 * 
 * <p>Java class for zivnost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav_zivnosti" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Evp" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="Evc" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="Zivnostensky_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zivnostensky_urad" minOccurs="0"/&gt;
 *         &lt;element name="Druh" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}druh_zivnosti" minOccurs="0"/&gt;
 *         &lt;element name="Kod_zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}kod_zivnosti" minOccurs="0"/&gt;
 *         &lt;element name="OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}kod_okec" minOccurs="0"/&gt;
 *         &lt;element name="Predmet_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}predmet_podnikani_rzp" minOccurs="0"/&gt;
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obory_cinnosti" minOccurs="0"/&gt;
 *         &lt;element name="Vznik" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Zahajeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Ukonceni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Zanik" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Pozastaveni_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Pozastaveni_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Rozsah_pozastaveni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Preruseni_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Preruseni_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}provozovny_RZP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnost", propOrder = {
    "stav",
    "datumZmeny",
    "evp",
    "evc",
    "zivnostenskyUrad",
    "druh",
    "kodZivnosti",
    "okec",
    "predmetPodnikani",
    "oboryCinnosti",
    "vznik",
    "zahajeni",
    "ukonceni",
    "zanik",
    "pozastaveniOd",
    "pozastaveniDo",
    "rozsahPozastaveni",
    "preruseniOd",
    "preruseniDo",
    "provozovny"
})
public class Zivnost {

    @XmlElement(name = "Stav")
    @XmlSchemaType(name = "string")
    protected StavZivnosti stav;
    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "Evp")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger evp;
    @XmlElement(name = "Evc")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger evc;
    @XmlElement(name = "Zivnostensky_urad")
    protected ZivnostenskyUrad zivnostenskyUrad;
    @XmlElement(name = "Druh")
    @XmlSchemaType(name = "string")
    protected DruhZivnosti druh;
    @XmlElement(name = "Kod_zivnosti")
    protected String kodZivnosti;
    @XmlElement(name = "OKEC")
    protected KodOkec okec;
    @XmlElement(name = "Predmet_podnikani")
    protected String predmetPodnikani;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti oboryCinnosti;
    @XmlElement(name = "Vznik")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vznik;
    @XmlElement(name = "Zahajeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zahajeni;
    @XmlElement(name = "Ukonceni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ukonceni;
    @XmlElement(name = "Zanik")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zanik;
    @XmlElement(name = "Pozastaveni_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pozastaveniOd;
    @XmlElement(name = "Pozastaveni_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pozastaveniDo;
    @XmlElement(name = "Rozsah_pozastaveni")
    protected String rozsahPozastaveni;
    @XmlElement(name = "Preruseni_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preruseniOd;
    @XmlElement(name = "Preruseni_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preruseniDo;
    @XmlElement(name = "Provozovny")
    protected ProvozovnyRZP provozovny;

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link StavZivnosti }
     *     
     */
    public StavZivnosti getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavZivnosti }
     *     
     */
    public void setStav(StavZivnosti value) {
        this.stav = value;
    }

    /**
     * Gets the value of the datumZmeny property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZmeny() {
        return datumZmeny;
    }

    /**
     * Sets the value of the datumZmeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZmeny(XMLGregorianCalendar value) {
        this.datumZmeny = value;
    }

    /**
     * Gets the value of the evp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvp() {
        return evp;
    }

    /**
     * Sets the value of the evp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvp(BigInteger value) {
        this.evp = value;
    }

    /**
     * Gets the value of the evc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvc() {
        return evc;
    }

    /**
     * Sets the value of the evc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvc(BigInteger value) {
        this.evc = value;
    }

    /**
     * Gets the value of the zivnostenskyUrad property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public ZivnostenskyUrad getZivnostenskyUrad() {
        return zivnostenskyUrad;
    }

    /**
     * Sets the value of the zivnostenskyUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public void setZivnostenskyUrad(ZivnostenskyUrad value) {
        this.zivnostenskyUrad = value;
    }

    /**
     * Gets the value of the druh property.
     * 
     * @return
     *     possible object is
     *     {@link DruhZivnosti }
     *     
     */
    public DruhZivnosti getDruh() {
        return druh;
    }

    /**
     * Sets the value of the druh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DruhZivnosti }
     *     
     */
    public void setDruh(DruhZivnosti value) {
        this.druh = value;
    }

    /**
     * Gets the value of the kodZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodZivnosti() {
        return kodZivnosti;
    }

    /**
     * Sets the value of the kodZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodZivnosti(String value) {
        this.kodZivnosti = value;
    }

    /**
     * Gets the value of the okec property.
     * 
     * @return
     *     possible object is
     *     {@link KodOkec }
     *     
     */
    public KodOkec getOKEC() {
        return okec;
    }

    /**
     * Sets the value of the okec property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodOkec }
     *     
     */
    public void setOKEC(KodOkec value) {
        this.okec = value;
    }

    /**
     * Gets the value of the predmetPodnikani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredmetPodnikani() {
        return predmetPodnikani;
    }

    /**
     * Sets the value of the predmetPodnikani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredmetPodnikani(String value) {
        this.predmetPodnikani = value;
    }

    /**
     * Gets the value of the oboryCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link OboryCinnosti }
     *     
     */
    public OboryCinnosti getOboryCinnosti() {
        return oboryCinnosti;
    }

    /**
     * Sets the value of the oboryCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryCinnosti }
     *     
     */
    public void setOboryCinnosti(OboryCinnosti value) {
        this.oboryCinnosti = value;
    }

    /**
     * Gets the value of the vznik property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVznik() {
        return vznik;
    }

    /**
     * Sets the value of the vznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVznik(XMLGregorianCalendar value) {
        this.vznik = value;
    }

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZahajeni(XMLGregorianCalendar value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUkonceni(XMLGregorianCalendar value) {
        this.ukonceni = value;
    }

    /**
     * Gets the value of the zanik property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZanik() {
        return zanik;
    }

    /**
     * Sets the value of the zanik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZanik(XMLGregorianCalendar value) {
        this.zanik = value;
    }

    /**
     * Gets the value of the pozastaveniOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPozastaveniOd() {
        return pozastaveniOd;
    }

    /**
     * Sets the value of the pozastaveniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPozastaveniOd(XMLGregorianCalendar value) {
        this.pozastaveniOd = value;
    }

    /**
     * Gets the value of the pozastaveniDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPozastaveniDo() {
        return pozastaveniDo;
    }

    /**
     * Sets the value of the pozastaveniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPozastaveniDo(XMLGregorianCalendar value) {
        this.pozastaveniDo = value;
    }

    /**
     * Gets the value of the rozsahPozastaveni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRozsahPozastaveni() {
        return rozsahPozastaveni;
    }

    /**
     * Sets the value of the rozsahPozastaveni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRozsahPozastaveni(String value) {
        this.rozsahPozastaveni = value;
    }

    /**
     * Gets the value of the preruseniOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreruseniOd() {
        return preruseniOd;
    }

    /**
     * Sets the value of the preruseniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreruseniOd(XMLGregorianCalendar value) {
        this.preruseniOd = value;
    }

    /**
     * Gets the value of the preruseniDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreruseniDo() {
        return preruseniDo;
    }

    /**
     * Sets the value of the preruseniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreruseniDo(XMLGregorianCalendar value) {
        this.preruseniDo = value;
    }

    /**
     * Gets the value of the provozovny property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public ProvozovnyRZP getProvozovny() {
        return provozovny;
    }

    /**
     * Sets the value of the provozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public void setProvozovny(ProvozovnyRZP value) {
        this.provozovny = value;
    }

}
