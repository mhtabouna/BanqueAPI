import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

public class ClientsWebserv {
    public static void main(String[] args) {
        BanqueService stubWS=new BanqueWS().getBanqueServicePort();
        System.out.println(stubWS.convertEurotoDH(800));



    }
}
