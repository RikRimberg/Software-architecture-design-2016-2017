package businesslogiclayer.entities;

import businesslogiclayer.roles.Buyer;

/**
 * Created by Anzhela on 22.05.2017.
 */

public class Request {
    private Integer requestID;
    private String city;
    private String district;
    private String street;
    private Double cost;
    private Integer floor;
    private Integer roomsNum;
    private Double area;
    private String comments;

    private Buyer requestor;
    private String status; // не рассмотрена / рассматривается / исполнена

    public Request(Integer requestID, String city, String district, String street, Double cost, Integer floor,
                       Integer roomsNum, Double area, String comments, Buyer requestor, String status){
        this.requestID = requestID;
        this.city = city;
        this.district = district;
        this.street = street;
        this.cost = cost;
        this.floor = floor;
        this.roomsNum = roomsNum;
        this.area = area;
        this.comments = comments;
        this.requestor = requestor;
        this.status = status;
    }

    public Request(String city, String district, String street, Double cost, Integer floor,
                   Integer roomsNum, Double area, String comments, Buyer requestor, String status){
        this.city = city;
        this.district = district;
        this.street = street;
        this.cost = cost;
        this.floor = floor;
        this.roomsNum = roomsNum;
        this.area = area;
        this.comments = comments;
        this.requestor = requestor;
        this.status = status;
    }


    public Integer getRequestID() {
        return requestID;
    }
    public void setRequestID(Integer requestID) {
        this.requestID = requestID;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getFloor() {
        return floor;
    }
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoomsNum() {
        return roomsNum;
    }
    public void setRoomsNum(Integer roomsNum) {
        this.roomsNum = roomsNum;
    }

    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public Buyer getRequestor() {
        return requestor;
    }
    public void setRequestor(Buyer requestor) {
        this.requestor = requestor;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
