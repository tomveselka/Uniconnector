//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.20 at 08:15:02 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikačníúdaje
 * 
 * <p>Java class for zakladni_udaje_RCNS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RCNS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Odkaz_CNS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Stav_subjektu_RCNS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_CPO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}dic" minOccurs="0"/&gt;
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *         &lt;element name="Typ_CNS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}typ_CNS" minOccurs="0"/&gt;
 *         &lt;element name="Zkr_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zkr_statu" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_statu" minOccurs="0"/&gt;
 *         &lt;element name="Kod_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_pravni_formy" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_pravni_formy" minOccurs="0"/&gt;
 *         &lt;element name="Registrace_RCNS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}registrace_RCNS" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Zvlastni_prava" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Zpusob_jednani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Organy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organy" minOccurs="0"/&gt;
 *         &lt;element name="Likvidatori" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organy" minOccurs="0"/&gt;
 *         &lt;element name="Spravci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organy" minOccurs="0"/&gt;
 *         &lt;element name="Opatrovnici" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organy" minOccurs="0"/&gt;
 *         &lt;element name="Clen_svazu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ico" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RCNS", propOrder = {
    "datumZmeny",
    "odkazCNS",
    "klicARES",
    "stavSubjektuRCNS",
    "ico",
    "nazevCPO",
    "dic",
    "financniUrad",
    "typCNS",
    "zkrStatu",
    "nazevStatu",
    "kodPF",
    "nazevPF",
    "registraceRCNS",
    "adresa",
    "zvlastniPrava",
    "zpusobJednani",
    "organy",
    "likvidatori",
    "spravci",
    "opatrovnici",
    "clenSvazu"
})
public class ZakladniUdajeRCNS {

    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "Odkaz_CNS")
    protected Integer odkazCNS;
    @XmlElement(name = "Klic_ARES")
    protected Integer klicARES;
    @XmlElement(name = "Stav_subjektu_RCNS")
    protected String stavSubjektuRCNS;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Nazev_CPO")
    protected String nazevCPO;
    @XmlElement(name = "DIC")
    protected Dic dic;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlElement(name = "Typ_CNS")
    @XmlSchemaType(name = "string")
    protected TypCNS typCNS;
    @XmlElement(name = "Zkr_statu")
    protected String zkrStatu;
    @XmlElement(name = "Nazev_statu")
    protected String nazevStatu;
    @XmlElement(name = "Kod_PF")
    protected Short kodPF;
    @XmlElement(name = "Nazev_PF")
    protected String nazevPF;
    @XmlElement(name = "Registrace_RCNS")
    protected RegistraceRCNS registraceRCNS;
    @XmlElement(name = "Adresa")
    protected List<AdresaARES> adresa;
    @XmlElement(name = "Zvlastni_prava")
    protected Texty zvlastniPrava;
    @XmlElement(name = "Zpusob_jednani")
    protected Texty zpusobJednani;
    @XmlElement(name = "Organy")
    protected Organy organy;
    @XmlElement(name = "Likvidatori")
    protected Organy likvidatori;
    @XmlElement(name = "Spravci")
    protected Organy spravci;
    @XmlElement(name = "Opatrovnici")
    protected Organy opatrovnici;
    @XmlElement(name = "Clen_svazu")
    protected List<Ico> clenSvazu;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

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
     * Gets the value of the odkazCNS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdkazCNS() {
        return odkazCNS;
    }

    /**
     * Sets the value of the odkazCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdkazCNS(Integer value) {
        this.odkazCNS = value;
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
     * Gets the value of the stavSubjektuRCNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStavSubjektuRCNS() {
        return stavSubjektuRCNS;
    }

    /**
     * Sets the value of the stavSubjektuRCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStavSubjektuRCNS(String value) {
        this.stavSubjektuRCNS = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
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
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the nazevCPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCPO() {
        return nazevCPO;
    }

    /**
     * Sets the value of the nazevCPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCPO(String value) {
        this.nazevCPO = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link Dic }
     *     
     */
    public Dic getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dic }
     *     
     */
    public void setDIC(Dic value) {
        this.dic = value;
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
     * Gets the value of the typCNS property.
     * 
     * @return
     *     possible object is
     *     {@link TypCNS }
     *     
     */
    public TypCNS getTypCNS() {
        return typCNS;
    }

    /**
     * Sets the value of the typCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypCNS }
     *     
     */
    public void setTypCNS(TypCNS value) {
        this.typCNS = value;
    }

    /**
     * Gets the value of the zkrStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkrStatu() {
        return zkrStatu;
    }

    /**
     * Sets the value of the zkrStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkrStatu(String value) {
        this.zkrStatu = value;
    }

    /**
     * Gets the value of the nazevStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevStatu() {
        return nazevStatu;
    }

    /**
     * Sets the value of the nazevStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevStatu(String value) {
        this.nazevStatu = value;
    }

    /**
     * Gets the value of the kodPF property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKodPF() {
        return kodPF;
    }

    /**
     * Sets the value of the kodPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKodPF(Short value) {
        this.kodPF = value;
    }

    /**
     * Gets the value of the nazevPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPF() {
        return nazevPF;
    }

    /**
     * Sets the value of the nazevPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPF(String value) {
        this.nazevPF = value;
    }

    /**
     * Gets the value of the registraceRCNS property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRCNS }
     *     
     */
    public RegistraceRCNS getRegistraceRCNS() {
        return registraceRCNS;
    }

    /**
     * Sets the value of the registraceRCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRCNS }
     *     
     */
    public void setRegistraceRCNS(RegistraceRCNS value) {
        this.registraceRCNS = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getAdresa() {
        if (adresa == null) {
            adresa = new ArrayList<AdresaARES>();
        }
        return this.adresa;
    }

    /**
     * Gets the value of the zvlastniPrava property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getZvlastniPrava() {
        return zvlastniPrava;
    }

    /**
     * Sets the value of the zvlastniPrava property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setZvlastniPrava(Texty value) {
        this.zvlastniPrava = value;
    }

    /**
     * Gets the value of the zpusobJednani property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getZpusobJednani() {
        return zpusobJednani;
    }

    /**
     * Sets the value of the zpusobJednani property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setZpusobJednani(Texty value) {
        this.zpusobJednani = value;
    }

    /**
     * Gets the value of the organy property.
     * 
     * @return
     *     possible object is
     *     {@link Organy }
     *     
     */
    public Organy getOrgany() {
        return organy;
    }

    /**
     * Sets the value of the organy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy }
     *     
     */
    public void setOrgany(Organy value) {
        this.organy = value;
    }

    /**
     * Gets the value of the likvidatori property.
     * 
     * @return
     *     possible object is
     *     {@link Organy }
     *     
     */
    public Organy getLikvidatori() {
        return likvidatori;
    }

    /**
     * Sets the value of the likvidatori property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy }
     *     
     */
    public void setLikvidatori(Organy value) {
        this.likvidatori = value;
    }

    /**
     * Gets the value of the spravci property.
     * 
     * @return
     *     possible object is
     *     {@link Organy }
     *     
     */
    public Organy getSpravci() {
        return spravci;
    }

    /**
     * Sets the value of the spravci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy }
     *     
     */
    public void setSpravci(Organy value) {
        this.spravci = value;
    }

    /**
     * Gets the value of the opatrovnici property.
     * 
     * @return
     *     possible object is
     *     {@link Organy }
     *     
     */
    public Organy getOpatrovnici() {
        return opatrovnici;
    }

    /**
     * Sets the value of the opatrovnici property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy }
     *     
     */
    public void setOpatrovnici(Organy value) {
        this.opatrovnici = value;
    }

    /**
     * Gets the value of the clenSvazu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clenSvazu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClenSvazu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ico }
     * 
     * 
     */
    public List<Ico> getClenSvazu() {
        if (clenSvazu == null) {
            clenSvazu = new ArrayList<Ico>();
        }
        return this.clenSvazu;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

}
