//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.06 at 08:15:14 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o subjektu v SZR
 * 
 * <p>Java class for subjekt_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_szr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Klic_szr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Zkr_obch_jmeno" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Dic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}dic" minOccurs="0"/&gt;
 *         &lt;element name="Rodne_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo" minOccurs="0"/&gt;
 *         &lt;element name="Icd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1111"/&gt;
 *               &lt;enumeration value="1112"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *         &lt;element name="Financni_urad_adr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *         &lt;element name="Kod_platce_dane" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Je_platce_dph" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Osoba_szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}osoba_szr" minOccurs="0"/&gt;
 *         &lt;element name="Datum_aktualizace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_vyrazeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Vyrazen" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Kontakty" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}kontakty_szr" minOccurs="0"/&gt;
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresy_szr" minOccurs="0"/&gt;
 *         &lt;element name="Provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}provozovny_szr" minOccurs="0"/&gt;
 *         &lt;element name="Exids" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}exids_szr" minOccurs="0"/&gt;
 *         &lt;element name="Registry" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}registry_szr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="regdod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="regddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="regkod"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_szr", propOrder = {
    "klicSzr",
    "obchodniJmeno",
    "zkrObchJmeno",
    "ico",
    "klicARES",
    "dic",
    "rodneCislo",
    "icd",
    "financniUrad",
    "financniUradAdr",
    "kodPlatceDane",
    "jePlatceDph",
    "osobaSzr",
    "datumAktualizace",
    "datumVyrazeni",
    "vyrazen",
    "kontakty",
    "adresy",
    "provozovny",
    "exids",
    "registry"
})
public class SubjektSzr {

    @XmlElement(name = "Klic_szr")
    protected Integer klicSzr;
    @XmlElement(name = "Obchodni_jmeno")
    protected String obchodniJmeno;
    @XmlElement(name = "Zkr_obch_jmeno")
    protected String zkrObchJmeno;
    @XmlElement(name = "Ico")
    protected String ico;
    @XmlElement(name = "Klic_ARES")
    protected Integer klicARES;
    @XmlElement(name = "Dic")
    protected String dic;
    @XmlElement(name = "Rodne_cislo")
    protected String rodneCislo;
    @XmlElement(name = "Icd")
    protected String icd;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlElement(name = "Financni_urad_adr")
    protected FinancniUrad financniUradAdr;
    @XmlElement(name = "Kod_platce_dane")
    protected String kodPlatceDane;
    @XmlElement(name = "Je_platce_dph")
    protected String jePlatceDph;
    @XmlElement(name = "Osoba_szr")
    protected OsobaSzr osobaSzr;
    @XmlElement(name = "Datum_aktualizace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAktualizace;
    @XmlElement(name = "Datum_vyrazeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVyrazeni;
    @XmlElement(name = "Vyrazen")
    protected String vyrazen;
    @XmlElement(name = "Kontakty")
    protected KontaktySzr kontakty;
    @XmlElement(name = "Adresy")
    protected AdresySzr adresy;
    @XmlElement(name = "Provozovny")
    protected ProvozovnySzr provozovny;
    @XmlElement(name = "Exids")
    protected ExidsSzr exids;
    @XmlElement(name = "Registry")
    protected RegistrySzr registry;
    @XmlAttribute(name = "regdod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regdod;
    @XmlAttribute(name = "regddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regddo;
    @XmlAttribute(name = "regkod")
    protected String regkod;

    /**
     * Gets the value of the klicSzr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicSzr() {
        return klicSzr;
    }

    /**
     * Sets the value of the klicSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicSzr(Integer value) {
        this.klicSzr = value;
    }

    /**
     * Gets the value of the obchodniJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniJmeno() {
        return obchodniJmeno;
    }

    /**
     * Sets the value of the obchodniJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniJmeno(String value) {
        this.obchodniJmeno = value;
    }

    /**
     * Gets the value of the zkrObchJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkrObchJmeno() {
        return zkrObchJmeno;
    }

    /**
     * Sets the value of the zkrObchJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkrObchJmeno(String value) {
        this.zkrObchJmeno = value;
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
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDic() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDic(String value) {
        this.dic = value;
    }

    /**
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
    }

    /**
     * Gets the value of the icd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcd() {
        return icd;
    }

    /**
     * Sets the value of the icd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcd(String value) {
        this.icd = value;
    }

    /**
     * Gets the value of the financniUrad property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFinancniUrad() {
        return financniUrad;
    }

    /**
     * Sets the value of the financniUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFinancniUrad(FinancniUrad value) {
        this.financniUrad = value;
    }

    /**
     * Gets the value of the financniUradAdr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFinancniUradAdr() {
        return financniUradAdr;
    }

    /**
     * Sets the value of the financniUradAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFinancniUradAdr(FinancniUrad value) {
        this.financniUradAdr = value;
    }

    /**
     * Gets the value of the kodPlatceDane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPlatceDane() {
        return kodPlatceDane;
    }

    /**
     * Sets the value of the kodPlatceDane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPlatceDane(String value) {
        this.kodPlatceDane = value;
    }

    /**
     * Gets the value of the jePlatceDph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJePlatceDph() {
        return jePlatceDph;
    }

    /**
     * Sets the value of the jePlatceDph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJePlatceDph(String value) {
        this.jePlatceDph = value;
    }

    /**
     * Gets the value of the osobaSzr property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaSzr }
     *     
     */
    public OsobaSzr getOsobaSzr() {
        return osobaSzr;
    }

    /**
     * Sets the value of the osobaSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaSzr }
     *     
     */
    public void setOsobaSzr(OsobaSzr value) {
        this.osobaSzr = value;
    }

    /**
     * Gets the value of the datumAktualizace property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumAktualizace() {
        return datumAktualizace;
    }

    /**
     * Sets the value of the datumAktualizace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumAktualizace(XMLGregorianCalendar value) {
        this.datumAktualizace = value;
    }

    /**
     * Gets the value of the datumVyrazeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVyrazeni() {
        return datumVyrazeni;
    }

    /**
     * Sets the value of the datumVyrazeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVyrazeni(XMLGregorianCalendar value) {
        this.datumVyrazeni = value;
    }

    /**
     * Gets the value of the vyrazen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyrazen() {
        return vyrazen;
    }

    /**
     * Sets the value of the vyrazen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyrazen(String value) {
        this.vyrazen = value;
    }

    /**
     * Gets the value of the kontakty property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktySzr }
     *     
     */
    public KontaktySzr getKontakty() {
        return kontakty;
    }

    /**
     * Sets the value of the kontakty property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktySzr }
     *     
     */
    public void setKontakty(KontaktySzr value) {
        this.kontakty = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresySzr }
     *     
     */
    public AdresySzr getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresySzr }
     *     
     */
    public void setAdresy(AdresySzr value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the provozovny property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnySzr }
     *     
     */
    public ProvozovnySzr getProvozovny() {
        return provozovny;
    }

    /**
     * Sets the value of the provozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnySzr }
     *     
     */
    public void setProvozovny(ProvozovnySzr value) {
        this.provozovny = value;
    }

    /**
     * Gets the value of the exids property.
     * 
     * @return
     *     possible object is
     *     {@link ExidsSzr }
     *     
     */
    public ExidsSzr getExids() {
        return exids;
    }

    /**
     * Sets the value of the exids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExidsSzr }
     *     
     */
    public void setExids(ExidsSzr value) {
        this.exids = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrySzr }
     *     
     */
    public RegistrySzr getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrySzr }
     *     
     */
    public void setRegistry(RegistrySzr value) {
        this.registry = value;
    }

    /**
     * Gets the value of the regdod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegdod() {
        return regdod;
    }

    /**
     * Sets the value of the regdod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegdod(XMLGregorianCalendar value) {
        this.regdod = value;
    }

    /**
     * Gets the value of the regddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegddo() {
        return regddo;
    }

    /**
     * Sets the value of the regddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegddo(XMLGregorianCalendar value) {
        this.regddo = value;
    }

    /**
     * Gets the value of the regkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegkod() {
        return regkod;
    }

    /**
     * Sets the value of the regkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegkod(String value) {
        this.regkod = value;
    }

}
