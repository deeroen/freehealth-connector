package oasis.names.tc.saml._1_0.assertion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "StatementAbstractType"
)
@XmlSeeAlso({SubjectStatementAbstractType.class})
public abstract class StatementAbstractType implements Serializable {
   private static final long serialVersionUID = 1L;
}
