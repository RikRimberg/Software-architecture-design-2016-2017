/**
 * Created by ss-si on 22.05.2017.
 */
public class Request {
    protected Integer requestID;
    protected Client requestor;
    protected String requestType;
    protected String comments;

    public Request(Integer requestID, Client requestor, String requestType, String comments){
        this.requestID = requestID;
        this.requestor = requestor;
        this.requestType = requestType;
        this.comments = comments;
    }


    public Integer getRequestID() {
        return requestID;
    }

    public void setRequestID(Integer requestID) {
        this.requestID = requestID;
    }

    public Client getRequestor() {
        return requestor;
    }

    public void setRequestor(Client requestor) {
        this.requestor = requestor;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
