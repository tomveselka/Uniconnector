//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.11 at 07:10:59 PM CEST 
//


package com.tomveselka.uniconnector.aresXsdClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Spole\u010dné údaje o konkurzu, vyrovnání nebo zamítnutí konkurzu (K, V nebo Z)
 * 
 * <p>Java class for udaje_KVZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udaje_KVZ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Txt_KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}txt_KVZ" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udaje_KVZ", propOrder = {
    "txtKVZ"
})
public class UdajeKVZ {

    @XmlElement(name = "Txt_KVZ")
    protected List<TxtKVZ> txtKVZ;

    /**
     * Gets the value of the txtKVZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtKVZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxtKVZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxtKVZ }
     * 
     * 
     */
    public List<TxtKVZ> getTxtKVZ() {
        if (txtKVZ == null) {
            txtKVZ = new ArrayList<TxtKVZ>();
        }
        return this.txtKVZ;
    }

}
