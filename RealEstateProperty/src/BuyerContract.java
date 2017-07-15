import java.util.Date;

/**
 * Created by ss-si on 22.05.2017.
 */
public class BuyerContract extends Contract {
    protected String preferences;
    protected Double serviceCost;

    public BuyerContract(Integer contractID, String contractType, Date signingDate, Date endDate, String parties, String preferences, Double serviceCost){
        super(contractID, contractType, signingDate, endDate, parties);
        this.preferences = preferences;
        this.serviceCost = serviceCost;

    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
