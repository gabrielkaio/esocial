//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:37:52 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exclusao;

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
 *         &lt;element name="evtExclusao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEvento_exclusao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEmpregador_exclusao"/>
 *                   &lt;element name="infoExclusao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpEvento">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
 *                             &lt;element name="ideTrabalhador" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ideFolhaPagto" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
 *                                       &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_Id" />
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
    "evtExclusao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtExclusao evtExclusao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtExclusao property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtExclusao }
     *     
     */
    public ESocial.EvtExclusao getEvtExclusao() {
        return evtExclusao;
    }

    /**
     * Sets the value of the evtExclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtExclusao }
     *     
     */
    public void setEvtExclusao(ESocial.EvtExclusao value) {
        this.evtExclusao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEvento_exclusao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEmpregador_exclusao"/>
     *         &lt;element name="infoExclusao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpEvento">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
     *                   &lt;element name="ideTrabalhador" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ideFolhaPagto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
     *                             &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_Id" />
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
        "infoExclusao"
    })
    public static class EvtExclusao {

        @XmlElement(required = true)
        protected TIdeEventoExclusao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorExclusao ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtExclusao.InfoExclusao infoExclusao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoExclusao }
         *     
         */
        public TIdeEventoExclusao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoExclusao }
         *     
         */
        public void setIdeEvento(TIdeEventoExclusao value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorExclusao }
         *     
         */
        public TIdeEmpregadorExclusao getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorExclusao }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorExclusao value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoExclusao property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtExclusao.InfoExclusao }
         *     
         */
        public ESocial.EvtExclusao.InfoExclusao getInfoExclusao() {
            return infoExclusao;
        }

        /**
         * Sets the value of the infoExclusao property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtExclusao.InfoExclusao }
         *     
         */
        public void setInfoExclusao(ESocial.EvtExclusao.InfoExclusao value) {
            this.infoExclusao = value;
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
         *         &lt;element name="tpEvento">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
         *         &lt;element name="ideTrabalhador" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ideFolhaPagto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
         *                   &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
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
        @XmlType(name = "", propOrder = {
            "tpEvento",
            "nrRecEvt",
            "ideTrabalhador",
            "ideFolhaPagto"
        })
        public static class InfoExclusao {

            @XmlElement(required = true)
            protected String tpEvento;
            @XmlElement(required = true)
            protected String nrRecEvt;
            protected ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador ideTrabalhador;
            protected ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto ideFolhaPagto;

            /**
             * Gets the value of the tpEvento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEvento() {
                return tpEvento;
            }

            /**
             * Sets the value of the tpEvento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEvento(String value) {
                this.tpEvento = value;
            }

            /**
             * Gets the value of the nrRecEvt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecEvt() {
                return nrRecEvt;
            }

            /**
             * Sets the value of the nrRecEvt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecEvt(String value) {
                this.nrRecEvt = value;
            }

            /**
             * Gets the value of the ideTrabalhador property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador }
             *     
             */
            public ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador getIdeTrabalhador() {
                return ideTrabalhador;
            }

            /**
             * Sets the value of the ideTrabalhador property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador }
             *     
             */
            public void setIdeTrabalhador(ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador value) {
                this.ideTrabalhador = value;
            }

            /**
             * Gets the value of the ideFolhaPagto property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto }
             *     
             */
            public ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto getIdeFolhaPagto() {
                return ideFolhaPagto;
            }

            /**
             * Sets the value of the ideFolhaPagto property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto }
             *     
             */
            public void setIdeFolhaPagto(ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto value) {
                this.ideFolhaPagto = value;
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
             *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
             *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
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
                "indApuracao",
                "perApur"
            })
            public static class IdeFolhaPagto {

                protected Byte indApuracao;
                @XmlElement(required = true)
                protected String perApur;

                /**
                 * Gets the value of the indApuracao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getIndApuracao() {
                    return indApuracao;
                }

                /**
                 * Sets the value of the indApuracao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setIndApuracao(Byte value) {
                    this.indApuracao = value;
                }

                /**
                 * Gets the value of the perApur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerApur() {
                    return perApur;
                }

                /**
                 * Sets the value of the perApur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerApur(String value) {
                    this.perApur = value;
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
             *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
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
                "cpfTrab"
            })
            public static class IdeTrabalhador {

                @XmlElement(required = true)
                protected String cpfTrab;

                /**
                 * Gets the value of the cpfTrab property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfTrab() {
                    return cpfTrab;
                }

                /**
                 * Sets the value of the cpfTrab property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfTrab(String value) {
                    this.cpfTrab = value;
                }

            }

        }

    }

}
