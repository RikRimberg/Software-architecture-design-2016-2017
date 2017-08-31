package businesslogiclayer.entities;

import java.util.Date;
import businesslogiclayer.roles.Buyer;
import businesslogiclayer.roles.Realtor;
import businesslogiclayer.roles.Seller;

/**
 * Created by Anzhela on 22.05.2017.
 */

public class Contract {
    private Integer contractID;
    private Seller seller;
    private Buyer buyer;
    private Realtor realtor;
    private Apartment apartment;
    private Double apartmentCost;
    private Double sellerServiceCost;
    private Double buyerServiceCost;
    private Date signingDate;

    public Contract(Integer contractID, Seller seller, Buyer buyer, Realtor realtor, Apartment apartment,
                    Double apartmentCost, Double sellerServiceCost, Double buyerServiceCost, Date signingDate){
        this.contractID = contractID;
        this.seller = seller;
        this.buyer = buyer;
        this.realtor = realtor;
        this.apartment = apartment;
        this.apartmentCost = apartmentCost;
        this.sellerServiceCost = sellerServiceCost;
        this.buyerServiceCost = buyerServiceCost;
        this.signingDate = signingDate;
    }

    public Contract(Seller seller, Buyer buyer, Realtor realtor, Apartment apartment,
                    Double apartmentCost, Double sellerServiceCost, Double buyerServiceCost, Date signingDate){
        this.seller = seller;
        this.buyer = buyer;
        this.realtor = realtor;
        this.apartment = apartment;
        this.apartmentCost = apartmentCost;
        this.sellerServiceCost = sellerServiceCost;
        this.buyerServiceCost = buyerServiceCost;
        this.signingDate = signingDate;
    }

    public Integer getContractID() {
        return contractID;
    }
    public void setContractID(Integer contractID) {
        this.contractID = contractID;
    }

    public Seller getSeller() {
        return seller;
    }
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Realtor getRealtor() {
        return realtor;
    }
    public void setRealtor(Realtor realtor) {
        this.realtor = realtor;
    }

    public Apartment getApartment() {
        return apartment;
    }
    public void setApartment(Apartment estateCost) {
        this.apartment = apartment;
    }

    public Double getApartmentCost() {
        return apartmentCost;
    }
    public void setApartmentCost(Double apartmentCost) {
        this.apartmentCost = apartmentCost;
    }

    public Double getSellerServiceCost() {
        return sellerServiceCost;
    }
    public void setSellerServiceCost(Double sellerServiceCost) {
        this.sellerServiceCost = sellerServiceCost;
    }

    public Double getBuyerServiceCost() {
        return buyerServiceCost;
    }
    public void setBuyerServiceCost(Double buyerServiceCost) {
        this.buyerServiceCost = buyerServiceCost;
    }

    public Date getSigningDate() {
        return signingDate;
    }
    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }


}
