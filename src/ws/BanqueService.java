package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
ICI on a creer un le web service avec des differentrs methodes

 */


@WebService(serviceName = "BanqueWS")


public class BanqueService {

    @WebMethod(operationName ="ConvertEurotoDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*50;
    }
    @WebMethod(operationName ="CompteBancaire")
    public Compte getCompte(@WebParam(name = "CodeBanque") Long code){

        return new Compte(code,new Date(),Math.random());
    }
    @WebMethod(operationName ="ListedesCompteBnacaire")
    public List<Compte> listeCompte(){
        List<Compte> comptes =new ArrayList<>();
        comptes.add(new Compte(1L,new Date(),Math.random()));
        comptes.add(new Compte(2L,new Date(),Math.random()));
        comptes.add(new Compte(3L,new Date(),Math.random()));
   return comptes;
    }


}
