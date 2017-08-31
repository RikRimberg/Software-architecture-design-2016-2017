package businesslogiclayer.roles;

import businesslogiclayer.entities.Request;

/**
 * Created by Anzhela on 22.05.2017.
 */

public class Buyer extends User {
    private String address;

    public Buyer (Integer userID, String name, String eMail, String phoneNumber, String address, String passwd){
        super(userID, name, eMail, phoneNumber, passwd);

        this.address = address;
    }

    public Buyer (String name, String eMail, String phoneNumber, String address, String passwd){
        super(name, eMail, phoneNumber, passwd);

        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }




    // регистрация в системе (новый покупатель в таблице)
    @Override
    public void addUser(String name, String eMail, String phoneNumber, String passwd) {

    }
    // вход в систему (проверка на соответствие, открытие окна)
    @Override
    public void signIn(String eMail, String passwd) {

    }

   /* //заполнение заявки
    public Request fillRequest ()
    {
        //return false;
    }*/



}
