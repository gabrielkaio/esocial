//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:39:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infocomplper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtInfoComplPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEvento_folha"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoSubstPatr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
 *                             &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoSubstPatrOpPort" maxOccurs="9999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoAtivConcom" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                             &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoPercTransf11096" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="percTransf" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percTransf"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtInfoComplPer",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtInfoComplPer evtInfoComplPer;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtInfoComplPer property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtInfoComplPer }
     *     
     */
    public ESocial.EvtInfoComplPer getEvtInfoComplPer() {
        return evtInfoComplPer;
    }

    /**
     * Sets the value of the evtInfoComplPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtInfoComplPer }
     *     
     */
    public void setEvtInfoComplPer(ESocial.EvtInfoComplPer value) {
        this.evtInfoComplPer = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEvento_folha"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoSubstPatr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
     *                   &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoSubstPatrOpPort" maxOccurs="9999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoAtivConcom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                   &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoPercTransf11096" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="percTransf" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percTransf"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoSubstPatr",
        "infoSubstPatrOpPort",
        "infoAtivConcom",
        "infoPercTransf11096"
    })
    public static class EvtInfoComplPer {

        @XmlElement(required = true)
        protected TIdeEventoFolha ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        protected ESocial.EvtInfoComplPer.InfoSubstPatr infoSubstPatr;
        protected List<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort> infoSubstPatrOpPort;
        protected ESocial.EvtInfoComplPer.InfoAtivConcom infoAtivConcom;
        protected ESocial.EvtInfoComplPer.InfoPercTransf11096 infoPercTransf11096;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public TIdeEventoFolha getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public void setIdeEvento(TIdeEventoFolha value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoSubstPatr property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoComplPer.InfoSubstPatr }
         *     
         */
        public ESocial.EvtInfoComplPer.InfoSubstPatr getInfoSubstPatr() {
            return infoSubstPatr;
        }

        /**
         * Sets the value of the infoSubstPatr property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoComplPer.InfoSubstPatr }
         *     
         */
        public void setInfoSubstPatr(ESocial.EvtInfoComplPer.InfoSubstPatr value) {
            this.infoSubstPatr = value;
        }

        /**
         * Gets the value of the infoSubstPatrOpPort property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoSubstPatrOpPort property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoSubstPatrOpPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtInfoComplPer.InfoSubstPatrOpPort }
         * 
         * 
         */
        public List<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort> getInfoSubstPatrOpPort() {
            if (infoSubstPatrOpPort == null) {
                infoSubstPatrOpPort = new ArrayList<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort>();
            }
            return this.infoSubstPatrOpPort;
        }

        /**
         * Gets the value of the infoAtivConcom property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoComplPer.InfoAtivConcom }
         *     
         */
        public ESocial.EvtInfoComplPer.InfoAtivConcom getInfoAtivConcom() {
            return infoAtivConcom;
        }

        /**
         * Sets the value of the infoAtivConcom property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoComplPer.InfoAtivConcom }
         *     
         */
        public void setInfoAtivConcom(ESocial.EvtInfoComplPer.InfoAtivConcom value) {
            this.infoAtivConcom = value;
        }

        /**
         * Gets the value of the infoPercTransf11096 property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoComplPer.InfoPercTransf11096 }
         *     
         */
        public ESocial.EvtInfoComplPer.InfoPercTransf11096 getInfoPercTransf11096() {
            return infoPercTransf11096;
        }

        /**
         * Sets the value of the infoPercTransf11096 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoComplPer.InfoPercTransf11096 }
         *     
         */
        public void setInfoPercTransf11096(ESocial.EvtInfoComplPer.InfoPercTransf11096 value) {
            this.infoPercTransf11096 = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
         *         &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
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
            "fatorMes",
            "fator13"
        })
        public static class InfoAtivConcom {

            @XmlElement(required = true)
            protected BigDecimal fatorMes;
            @XmlElement(required = true)
            protected BigDecimal fator13;

            /**
             * Gets the value of the fatorMes property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFatorMes() {
                return fatorMes;
            }

            /**
             * Sets the value of the fatorMes property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFatorMes(BigDecimal value) {
                this.fatorMes = value;
            }

            /**
             * Gets the value of the fator13 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFator13() {
                return fator13;
            }

            /**
             * Sets the value of the fator13 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFator13(BigDecimal value) {
                this.fator13 = value;
            }

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
         *         &lt;element name="percTransf" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percTransf"/>
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
            "percTransf"
        })
        public static class InfoPercTransf11096 {

            protected byte percTransf;

            /**
             * Gets the value of the percTransf property.
             * 
             */
            public byte getPercTransf() {
                return percTransf;
            }

            /**
             * Sets the value of the percTransf property.
             * 
             */
            public void setPercTransf(byte value) {
                this.percTransf = value;
            }

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
         *         &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
         *         &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
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
            "indSubstPatr",
            "percRedContrib"
        })
        public static class InfoSubstPatr {

            protected byte indSubstPatr;
            @XmlElement(required = true)
            protected BigDecimal percRedContrib;

            /**
             * Gets the value of the indSubstPatr property.
             * 
             */
            public byte getIndSubstPatr() {
                return indSubstPatr;
            }

            /**
             * Sets the value of the indSubstPatr property.
             * 
             */
            public void setIndSubstPatr(byte value) {
                this.indSubstPatr = value;
            }

            /**
             * Gets the value of the percRedContrib property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercRedContrib() {
                return percRedContrib;
            }

            /**
             * Sets the value of the percRedContrib property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercRedContrib(BigDecimal value) {
                this.percRedContrib = value;
            }

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
         *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
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
            "codLotacao"
        })
        public static class InfoSubstPatrOpPort {

            @XmlElement(required = true)
            protected String codLotacao;

            /**
             * Gets the value of the codLotacao property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodLotacao() {
                return codLotacao;
            }

            /**
             * Sets the value of the codLotacao property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodLotacao(String value) {
                this.codLotacao = value;
            }

        }

    }

}
