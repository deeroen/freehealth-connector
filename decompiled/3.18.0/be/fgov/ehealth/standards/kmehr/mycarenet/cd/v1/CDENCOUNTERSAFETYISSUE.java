package be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CD-ENCOUNTERSAFETYISSUE",
   propOrder = {"value"}
)
public class CDENCOUNTERSAFETYISSUE implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlValue
   protected CDENCOUNTERSAFETYISSUEvalues value;
   @XmlAttribute(
      name = "S",
      required = true
   )
   protected String s;
   @XmlAttribute(
      name = "SV",
      required = true
   )
   protected String sv;
   @XmlAttribute(
      name = "DN"
   )
   protected String dn;
   @XmlAttribute(
      name = "L"
   )
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   @XmlSchemaType(
      name = "language"
   )
   protected String l;

   public CDENCOUNTERSAFETYISSUEvalues getValue() {
      return this.value;
   }

   public void setValue(CDENCOUNTERSAFETYISSUEvalues value) {
      this.value = value;
   }

   public String getS() {
      return this.s == null ? "CD-ENCOUNTERSAFETYISSUE" : this.s;
   }

   public void setS(String value) {
      this.s = value;
   }

   public String getSV() {
      return this.sv;
   }

   public void setSV(String value) {
      this.sv = value;
   }

   public String getDN() {
      return this.dn;
   }

   public void setDN(String value) {
      this.dn = value;
   }

   public String getL() {
      return this.l == null ? "en" : this.l;
   }

   public void setL(String value) {
      this.l = value;
   }
}
