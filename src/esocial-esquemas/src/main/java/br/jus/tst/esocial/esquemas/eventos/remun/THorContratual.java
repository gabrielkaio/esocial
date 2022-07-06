//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:38:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.remun;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_horContratual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_horContratual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qtdHrsSem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minExclusive value="0"/>
 *               &lt;maxInclusive value="99.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpJornada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tmpParc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="horNoturno" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *         &lt;element name="dscJorn" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_texto_999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_horContratual", propOrder = {
    "qtdHrsSem",
    "tpJornada",
    "tmpParc",
    "horNoturno",
    "dscJorn"
})
public class THorContratual {

    protected BigDecimal qtdHrsSem;
    protected byte tpJornada;
    protected byte tmpParc;
    @XmlSchemaType(name = "string")
    protected TSSimNao horNoturno;
    @XmlElement(required = true)
    protected String dscJorn;

    /**
     * Gets the value of the qtdHrsSem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdHrsSem() {
        return qtdHrsSem;
    }

    /**
     * Sets the value of the qtdHrsSem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdHrsSem(BigDecimal value) {
        this.qtdHrsSem = value;
    }

    /**
     * Gets the value of the tpJornada property.
     * 
     */
    public byte getTpJornada() {
        return tpJornada;
    }

    /**
     * Sets the value of the tpJornada property.
     * 
     */
    public void setTpJornada(byte value) {
        this.tpJornada = value;
    }

    /**
     * Gets the value of the tmpParc property.
     * 
     */
    public byte getTmpParc() {
        return tmpParc;
    }

    /**
     * Sets the value of the tmpParc property.
     * 
     */
    public void setTmpParc(byte value) {
        this.tmpParc = value;
    }

    /**
     * Gets the value of the horNoturno property.
     * 
     * @return
     *     possible object is
     *     {@link TSSimNao }
     *     
     */
    public TSSimNao getHorNoturno() {
        return horNoturno;
    }

    /**
     * Sets the value of the horNoturno property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSSimNao }
     *     
     */
    public void setHorNoturno(TSSimNao value) {
        this.horNoturno = value;
    }

    /**
     * Gets the value of the dscJorn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscJorn() {
        return dscJorn;
    }

    /**
     * Sets the value of the dscJorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscJorn(String value) {
        this.dscJorn = value;
    }

}
