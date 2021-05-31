//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.31 at 08:54:53 PM CEST 
//


package com.tomveselka.uniconnector.isirWsdlClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for isirWsCuzkData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isirWsCuzkData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cisloSenatu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="druhVec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bcVec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rocnik" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nazevOrganizace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datumNarozeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="titulPred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulZa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nazevOsoby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="druhAdresy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ulice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cisloPopisne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="okres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zeme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="psc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="druhStavKonkursu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urlDetailRizeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dalsiDluznikVRizeni" type="{http://isirws.cca.cz/types/}priznakType" minOccurs="0"/&gt;
 *         &lt;element name="datumPmZahajeniUpadku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="datumPmUkonceniUpadku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isirWsCuzkData", propOrder = {
    "ic",
    "rc",
    "cisloSenatu",
    "druhVec",
    "bcVec",
    "rocnik",
    "nazevOrganizace",
    "datumNarozeni",
    "titulPred",
    "titulZa",
    "jmeno",
    "nazevOsoby",
    "druhAdresy",
    "mesto",
    "ulice",
    "cisloPopisne",
    "okres",
    "zeme",
    "psc",
    "druhStavKonkursu",
    "urlDetailRizeni",
    "dalsiDluznikVRizeni",
    "datumPmZahajeniUpadku",
    "datumPmUkonceniUpadku"
})
public class IsirWsCuzkData {

    protected String ic;
    protected String rc;
    protected int cisloSenatu;
    @XmlElement(required = true)
    protected String druhVec;
    protected int bcVec;
    protected int rocnik;
    protected String nazevOrganizace;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarozeni;
    protected String titulPred;
    protected String titulZa;
    protected String jmeno;
    protected String nazevOsoby;
    protected String druhAdresy;
    protected String mesto;
    protected String ulice;
    protected String cisloPopisne;
    protected String okres;
    protected String zeme;
    protected String psc;
    protected String druhStavKonkursu;
    protected String urlDetailRizeni;
    @XmlSchemaType(name = "string")
    protected PriznakType dalsiDluznikVRizeni;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPmZahajeniUpadku;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPmUkonceniUpadku;

    /**
     * Gets the value of the ic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIc() {
        return ic;
    }

    /**
     * Sets the value of the ic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIc(String value) {
        this.ic = value;
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
     * Gets the value of the cisloSenatu property.
     * 
     */
    public int getCisloSenatu() {
        return cisloSenatu;
    }

    /**
     * Sets the value of the cisloSenatu property.
     * 
     */
    public void setCisloSenatu(int value) {
        this.cisloSenatu = value;
    }

    /**
     * Gets the value of the druhVec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhVec() {
        return druhVec;
    }

    /**
     * Sets the value of the druhVec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhVec(String value) {
        this.druhVec = value;
    }

    /**
     * Gets the value of the bcVec property.
     * 
     */
    public int getBcVec() {
        return bcVec;
    }

    /**
     * Sets the value of the bcVec property.
     * 
     */
    public void setBcVec(int value) {
        this.bcVec = value;
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

    /**
     * Gets the value of the nazevOrganizace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOrganizace() {
        return nazevOrganizace;
    }

    /**
     * Sets the value of the nazevOrganizace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOrganizace(String value) {
        this.nazevOrganizace = value;
    }

    /**
     * Gets the value of the datumNarozeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNarozeni() {
        return datumNarozeni;
    }

    /**
     * Sets the value of the datumNarozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNarozeni(XMLGregorianCalendar value) {
        this.datumNarozeni = value;
    }

    /**
     * Gets the value of the titulPred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulPred() {
        return titulPred;
    }

    /**
     * Sets the value of the titulPred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulPred(String value) {
        this.titulPred = value;
    }

    /**
     * Gets the value of the titulZa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulZa() {
        return titulZa;
    }

    /**
     * Sets the value of the titulZa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulZa(String value) {
        this.titulZa = value;
    }

    /**
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmeno(String value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the nazevOsoby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOsoby() {
        return nazevOsoby;
    }

    /**
     * Sets the value of the nazevOsoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOsoby(String value) {
        this.nazevOsoby = value;
    }

    /**
     * Gets the value of the druhAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhAdresy() {
        return druhAdresy;
    }

    /**
     * Sets the value of the druhAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhAdresy(String value) {
        this.druhAdresy = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the ulice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlice() {
        return ulice;
    }

    /**
     * Sets the value of the ulice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlice(String value) {
        this.ulice = value;
    }

    /**
     * Gets the value of the cisloPopisne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloPopisne() {
        return cisloPopisne;
    }

    /**
     * Sets the value of the cisloPopisne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloPopisne(String value) {
        this.cisloPopisne = value;
    }

    /**
     * Gets the value of the okres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkres() {
        return okres;
    }

    /**
     * Sets the value of the okres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkres(String value) {
        this.okres = value;
    }

    /**
     * Gets the value of the zeme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeme() {
        return zeme;
    }

    /**
     * Sets the value of the zeme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeme(String value) {
        this.zeme = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsc() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsc(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the druhStavKonkursu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhStavKonkursu() {
        return druhStavKonkursu;
    }

    /**
     * Sets the value of the druhStavKonkursu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhStavKonkursu(String value) {
        this.druhStavKonkursu = value;
    }

    /**
     * Gets the value of the urlDetailRizeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDetailRizeni() {
        return urlDetailRizeni;
    }

    /**
     * Sets the value of the urlDetailRizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDetailRizeni(String value) {
        this.urlDetailRizeni = value;
    }

    /**
     * Gets the value of the dalsiDluznikVRizeni property.
     * 
     * @return
     *     possible object is
     *     {@link PriznakType }
     *     
     */
    public PriznakType getDalsiDluznikVRizeni() {
        return dalsiDluznikVRizeni;
    }

    /**
     * Sets the value of the dalsiDluznikVRizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriznakType }
     *     
     */
    public void setDalsiDluznikVRizeni(PriznakType value) {
        this.dalsiDluznikVRizeni = value;
    }

    /**
     * Gets the value of the datumPmZahajeniUpadku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPmZahajeniUpadku() {
        return datumPmZahajeniUpadku;
    }

    /**
     * Sets the value of the datumPmZahajeniUpadku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPmZahajeniUpadku(XMLGregorianCalendar value) {
        this.datumPmZahajeniUpadku = value;
    }

    /**
     * Gets the value of the datumPmUkonceniUpadku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPmUkonceniUpadku() {
        return datumPmUkonceniUpadku;
    }

    /**
     * Sets the value of the datumPmUkonceniUpadku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPmUkonceniUpadku(XMLGregorianCalendar value) {
        this.datumPmUkonceniUpadku = value;
    }

}
