//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcontratual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_alvaraJudicial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_alvaraJudicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_nrProcJud"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_alvaraJudicial", propOrder = {
    "nrProcJud"
})
public class TAlvaraJudicial {

    @XmlElement(required = true)
    protected String nrProcJud;

    /**
     * Gets the value of the nrProcJud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcJud() {
        return nrProcJud;
    }

    /**
     * Sets the value of the nrProcJud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcJud(String value) {
        this.nrProcJud = value;
    }

}
