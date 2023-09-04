//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:10 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fechaevper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="evtFechaEvPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}T_ideEvento_folha_sem_retificacao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}T_ideEmpregador"/>
 *                   &lt;element name="infoFech">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
 *                             &lt;element name="evtPgtos" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
 *                             &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
 *                             &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
 *                             &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
 *                             &lt;element name="indExcApur1250" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="transDCTFWeb" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="naoValid" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_Id" />
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
    "evtFechaEvPer",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtFechaEvPer evtFechaEvPer;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtFechaEvPer property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public ESocial.EvtFechaEvPer getEvtFechaEvPer() {
        return evtFechaEvPer;
    }

    /**
     * Sets the value of the evtFechaEvPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public void setEvtFechaEvPer(ESocial.EvtFechaEvPer value) {
        this.evtFechaEvPer = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}T_ideEvento_folha_sem_retificacao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}T_ideEmpregador"/>
     *         &lt;element name="infoFech">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
     *                   &lt;element name="evtPgtos" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
     *                   &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
     *                   &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
     *                   &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
     *                   &lt;element name="indExcApur1250" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="transDCTFWeb" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="naoValid" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_Id" />
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
        "infoFech"
    })
    public static class EvtFechaEvPer {

        @XmlElement(required = true)
        protected TIdeEventoFolhaSemRetificacao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtFechaEvPer.InfoFech infoFech;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public TIdeEventoFolhaSemRetificacao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaSemRetificacao value) {
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
         * Gets the value of the infoFech property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public ESocial.EvtFechaEvPer.InfoFech getInfoFech() {
            return infoFech;
        }

        /**
         * Sets the value of the infoFech property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public void setInfoFech(ESocial.EvtFechaEvPer.InfoFech value) {
            this.infoFech = value;
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
         *         &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
         *         &lt;element name="evtPgtos" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
         *         &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
         *         &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
         *         &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_02_00}TS_sim_nao"/>
         *         &lt;element name="indExcApur1250" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="transDCTFWeb" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="naoValid" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
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
        @XmlType(name = "", propOrder = {
            "evtRemun",
            "evtPgtos",
            "evtComProd",
            "evtContratAvNP",
            "evtInfoComplPer",
            "indExcApur1250",
            "transDCTFWeb",
            "naoValid"
        })
        public static class InfoFech {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtRemun;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtPgtos;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtComProd;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtContratAvNP;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtInfoComplPer;
            protected String indExcApur1250;
            protected String transDCTFWeb;
            protected String naoValid;

            /**
             * Gets the value of the evtRemun property.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtRemun() {
                return evtRemun;
            }

            /**
             * Sets the value of the evtRemun property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtRemun(TSSimNao value) {
                this.evtRemun = value;
            }

            /**
             * Gets the value of the evtPgtos property.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtPgtos() {
                return evtPgtos;
            }

            /**
             * Sets the value of the evtPgtos property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtPgtos(TSSimNao value) {
                this.evtPgtos = value;
            }

            /**
             * Gets the value of the evtComProd property.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtComProd() {
                return evtComProd;
            }

            /**
             * Sets the value of the evtComProd property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtComProd(TSSimNao value) {
                this.evtComProd = value;
            }

            /**
             * Gets the value of the evtContratAvNP property.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtContratAvNP() {
                return evtContratAvNP;
            }

            /**
             * Sets the value of the evtContratAvNP property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtContratAvNP(TSSimNao value) {
                this.evtContratAvNP = value;
            }

            /**
             * Gets the value of the evtInfoComplPer property.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtInfoComplPer() {
                return evtInfoComplPer;
            }

            /**
             * Sets the value of the evtInfoComplPer property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtInfoComplPer(TSSimNao value) {
                this.evtInfoComplPer = value;
            }

            /**
             * Gets the value of the indExcApur1250 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndExcApur1250() {
                return indExcApur1250;
            }

            /**
             * Sets the value of the indExcApur1250 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndExcApur1250(String value) {
                this.indExcApur1250 = value;
            }

            /**
             * Gets the value of the transDCTFWeb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransDCTFWeb() {
                return transDCTFWeb;
            }

            /**
             * Sets the value of the transDCTFWeb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransDCTFWeb(String value) {
                this.transDCTFWeb = value;
            }

            /**
             * Gets the value of the naoValid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaoValid() {
                return naoValid;
            }

            /**
             * Sets the value of the naoValid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaoValid(String value) {
                this.naoValid = value;
            }

        }

    }

}
