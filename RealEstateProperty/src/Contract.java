import java.util.Date;

/**
 * Created by ss-si on 22.05.2017.
 */
public abstract class Contract {
    protected Integer contractID;
    protected String contractType;
    protected Date signingDate;
    protected Date endDate;
    protected String parties;

    public Contract(Integer contractID, String contractType, Date signingDate, Date endDate, String parties){
        this.contractID = contractID;
        this.contractType = contractType;
        this.signingDate = signingDate;
        this.endDate = endDate;
        this.parties = parties;
    }

    public Integer getContractID() {
        return contractID;
    }

    public void setContractID(Integer contractID) {
        this.contractID = contractID;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getParties() {
        return parties;
    }

    public void setParties(String parties) {
        this.parties = parties;
    }
}
