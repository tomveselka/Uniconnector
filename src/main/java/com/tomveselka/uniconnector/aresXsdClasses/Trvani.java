//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.11 at 07:10:59 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Datumy za\u010dátku a konce \u010dlenství v orgánu pro \u010dleny dozor\u010dích rad a statutárních orgán\u016f
 * 
 * <p>Java class for trvani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trvani"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum_zacatku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_konce" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trvani", propOrder = {
    "datumZacatku",
    "datumKonce"
})
public class Trvani {

    @XmlElement(name = "Datum_zacatku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZacatku;
    @XmlElement(name = "Datum_konce")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumKonce;

    /**
     * Gets the value of the datumZacatku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZacatku() {
        return datumZacatku;
    }

    /**
     * Sets the value of the datumZacatku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZacatku(XMLGregorianCalendar value) {
        this.datumZacatku = value;
    }

    /**
     * Gets the value of the datumKonce property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumKonce() {
        return datumKonce;
    }

    /**
     * Sets the value of the datumKonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumKonce(XMLGregorianCalendar value) {
        this.datumKonce = value;
    }

}
