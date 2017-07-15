import java.beans.IntrospectionException;
import java.util.Date;

/**
 * Created by ss-si on 23.05.2017.
 */
public class BuyerRequest extends Request {
    protected String preferredLocation;
    protected Integer numberOfRooms;
    protected Integer floor;

    public BuyerRequest(Integer requestID, Client requestor, String requestType, String comments, String preferredLocation, Integer numberOfRooms, Integer floor){
        super(requestID, requestor, requestType, comments);
        this.preferredLocation = preferredLocation;
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;

    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
