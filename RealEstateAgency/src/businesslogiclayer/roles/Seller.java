package businesslogiclayer.roles;

/**
 * Created by Anzhela on 22.05.2017.
 */

public class Seller extends User{
    private String address;
    private Integer apartmentID; // или public businesslogiclayer.entities.Apartment apartment?

    public Seller (Integer userID, String name, String eMail, String phoneNumber, String address, Integer apartmentID, String passwd){
        super(userID, name, eMail, phoneNumber, passwd);

        this.address = address;
        this.apartmentID = apartmentID;
    }

    public Seller (String name, String eMail, String phoneNumber, String address, Integer apartmentID, String passwd){
        super(name, eMail, phoneNumber, passwd);

        this.address = address;
        this.apartmentID = apartmentID;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getApartmentID() {
        return apartmentID;
    }
    public void setApartmentID(Integer apartmentID) {
        this.apartmentID = apartmentID;
    }

    // регистрация в системе (новый продавец в таблице)
    @Override
    public void addUser(String name, String eMail, String phoneNumber, String passwd) {

    }

    // вход в систему (проверка на соответствие, открытие окна)
    @Override
    public void signIn(String eMail, String passwd) {

    }
}
