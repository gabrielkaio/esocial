//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:16 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.rmnrpps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_localTrabGeral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_localTrabGeral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_02_00}TS_tpInsc_1_3_4"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_02_00}TS_nrInsc_12_14"/>
 *         &lt;element name="descComp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *               &lt;pattern value="[^\s]{1}[\S\s]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_localTrabGeral", propOrder = {
    "tpInsc",
    "nrInsc",
    "descComp"
})
public class TLocalTrabGeral {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    protected String descComp;

    /**
     * Gets the value of the tpInsc property.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Sets the value of the tpInsc property.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Gets the value of the nrInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Sets the value of the nrInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Gets the value of the descComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescComp() {
        return descComp;
    }

    /**
     * Sets the value of the descComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescComp(String value) {
        this.descComp = value;
    }

}
