//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:37:55 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fgts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {tpInsc}, {nrInsc}
 * 
 * <p>Java class for T_ideEmpregador_exclusao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideEmpregador_exclusao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_8_11_14"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEmpregador_exclusao", propOrder = {
    "tpInsc",
    "nrInsc"
})
public class TIdeEmpregadorExclusao {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;

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

}
