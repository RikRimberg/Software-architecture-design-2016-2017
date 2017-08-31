package businesslogiclayer.roles;

/**
 * Created by Anzhela on 22.05.2017.
 */

public class Realtor extends User {

    public Realtor(Integer userID, String name, String eMail, String phoneNumber, String passwd){
        super(userID, name, eMail, phoneNumber, passwd);
    }

    public Realtor(String name, String eMail, String phoneNumber, String passwd){
        super(name, eMail, phoneNumber, passwd);
    }

    // регистрация в системе (новый риэлтор в таблице)
    @Override
    public void addUser(String name, String eMail, String phoneNumber, String passwd)
    {
        return;
    }

    // вход в систему (проверка на соответствие, открытие окна)
    @Override
    public void signIn(String eMail, String passwd)
    {
        return;
    }



}
