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
 * \u010clen kontrolní komise u právní formy 932 (od 8/2006)
 * 
 * <p>Java class for kontrolni_komise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kontrolni_komise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clen_kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}clen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}textType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kontrolni_komise", propOrder = {
    "clenKontrolniKomise",
    "text"
})
public class KontrolniKomise {

    @XmlElement(name = "Clen_kontrolni_komise")
    protected List<Clen> clenKontrolniKomise;
    @XmlElement(name = "Text")
    protected List<TextType> text;

    /**
     * Gets the value of the clenKontrolniKomise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clenKontrolniKomise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClenKontrolniKomise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clen }
     * 
     * 
     */
    public List<Clen> getClenKontrolniKomise() {
        if (clenKontrolniKomise == null) {
            clenKontrolniKomise = new ArrayList<Clen>();
        }
        return this.clenKontrolniKomise;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

}
