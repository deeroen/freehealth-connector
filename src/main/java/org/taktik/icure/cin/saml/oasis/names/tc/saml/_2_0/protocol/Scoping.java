//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.05.29 at 05:57:25 PM CEST
//


package org.taktik.icure.cin.saml.oasis.names.tc.saml._2_0.protocol;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopingType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ScopingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}IDPList" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequesterID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProxyCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopingType", propOrder = {
    "idpList",
    "requesterIDs"
})
@XmlRootElement(name = "Scoping")
public class Scoping
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "IDPList")
    protected IDPList idpList;
    @XmlElement(name = "RequesterID")
    @XmlSchemaType(name = "anyURI")
    protected List<String> requesterIDs;
    @XmlAttribute(name = "ProxyCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger proxyCount;

    /**
     * Gets the value of the idpList property.
     *
     * @return
     *     possible object is
     *     {@link IDPList }
     *
     */
    public IDPList getIDPList() {
        return idpList;
    }

    /**
     * Sets the value of the idpList property.
     *
     * @param value
     *     allowed object is
     *     {@link IDPList }
     *
     */
    public void setIDPList(IDPList value) {
        this.idpList = value;
    }

    /**
     * Gets the value of the requesterIDs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requesterIDs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequesterIDs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getRequesterIDs() {
        if (requesterIDs == null) {
            requesterIDs = new ArrayList<String>();
        }
        return this.requesterIDs;
    }

    /**
     * Gets the value of the proxyCount property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getProxyCount() {
        return proxyCount;
    }

    /**
     * Sets the value of the proxyCount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setProxyCount(BigInteger value) {
        this.proxyCount = value;
    }

}
