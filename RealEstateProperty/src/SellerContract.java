import java.util.Date;

/**
 * Created by ss-si on 22.05.2017.
 */
public class SellerContract extends Contract {
    protected Integer estateID;
    protected Double serviceCost;

    public SellerContract(Integer contractID, String contractType, Date signingDate, Date endDate, String parties, Integer estateID, Double serviceCost){
        super(contractID, contractType, signingDate, endDate, parties);
        this.estateID = estateID;
        this.serviceCost = serviceCost;

    }

    public Integer getEstateID() {
        return estateID;
    }

    public void setEstateID(Integer estateID) {
        this.estateID = estateID;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
