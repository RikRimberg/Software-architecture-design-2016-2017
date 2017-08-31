package businesslogiclayer.entities;

import businesslogiclayer.roles.Seller;

/**
 * Created by Anzhela on 23.05.2017.
 */

public class Apartment {
    private Integer apartmentID;
    private String address;
    private Integer floor;
    private Integer roomsNum;
    private Double area;
    private String comments;

    private Seller owner;
    private Double cost;
    private String status; // продано / поиск покупателя / есть покупатель

    public Apartment(Integer apartmentID, String address, Integer floor, Integer roomsNum, Double area, String comments,
                     Seller owner, Double cost, String status){
        this.apartmentID = apartmentID;
        this.address = address;
        this.floor = floor;
        this.roomsNum = roomsNum;
        this.area = area;
        this.comments = comments;
        this.owner = owner;
        this.cost = cost;
        this.status = status;
    }

    public Apartment(String address, Integer floor, Integer roomsNum, Double area, String comments,
                     Seller owner, Double cost, String status){
        this.address = address;
        this.floor = floor;
        this.roomsNum = roomsNum;
        this.area = area;
        this.comments = comments;
        this.owner = owner;
        this.cost = cost;
        this.status = status;
    }

    public Integer getApartmentID() {
        return apartmentID;
    }
    public void setApartmentID(Integer apartmentID) {
        this.apartmentID = apartmentID;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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

    public Seller getOwner() {
        return owner;
    }
    public void setOwner(Seller owner) {
        this.owner = owner;
    }

    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


}
