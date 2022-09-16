//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.16 at 10:40:22 AM CEST 
//


package org.taktik.connector.business.medadminurses.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleNurseContractualCareResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleNurseContractualCareResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CareReceiverId" type="{urn:be:cin:mycarenet:1.0:carenet:types}ExtCareReceiverStrictIdType"/>
 *             &lt;element name="MessageFault" type="{urn:be:cin:mycarenet:1.0:carenet:types}MessageFaultType"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CareReceiverDetail" type="{urn:be:cin:mycarenet:1.0:carenet:types}ExtCareReceiverDetailType"/>
 *             &lt;element ref="{urn:be:cin:mycarenet:1.0:carenet:types}NurseContractualCareResponseDetail"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{urn:be:cin:mycarenet:1.0:carenet:types}NurseContractualCareRequestDetail"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:be:cin:mycarenet:1.0:carenet:types}MessageHeader"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleNurseContractualCareResponseType", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", propOrder = {
    "careReceiverId",
    "messageFault",
    "careReceiverDetail",
    "nurseContractualCareResponseDetail",
    "nurseContractualCareRequestDetail"
})
public class SingleNurseContractualCareResponseType {

    @XmlElement(name = "CareReceiverId", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    protected ExtCareReceiverStrictIdType careReceiverId;
    @XmlElement(name = "MessageFault", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    protected MessageFaultType messageFault;
    @XmlElement(name = "CareReceiverDetail", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    protected ExtCareReceiverDetailType careReceiverDetail;
    @XmlElement(name = "NurseContractualCareResponseDetail", namespace = "urn:be:cin:mycarenet:1.0:carenet:types")
    protected NurseContractualCareResponseDetailType nurseContractualCareResponseDetail;
    @XmlElement(name = "NurseContractualCareRequestDetail", namespace = "urn:be:cin:mycarenet:1.0:carenet:types", required = true)
    protected NurseContractualCareRequestDetailType nurseContractualCareRequestDetail;
    @XmlAttribute(name = "MessageName", required = true)
    protected MessageNameType messageName;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "Duplicate", required = true)
    protected boolean duplicate;
    @XmlAttribute(name = "TestFlag", required = true)
    protected boolean testFlag;
    @XmlAttribute(name = "SenderReference", required = true)
    protected String senderReference;
    @XmlAttribute(name = "ReceiverReference")
    protected String receiverReference;
    @XmlAttribute(name = "Synchronous", required = true)
    protected boolean synchronous;

    /**
     * Gets the value of the careReceiverId property.
     * 
     * @return
     *     possible object is
     *     {@link ExtCareReceiverStrictIdType }
     *     
     */
    public ExtCareReceiverStrictIdType getCareReceiverId() {
        return careReceiverId;
    }

    /**
     * Sets the value of the careReceiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtCareReceiverStrictIdType }
     *     
     */
    public void setCareReceiverId(ExtCareReceiverStrictIdType value) {
        this.careReceiverId = value;
    }

    /**
     * Gets the value of the messageFault property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFaultType }
     *     
     */
    public MessageFaultType getMessageFault() {
        return messageFault;
    }

    /**
     * Sets the value of the messageFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFaultType }
     *     
     */
    public void setMessageFault(MessageFaultType value) {
        this.messageFault = value;
    }

    /**
     * Gets the value of the careReceiverDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ExtCareReceiverDetailType }
     *     
     */
    public ExtCareReceiverDetailType getCareReceiverDetail() {
        return careReceiverDetail;
    }

    /**
     * Sets the value of the careReceiverDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtCareReceiverDetailType }
     *     
     */
    public void setCareReceiverDetail(ExtCareReceiverDetailType value) {
        this.careReceiverDetail = value;
    }

    /**
     * Gets the value of the nurseContractualCareResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NurseContractualCareResponseDetailType }
     *     
     */
    public NurseContractualCareResponseDetailType getNurseContractualCareResponseDetail() {
        return nurseContractualCareResponseDetail;
    }

    /**
     * Sets the value of the nurseContractualCareResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NurseContractualCareResponseDetailType }
     *     
     */
    public void setNurseContractualCareResponseDetail(NurseContractualCareResponseDetailType value) {
        this.nurseContractualCareResponseDetail = value;
    }

    /**
     * Gets the value of the nurseContractualCareRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NurseContractualCareRequestDetailType }
     *     
     */
    public NurseContractualCareRequestDetailType getNurseContractualCareRequestDetail() {
        return nurseContractualCareRequestDetail;
    }

    /**
     * Sets the value of the nurseContractualCareRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NurseContractualCareRequestDetailType }
     *     
     */
    public void setNurseContractualCareRequestDetail(NurseContractualCareRequestDetailType value) {
        this.nurseContractualCareRequestDetail = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link MessageNameType }
     *     
     */
    public MessageNameType getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageNameType }
     *     
     */
    public void setMessageName(MessageNameType value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     */
    public boolean isDuplicate() {
        return duplicate;
    }

    /**
     * Sets the value of the duplicate property.
     * 
     */
    public void setDuplicate(boolean value) {
        this.duplicate = value;
    }

    /**
     * Gets the value of the testFlag property.
     * 
     */
    public boolean isTestFlag() {
        return testFlag;
    }

    /**
     * Sets the value of the testFlag property.
     * 
     */
    public void setTestFlag(boolean value) {
        this.testFlag = value;
    }

    /**
     * Gets the value of the senderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderReference() {
        return senderReference;
    }

    /**
     * Sets the value of the senderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderReference(String value) {
        this.senderReference = value;
    }

    /**
     * Gets the value of the receiverReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverReference() {
        return receiverReference;
    }

    /**
     * Sets the value of the receiverReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverReference(String value) {
        this.receiverReference = value;
    }

    /**
     * Gets the value of the synchronous property.
     * 
     */
    public boolean isSynchronous() {
        return synchronous;
    }

    /**
     * Sets the value of the synchronous property.
     * 
     */
    public void setSynchronous(boolean value) {
        this.synchronous = value;
    }

}
