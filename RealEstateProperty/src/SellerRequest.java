/**
 * Created by ss-si on 23.05.2017.
 */
public class SellerRequest extends Request {
    protected String estateType;
    protected String estateAddress;
    protected Double estateCost;

    public SellerRequest(Integer requestID, String requestor, String requestType, String comments, String estateType, String estateAddress, Double estateCost){
        super(requestID, requestor, requestType, comments);
        this.estateType = estateType;
        this.estateAddress = estateAddress;
        this.estateCost = estateCost;

    }

    public String getEstateType() {
        return estateType;
    }

    public void setEstateType(String estateType) {
        this.estateType = estateType;
    }

    public String getEstateAddress() {
        return estateAddress;
    }

    public void setEstateAddress(String estateAddress) {
        this.estateAddress = estateAddress;
    }

    public Double getEstateCost() {
        return estateCost;
    }

    public void setEstateCost(Double estateCost) {
        this.estateCost = estateCost;
    }
}
