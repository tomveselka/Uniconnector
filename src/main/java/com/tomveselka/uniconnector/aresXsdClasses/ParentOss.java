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


/**
 * Rodi\u010d subjektu OSS (od listopadu 2010)
 * 
 * <p>Java class for parent_oss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parent_oss"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav_oss" minOccurs="0"/&gt;
 *         &lt;element name="Nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obchodni_firma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_oss", propOrder = {
    "ic",
    "stav",
    "nazev"
})
public class ParentOss {

    @XmlElement(name = "Ic")
    protected String ic;
    @XmlElement(name = "Stav")
    @XmlSchemaType(name = "string")
    protected StavOss stav;
    @XmlElement(name = "Nazev")
    protected ObchodniFirma nazev;

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
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link StavOss }
     *     
     */
    public StavOss getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavOss }
     *     
     */
    public void setStav(StavOss value) {
        this.stav = value;
    }

    /**
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link ObchodniFirma }
     *     
     */
    public ObchodniFirma getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObchodniFirma }
     *     
     */
    public void setNazev(ObchodniFirma value) {
        this.nazev = value;
    }

}
