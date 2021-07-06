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
 * Informace o zm\u011bnách v jádru ARES - odpov\u011b\u010f
 * 
 * <p>Java class for odpoved_zm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_zm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}error_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Help" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}help_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}uvod" minOccurs="0"/&gt;
 *         &lt;element name="Zadani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zadani" minOccurs="0"/&gt;
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}seznam_subjektu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_zm", propOrder = {
    "error",
    "help",
    "uvod",
    "zadani",
    "s"
})
public class OdpovedZm {

    @XmlElement(name = "Error")
    protected ErrorARES error;
    @XmlElement(name = "Help")
    protected HelpARES help;
    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zadani")
    protected Zadani zadani;
    @XmlElement(name = "S")
    protected SeznamSubjektu s;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES }
     *     
     */
    public ErrorARES getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES }
     *     
     */
    public void setError(ErrorARES value) {
        this.error = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link HelpARES }
     *     
     */
    public HelpARES getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpARES }
     *     
     */
    public void setHelp(HelpARES value) {
        this.help = value;
    }

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zadani property.
     * 
     * @return
     *     possible object is
     *     {@link Zadani }
     *     
     */
    public Zadani getZadani() {
        return zadani;
    }

    /**
     * Sets the value of the zadani property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zadani }
     *     
     */
    public void setZadani(Zadani value) {
        this.zadani = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link SeznamSubjektu }
     *     
     */
    public SeznamSubjektu getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeznamSubjektu }
     *     
     */
    public void setS(SeznamSubjektu value) {
        this.s = value;
    }

}