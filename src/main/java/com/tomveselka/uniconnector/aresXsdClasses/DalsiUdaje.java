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
 * <p>Java class for dalsi_udaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dalsi_udaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Druh_zarizeni_kod" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Druh_zarizeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Druh_zrizovatele_kod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Druh_zrizovatele" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dalsi_udaje", propOrder = {
    "druhZarizeniKod",
    "druhZarizeni",
    "druhZrizovateleKod",
    "druhZrizovatele"
})
public class DalsiUdaje {

    @XmlElement(name = "Druh_zarizeni_kod")
    protected Short druhZarizeniKod;
    @XmlElement(name = "Druh_zarizeni")
    protected String druhZarizeni;
    @XmlElement(name = "Druh_zrizovatele_kod")
    protected Integer druhZrizovateleKod;
    @XmlElement(name = "Druh_zrizovatele")
    protected String druhZrizovatele;

    /**
     * Gets the value of the druhZarizeniKod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDruhZarizeniKod() {
        return druhZarizeniKod;
    }

    /**
     * Sets the value of the druhZarizeniKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDruhZarizeniKod(Short value) {
        this.druhZarizeniKod = value;
    }

    /**
     * Gets the value of the druhZarizeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZarizeni() {
        return druhZarizeni;
    }

    /**
     * Sets the value of the druhZarizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZarizeni(String value) {
        this.druhZarizeni = value;
    }

    /**
     * Gets the value of the druhZrizovateleKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDruhZrizovateleKod() {
        return druhZrizovateleKod;
    }

    /**
     * Sets the value of the druhZrizovateleKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDruhZrizovateleKod(Integer value) {
        this.druhZrizovateleKod = value;
    }

    /**
     * Gets the value of the druhZrizovatele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZrizovatele() {
        return druhZrizovatele;
    }

    /**
     * Sets the value of the druhZrizovatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZrizovatele(String value) {
        this.druhZrizovatele = value;
    }

}
