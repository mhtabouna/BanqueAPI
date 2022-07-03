
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="datecreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "datecreation",
    "sold"
})
public class Compte {

    protected Long code;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datecreation;
    protected double sold;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� datecreation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatecreation() {
        return datecreation;
    }

    /**
     * D�finit la valeur de la propri�t� datecreation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatecreation(XMLGregorianCalendar value) {
        this.datecreation = value;
    }

    /**
     * Obtient la valeur de la propri�t� sold.
     * 
     */
    public double getSold() {
        return sold;
    }

    /**
     * D�finit la valeur de la propri�t� sold.
     * 
     */
    public void setSold(double value) {
        this.sold = value;
    }

}
