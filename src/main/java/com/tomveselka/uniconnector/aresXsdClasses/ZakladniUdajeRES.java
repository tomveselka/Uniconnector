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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifika\u010dní a aloka\u010dní údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_RES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_forma" minOccurs="0"/&gt;
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Zpusob_zaniku" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zpusob_zaniku_res" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RES", propOrder = {
    "ico",
    "obchodniFirma",
    "pravniForma",
    "financniUrad",
    "datumVzniku",
    "datumZaniku",
    "zpusobZaniku"
})
public class ZakladniUdajeRES {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Obchodni_firma")
    protected String obchodniFirma;
    @XmlElement(name = "Pravni_forma")
    protected PravniForma pravniForma;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlElement(name = "Datum_vzniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Zpusob_zaniku")
    protected Short zpusobZaniku;

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
     * Gets the value of the obchodniFirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniFirma() {
        return obchodniFirma;
    }

    /**
     * Sets the value of the obchodniFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniFirma(String value) {
        this.obchodniFirma = value;
    }

    /**
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma }
     *     
     */
    public PravniForma getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma }
     *     
     */
    public void setPravniForma(PravniForma value) {
        this.pravniForma = value;
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
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVzniku(XMLGregorianCalendar value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZaniku(XMLGregorianCalendar value) {
        this.datumZaniku = value;
    }

    /**
     * Gets the value of the zpusobZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZpusobZaniku() {
        return zpusobZaniku;
    }

    /**
     * Sets the value of the zpusobZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZpusobZaniku(Short value) {
        this.zpusobZaniku = value;
    }

}
