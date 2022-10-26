//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:40:20 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvinicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais casos)
 * 
 * <p>Java class for T_endereco_exterior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_endereco_exterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paisResid" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_pais"/>
 *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dscLograd"/>
 *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrLograd"/>
 *         &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_complemento" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_bairro" minOccurs="0"/>
 *         &lt;element name="nmCid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="50"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codPostal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_endereco_exterior", propOrder = {
    "paisResid",
    "dscLograd",
    "nrLograd",
    "complemento",
    "bairro",
    "nmCid",
    "codPostal"
})
public class TEnderecoExterior {

    @XmlElement(required = true)
    protected String paisResid;
    @XmlElement(required = true)
    protected String dscLograd;
    @XmlElement(required = true)
    protected String nrLograd;
    protected String complemento;
    protected String bairro;
    @XmlElement(required = true)
    protected String nmCid;
    protected String codPostal;

    /**
     * Gets the value of the paisResid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResid() {
        return paisResid;
    }

    /**
     * Sets the value of the paisResid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResid(String value) {
        this.paisResid = value;
    }

    /**
     * Gets the value of the dscLograd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscLograd() {
        return dscLograd;
    }

    /**
     * Sets the value of the dscLograd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscLograd(String value) {
        this.dscLograd = value;
    }

    /**
     * Gets the value of the nrLograd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrLograd() {
        return nrLograd;
    }

    /**
     * Sets the value of the nrLograd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrLograd(String value) {
        this.nrLograd = value;
    }

    /**
     * Gets the value of the complemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets the value of the complemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Gets the value of the nmCid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmCid() {
        return nmCid;
    }

    /**
     * Sets the value of the nmCid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmCid(String value) {
        this.nmCid = value;
    }

    /**
     * Gets the value of the codPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Sets the value of the codPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

}
