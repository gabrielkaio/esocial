//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:31 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exclusao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: OC
 * 
 * <p>Java class for T_infoMV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_infoMV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indMV"/>
 *         &lt;element name="remunOutrEmpr" maxOccurs="999">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_codCategOE"/>
 *                   &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_vlrRemunOE"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "T_infoMV", propOrder = {
    "indMV",
    "remunOutrEmpr"
})
public class TInfoMV {

    protected byte indMV;
    @XmlElement(required = true)
    protected List<TInfoMV.RemunOutrEmpr> remunOutrEmpr;

    /**
     * Gets the value of the indMV property.
     * 
     */
    public byte getIndMV() {
        return indMV;
    }

    /**
     * Sets the value of the indMV property.
     * 
     */
    public void setIndMV(byte value) {
        this.indMV = value;
    }

    /**
     * Gets the value of the remunOutrEmpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunOutrEmpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunOutrEmpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInfoMV.RemunOutrEmpr }
     * 
     * 
     */
    public List<TInfoMV.RemunOutrEmpr> getRemunOutrEmpr() {
        if (remunOutrEmpr == null) {
            remunOutrEmpr = new ArrayList<TInfoMV.RemunOutrEmpr>();
        }
        return this.remunOutrEmpr;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_tpInsc_1_2"/>
     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrInsc_11_14"/>
     *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_codCategOE"/>
     *         &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_vlrRemunOE"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpInsc",
        "nrInsc",
        "codCateg",
        "vlrRemunOE"
    })
    public static class RemunOutrEmpr {

        protected byte tpInsc;
        @XmlElement(required = true)
        protected String nrInsc;
        @XmlElement(required = true)
        protected BigInteger codCateg;
        @XmlElement(required = true)
        protected BigDecimal vlrRemunOE;

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
         * Gets the value of the codCateg property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodCateg() {
            return codCateg;
        }

        /**
         * Sets the value of the codCateg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodCateg(BigInteger value) {
            this.codCateg = value;
        }

        /**
         * Gets the value of the vlrRemunOE property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrRemunOE() {
            return vlrRemunOE;
        }

        /**
         * Sets the value of the vlrRemunOE property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrRemunOE(BigDecimal value) {
            this.vlrRemunOE = value;
        }

    }

}
