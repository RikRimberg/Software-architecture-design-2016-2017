/**
 * Created by ss-si on 22.05.2017.
 */
public abstract class Client {
    protected Integer clientID;
    protected String clientType;
    protected String name;
    protected String passport;
    protected String address;
    protected String phoneNumber;
    protected String eMail;

    public Client(Integer clientID, String clientType, String name, String passport, String address, String phoneNumber, String eMail){
        this.clientID = clientID;
        this.clientType = clientType;
        this.name = name;
        this.passport = passport;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }


    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }
}
