//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.16 at 10:40:22 AM CEST 
//


package org.taktik.connector.business.medadminurses.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedAdminRequestListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedAdminRequestListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:be:cin:mycarenet:1.0:carenet:types}SingleNurseContractualCareRequest"/>
 *         &lt;element ref="{urn:be:cin:mycarenet:1.0:carenet:types}SinglePalliativeCareRequest"/>
 *         &lt;element ref="{urn:be:cin:mycarenet:1.0:carenet:types}SingleSpecificTechnicalCareRequest"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedAdminRequestListType", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", propOrder = {
    "singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest"
})
public class MedAdminRequestListType {

    @XmlElements({
        @XmlElement(name = "SingleNurseContractualCareRequest", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", type = SingleNurseContractualCareRequestType.class),
        @XmlElement(name = "SinglePalliativeCareRequest", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", type = SinglePalliativeCareRequestType.class),
        @XmlElement(name = "SingleSpecificTechnicalCareRequest", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", type = SingleSpecificTechnicalCareRequestType.class)
    })
    protected List<Object> singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest;

    /**
     * Gets the value of the singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleNurseContractualCareRequestType }
     * {@link SinglePalliativeCareRequestType }
     * {@link SingleSpecificTechnicalCareRequestType }
     * 
     * 
     */
    public List<Object> getSingleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest() {
        if (singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest == null) {
            singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest = new ArrayList<Object>();
        }
        return this.singleNurseContractualCareRequestOrSinglePalliativeCareRequestOrSingleSpecificTechnicalCareRequest;
    }

}
