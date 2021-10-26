//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.26 at 10:55:39 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_OR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_OR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}error_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Vysledek_hledani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vysledek_hledani"/&gt;
 *         &lt;element name="Pocet_zaznamu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vypis_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vypis_OR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_OR", propOrder = {
    "pomocneID",
    "error",
    "vysledekHledani",
    "pocetZaznamu",
    "vypisOR"
})
public class OdpovedOR {

    @XmlElement(name = "Pomocne_ID")
    protected int pomocneID;
    @XmlElement(name = "Error")
    protected ErrorARES error;
    @XmlElement(name = "Vysledek_hledani", required = true)
    protected VysledekHledani vysledekHledani;
    @XmlElement(name = "Pocet_zaznamu")
    protected int pocetZaznamu;
    @XmlElement(name = "Vypis_OR")
    protected List<VypisOR> vypisOR;

    /**
     * Gets the value of the pomocneID property.
     * 
     */
    public int getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     */
    public void setPomocneID(int value) {
        this.pomocneID = value;
    }

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
     * Gets the value of the vysledekHledani property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani }
     *     
     */
    public VysledekHledani getVysledekHledani() {
        return vysledekHledani;
    }

    /**
     * Sets the value of the vysledekHledani property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani }
     *     
     */
    public void setVysledekHledani(VysledekHledani value) {
        this.vysledekHledani = value;
    }

    /**
     * Gets the value of the pocetZaznamu property.
     * 
     */
    public int getPocetZaznamu() {
        return pocetZaznamu;
    }

    /**
     * Sets the value of the pocetZaznamu property.
     * 
     */
    public void setPocetZaznamu(int value) {
        this.pocetZaznamu = value;
    }

    /**
     * Gets the value of the vypisOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vypisOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVypisOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VypisOR }
     * 
     * 
     */
    public List<VypisOR> getVypisOR() {
        if (vypisOR == null) {
            vypisOR = new ArrayList<VypisOR>();
        }
        return this.vypisOR;
    }

}
