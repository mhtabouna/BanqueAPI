import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerD {
    public static void main(String[] args) {
        String url="http://localhost:9999/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Le web service est deployer sur "+url);

    }
}
