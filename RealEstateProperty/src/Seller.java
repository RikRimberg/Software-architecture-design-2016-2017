/**
 * Created by ss-si on 22.05.2017.
 */
public abstract class Seller extends Client{
    public Seller (Integer clientID, String clientType, String name, String passport, String address, String phoneNumber, String eMail){
        super(clientID, clientType, name, passport, address, phoneNumber, eMail);
    }

}