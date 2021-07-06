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
 * z Hlavní tabulky úpadc\u016f - slouží zejména pro rozlišení, o jakého úpadce se jedná
 * 
 * <p>Java class for stav_subjektu_ceu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stav_subjektu_ceu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stav_konkurzu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav_upadce_CEU"/&gt;
 *         &lt;element name="Stav_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav_upadce_CEU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stav_subjektu_ceu", propOrder = {
    "stavKonkurzu",
    "stavVyrovnani"
})
public class StavSubjektuCeu {

    @XmlElement(name = "Stav_konkurzu", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU stavKonkurzu;
    @XmlElement(name = "Stav_vyrovnani", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU stavVyrovnani;

    /**
     * Gets the value of the stavKonkurzu property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavKonkurzu() {
        return stavKonkurzu;
    }

    /**
     * Sets the value of the stavKonkurzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavKonkurzu(StavUpadceCEU value) {
        this.stavKonkurzu = value;
    }

    /**
     * Gets the value of the stavVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavVyrovnani() {
        return stavVyrovnani;
    }

    /**
     * Sets the value of the stavVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavVyrovnani(StavUpadceCEU value) {
        this.stavVyrovnani = value;
    }

}
