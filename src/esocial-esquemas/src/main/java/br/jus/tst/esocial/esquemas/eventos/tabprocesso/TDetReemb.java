//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:19 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabprocesso;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_detReemb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_detReemb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_02_00}TS_tpInsc_1_2"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_02_00}TS_nrInsc_11_14"/>
 *         &lt;element name="vlrReemb" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_02_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *         &lt;element name="vlrReembAnt" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_02_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_detReemb", propOrder = {
    "tpInsc",
    "nrInsc",
    "vlrReemb",
    "vlrReembAnt"
})
public class TDetReemb {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    protected BigDecimal vlrReemb;
    protected BigDecimal vlrReembAnt;

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
     * Gets the value of the vlrReemb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrReemb() {
        return vlrReemb;
    }

    /**
     * Sets the value of the vlrReemb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrReemb(BigDecimal value) {
        this.vlrReemb = value;
    }

    /**
     * Gets the value of the vlrReembAnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrReembAnt() {
        return vlrReembAnt;
    }

    /**
     * Sets the value of the vlrReembAnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrReembAnt(BigDecimal value) {
        this.vlrReembAnt = value;
    }

}
