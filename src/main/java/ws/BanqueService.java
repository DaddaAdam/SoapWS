package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name="montant") double mt) {
        return mt*11;
    }

    @WebMethod
    public Compte consulterCompte(int code){
        return new Compte(code, Math.random()*9000, new Date());
    }

    @WebMethod
    public List<Compte> listCompte() {
        return List.of(
                new Compte(1, 1000, new Date()),
                new Compte(2, 2000, new Date()),
                new Compte(3, 3000, new Date())
        );
    }

}
