/**
 * Created by ss-si on 23.05.2017.
 */
public class Estimator {
    protected Integer estimatorID;
    protected String name;
    protected String phoneNumber;
    protected String eMail;

    public Estimator(Integer estimatorID, String name, String phoneNumber, String eMail){
        this.estimatorID = estimatorID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public Integer getEstimatorID() {
        return estimatorID;
    }

    public void setEstimatorID(Integer estimatorID) {
        this.estimatorID = estimatorID;
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
