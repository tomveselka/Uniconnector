//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.26 at 10:55:39 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifika\u010dní a aloka\u010dní v ROS u ekonomického subjektu v d\u0159íve existujících detailech ARES
 * 
 * <p>Java class for zakladni_udaje_ros_detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_ros_detail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Agenda" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="OVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_forma" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_stav_ros" minOccurs="0"/&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_ros_detail", propOrder = {
    "agenda",
    "ovm",
    "pravniForma",
    "pravniStav",
    "ico",
    "obchodniFirma",
    "sidlo",
    "platnostOd",
    "platnostDo"
})
public class ZakladniUdajeRosDetail {

    @XmlElement(name = "Agenda")
    protected String agenda;
    @XmlElement(name = "OVM")
    protected String ovm;
    @XmlElement(name = "Pravni_forma")
    protected PravniForma pravniForma;
    @XmlElement(name = "Pravni_stav")
    protected PravniStavRos pravniStav;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Obchodni_firma")
    protected ObchodniFirma obchodniFirma;
    @XmlElement(name = "Sidlo")
    protected AdresaARES sidlo;
    @XmlElement(name = "Platnost_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Platnost_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostDo;

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
     * Gets the value of the ovm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVM() {
        return ovm;
    }

    /**
     * Sets the value of the ovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVM(String value) {
        this.ovm = value;
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
     * Gets the value of the pravniStav property.
     * 
     * @return
     *     possible object is
     *     {@link PravniStavRos }
     *     
     */
    public PravniStavRos getPravniStav() {
        return pravniStav;
    }

    /**
     * Sets the value of the pravniStav property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniStavRos }
     *     
     */
    public void setPravniStav(PravniStavRos value) {
        this.pravniStav = value;
    }

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
     *     {@link ObchodniFirma }
     *     
     */
    public ObchodniFirma getObchodniFirma() {
        return obchodniFirma;
    }

    /**
     * Sets the value of the obchodniFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObchodniFirma }
     *     
     */
    public void setObchodniFirma(ObchodniFirma value) {
        this.obchodniFirma = value;
    }

    /**
     * Gets the value of the sidlo property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getSidlo() {
        return sidlo;
    }

    /**
     * Sets the value of the sidlo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setSidlo(AdresaARES value) {
        this.sidlo = value;
    }

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the platnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostDo() {
        return platnostDo;
    }

    /**
     * Sets the value of the platnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostDo(XMLGregorianCalendar value) {
        this.platnostDo = value;
    }

}
