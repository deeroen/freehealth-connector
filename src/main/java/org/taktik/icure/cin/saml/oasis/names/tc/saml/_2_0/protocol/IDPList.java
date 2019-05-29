//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.05.29 at 05:57:25 PM CEST
//


package org.taktik.icure.cin.saml.oasis.names.tc.saml._2_0.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDPListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IDPListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}IDPEntry" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}GetComplete" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDPListType", propOrder = {
    "idpEntries",
    "getComplete"
})
@XmlRootElement(name = "IDPList")
public class IDPList
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "IDPEntry", required = true)
    protected List<IDPEntry> idpEntries;
    @XmlElement(name = "GetComplete")
    @XmlSchemaType(name = "anyURI")
    protected String getComplete;

    /**
     * Gets the value of the idpEntries property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idpEntries property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDPEntries().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDPEntry }
     *
     *
     */
    public List<IDPEntry> getIDPEntries() {
        if (idpEntries == null) {
            idpEntries = new ArrayList<IDPEntry>();
        }
        return this.idpEntries;
    }

    /**
     * Gets the value of the getComplete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGetComplete() {
        return getComplete;
    }

    /**
     * Sets the value of the getComplete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGetComplete(String value) {
        this.getComplete = value;
    }

}
