
/**
 * Created by ss-si on 23.05.2017.
 */
public class RealEstate {
    protected Integer estateID;
    protected String type;
    protected String address;
    protected Double cost;
    protected String owner;
    protected String otherInformation;

    public RealEstate(Integer estateID, String type, String address, Double cost, String owner, String otherInformation){
        this.estateID = estateID;
        this.type = type;
        this.address = address;
        this.cost = cost;
        this.owner = owner;
        this.otherInformation = otherInformation;
    }

    public Integer getEstateID() {
        return estateID;
    }

    public void setEstateID(Integer estateID) {
        this.estateID = estateID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

}
