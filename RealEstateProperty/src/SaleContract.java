import java.util.Date;

/**
 * Created by ss-si on 23.05.2017.
 */
public class SaleContract extends Contract {
    protected String estateAddress;
    protected Double estateCost;
    protected String paymentProcedure;

    public SaleContract(Integer contractID, String contractType, Date signingDate, Date endDate, String parties, String estateAddress, Double estateCost, String paymentProcedure){
        super(contractID, contractType, signingDate, endDate, parties);
        this.estateAddress = estateAddress;
        this.estateCost = estateCost;
        this.paymentProcedure = paymentProcedure;

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

    public String getPaymentProcedure() {
        return paymentProcedure;
    }

    public void setPaymentProcedure(String paymentProcedure) {
        this.paymentProcedure = paymentProcedure;
    }
}
