//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.20 at 08:15:02 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o angažované fyzické osobě v SKO
 * 
 * <p>Java class for fyzicka_osoba_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fyzicka_osoba_sko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Osobni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}osobni_udaje_sko" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fyzicka_osoba_sko", propOrder = {
    "osobniUdaje",
    "adresa"
})
public class FyzickaOsobaSko {

    @XmlElement(name = "Osobni_udaje")
    protected OsobniUdajeSko osobniUdaje;
    @XmlElement(name = "Adresa")
    protected AdresaARES adresa;

    /**
     * Gets the value of the osobniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link OsobniUdajeSko }
     *     
     */
    public OsobniUdajeSko getOsobniUdaje() {
        return osobniUdaje;
    }

    /**
     * Sets the value of the osobniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobniUdajeSko }
     *     
     */
    public void setOsobniUdaje(OsobniUdajeSko value) {
        this.osobniUdaje = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresa(AdresaARES value) {
        this.adresa = value;
    }

}
