/**
 * Created by ss-si on 22.05.2017.
 */
public abstract class Rieltor {
    protected Integer rieltorID;
    protected String name;
    protected String phoneNumber;
    protected String eMail;

    public Rieltor(Integer rieltorID, String name, String phoneNumber, String eMail){
        this.rieltorID = rieltorID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }


    public Integer getRieltorID() {
        return rieltorID;
    }

    public void setRieltorID(Integer rieltorID) {
        this.rieltorID = rieltorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
