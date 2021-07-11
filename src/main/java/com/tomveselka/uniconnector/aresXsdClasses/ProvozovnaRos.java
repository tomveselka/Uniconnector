//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.11 at 07:10:59 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provozovna_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}icp" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}sidlo_ros"/&gt;
 *         &lt;element name="Zahajeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}datum_ros" minOccurs="0"/&gt;
 *         &lt;element name="Ukonceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}datum_ros" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna_ros", propOrder = {
    "icp",
    "adresa",
    "zahajeni",
    "ukonceni"
})
public class ProvozovnaRos {

    @XmlElement(name = "ICP")
    protected BigDecimal icp;
    @XmlElement(name = "Adresa", required = true)
    protected SidloRos adresa;
    @XmlElement(name = "Zahajeni")
    protected DatumRos zahajeni;
    @XmlElement(name = "Ukonceni")
    protected DatumRos ukonceni;

    /**
     * Gets the value of the icp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getICP() {
        return icp;
    }

    /**
     * Sets the value of the icp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setICP(BigDecimal value) {
        this.icp = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link SidloRos }
     *     
     */
    public SidloRos getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidloRos }
     *     
     */
    public void setAdresa(SidloRos value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setZahajeni(DatumRos value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setUkonceni(DatumRos value) {
        this.ukonceni = value;
    }

}
