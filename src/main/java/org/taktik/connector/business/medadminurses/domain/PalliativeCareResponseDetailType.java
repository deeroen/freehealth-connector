//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.16 at 10:40:22 AM CEST 
//


package org.taktik.connector.business.medadminurses.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PalliativeCareResponseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PalliativeCareResponseDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultantDoctor" type="{urn:be:cin:mycarenet:1.0:carenet:types}NihiiType" minOccurs="0"/>
 *         &lt;element name="Decision" type="{urn:be:cin:mycarenet:1.0:carenet:types}DecisionType"/>
 *         &lt;element name="InvoiceStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalliativeCareResponseDetailType", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", propOrder = {
    "consultantDoctor",
    "decision",
    "invoiceStartDate"
})
public class PalliativeCareResponseDetailType {

    @XmlElement(name = "ConsultantDoctor", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    protected String consultantDoctor;
    @XmlElement(name = "Decision", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", required = true)
    protected DecisionType decision;
    @XmlElement(name = "InvoiceStartDate", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceStartDate;

    /**
     * Gets the value of the consultantDoctor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultantDoctor() {
        return consultantDoctor;
    }

    /**
     * Sets the value of the consultantDoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultantDoctor(String value) {
        this.consultantDoctor = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionType }
     *     
     */
    public DecisionType getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionType }
     *     
     */
    public void setDecision(DecisionType value) {
        this.decision = value;
    }

    /**
     * Gets the value of the invoiceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceStartDate() {
        return invoiceStartDate;
    }

    /**
     * Sets the value of the invoiceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceStartDate(XMLGregorianCalendar value) {
        this.invoiceStartDate = value;
    }

}
