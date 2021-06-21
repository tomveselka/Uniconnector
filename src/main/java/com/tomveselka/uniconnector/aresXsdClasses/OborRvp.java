//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.20 at 08:15:02 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for obor_rvp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obor_rvp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Obor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Obor_txt"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Agenda"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Id_org_jed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dregod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="dregdo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="dregoz" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obor_rvp", propOrder = {
    "obor",
    "oborTxt",
    "agenda",
    "idOrgJed"
})
public class OborRvp {

    @XmlElement(name = "Obor", required = true)
    protected String obor;
    @XmlElement(name = "Obor_txt", required = true)
    protected String oborTxt;
    @XmlElement(name = "Agenda", required = true)
    protected String agenda;
    @XmlElement(name = "Id_org_jed")
    protected Integer idOrgJed;
    @XmlAttribute(name = "dregod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dregod;
    @XmlAttribute(name = "dregdo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dregdo;
    @XmlAttribute(name = "dregoz")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dregoz;

    /**
     * Gets the value of the obor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObor() {
        return obor;
    }

    /**
     * Sets the value of the obor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObor(String value) {
        this.obor = value;
    }

    /**
     * Gets the value of the oborTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOborTxt() {
        return oborTxt;
    }

    /**
     * Sets the value of the oborTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOborTxt(String value) {
        this.oborTxt = value;
    }

    /**
     * Gets the value of the agenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Sets the value of the agenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenda(String value) {
        this.agenda = value;
    }

    /**
     * Gets the value of the idOrgJed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOrgJed() {
        return idOrgJed;
    }

    /**
     * Sets the value of the idOrgJed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOrgJed(Integer value) {
        this.idOrgJed = value;
    }

    /**
     * Gets the value of the dregod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDregod() {
        return dregod;
    }

    /**
     * Sets the value of the dregod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDregod(XMLGregorianCalendar value) {
        this.dregod = value;
    }

    /**
     * Gets the value of the dregdo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDregdo() {
        return dregdo;
    }

    /**
     * Sets the value of the dregdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDregdo(XMLGregorianCalendar value) {
        this.dregdo = value;
    }

    /**
     * Gets the value of the dregoz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDregoz() {
        return dregoz;
    }

    /**
     * Sets the value of the dregoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDregoz(XMLGregorianCalendar value) {
        this.dregoz = value;
    }

}
