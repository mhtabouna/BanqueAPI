
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListedesCompteBnacaire_QNAME = new QName("http://ws/", "ListedesCompteBnacaire");
    private final static QName _ConvertEurotoDH_QNAME = new QName("http://ws/", "ConvertEurotoDH");
    private final static QName _ConvertEurotoDHResponse_QNAME = new QName("http://ws/", "ConvertEurotoDHResponse");
    private final static QName _CompteBancaire_QNAME = new QName("http://ws/", "CompteBancaire");
    private final static QName _ListedesCompteBnacaireResponse_QNAME = new QName("http://ws/", "ListedesCompteBnacaireResponse");
    private final static QName _CompteBancaireResponse_QNAME = new QName("http://ws/", "CompteBancaireResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListedesCompteBnacaire }
     * 
     */
    public ListedesCompteBnacaire createListedesCompteBnacaire() {
        return new ListedesCompteBnacaire();
    }

    /**
     * Create an instance of {@link ConvertEurotoDH }
     * 
     */
    public ConvertEurotoDH createConvertEurotoDH() {
        return new ConvertEurotoDH();
    }

    /**
     * Create an instance of {@link ConvertEurotoDHResponse }
     * 
     */
    public ConvertEurotoDHResponse createConvertEurotoDHResponse() {
        return new ConvertEurotoDHResponse();
    }

    /**
     * Create an instance of {@link CompteBancaire }
     * 
     */
    public CompteBancaire createCompteBancaire() {
        return new CompteBancaire();
    }

    /**
     * Create an instance of {@link ListedesCompteBnacaireResponse }
     * 
     */
    public ListedesCompteBnacaireResponse createListedesCompteBnacaireResponse() {
        return new ListedesCompteBnacaireResponse();
    }

    /**
     * Create an instance of {@link CompteBancaireResponse }
     * 
     */
    public CompteBancaireResponse createCompteBancaireResponse() {
        return new CompteBancaireResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListedesCompteBnacaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListedesCompteBnacaire")
    public JAXBElement<ListedesCompteBnacaire> createListedesCompteBnacaire(ListedesCompteBnacaire value) {
        return new JAXBElement<ListedesCompteBnacaire>(_ListedesCompteBnacaire_QNAME, ListedesCompteBnacaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEurotoDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertEurotoDH")
    public JAXBElement<ConvertEurotoDH> createConvertEurotoDH(ConvertEurotoDH value) {
        return new JAXBElement<ConvertEurotoDH>(_ConvertEurotoDH_QNAME, ConvertEurotoDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEurotoDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertEurotoDHResponse")
    public JAXBElement<ConvertEurotoDHResponse> createConvertEurotoDHResponse(ConvertEurotoDHResponse value) {
        return new JAXBElement<ConvertEurotoDHResponse>(_ConvertEurotoDHResponse_QNAME, ConvertEurotoDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteBancaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CompteBancaire")
    public JAXBElement<CompteBancaire> createCompteBancaire(CompteBancaire value) {
        return new JAXBElement<CompteBancaire>(_CompteBancaire_QNAME, CompteBancaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListedesCompteBnacaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListedesCompteBnacaireResponse")
    public JAXBElement<ListedesCompteBnacaireResponse> createListedesCompteBnacaireResponse(ListedesCompteBnacaireResponse value) {
        return new JAXBElement<ListedesCompteBnacaireResponse>(_ListedesCompteBnacaireResponse_QNAME, ListedesCompteBnacaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteBancaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CompteBancaireResponse")
    public JAXBElement<CompteBancaireResponse> createCompteBancaireResponse(CompteBancaireResponse value) {
        return new JAXBElement<CompteBancaireResponse>(_CompteBancaireResponse_QNAME, CompteBancaireResponse.class, null, value);
    }

}
