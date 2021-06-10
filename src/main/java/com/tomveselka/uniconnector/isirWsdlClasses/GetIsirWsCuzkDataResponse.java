//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.10 at 11:09:39 PM CEST 
//


package com.tomveselka.uniconnector.isirWsdlClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://isirws.cca.cz/types/}isirWsCuzkData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stav" type="{http://isirws.cca.cz/types/}isirWsCuzkStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data",
    "stav"
})
@XmlRootElement(name = "getIsirWsCuzkDataResponse")
public class GetIsirWsCuzkDataResponse {

    @XmlElement(nillable = true)
    protected List<IsirWsCuzkData> data;
    @XmlElement(required = true)
    protected IsirWsCuzkStatus stav;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsirWsCuzkData }
     * 
     * 
     */
    public List<IsirWsCuzkData> getData() {
        if (data == null) {
            data = new ArrayList<IsirWsCuzkData>();
        }
        return this.data;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link IsirWsCuzkStatus }
     *     
     */
    public IsirWsCuzkStatus getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsirWsCuzkStatus }
     *     
     */
    public void setStav(IsirWsCuzkStatus value) {
        this.stav = value;
    }

	public void setData(List<IsirWsCuzkData> data) {
		this.data = data;
	}

}
