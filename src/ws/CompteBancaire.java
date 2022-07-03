
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CompteBancaire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompteBancaire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeBanque" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompteBancaire", propOrder = {
    "codeBanque"
})
public class CompteBancaire {

    @XmlElement(name = "CodeBanque")
    protected Long codeBanque;

    /**
     * Obtient la valeur de la propriété codeBanque.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeBanque() {
        return codeBanque;
    }

    /**
     * Définit la valeur de la propriété codeBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeBanque(Long value) {
        this.codeBanque = value;
    }

}
