package businesslogiclayer.roles;

/**
 * Created by Anzhela on 22.05.2017.
 */

public abstract class User {
    private Integer userID;
    private String name; // ФИО
    private String phoneNumber;

    private String eMail; // используется как логин
    private String passwd;


    public User(Integer userID, String name, String eMail, String phoneNumber, String passwd){
        this.userID = userID;
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.passwd = passwd;
    }

    public User(String name, String eMail, String phoneNumber, String passwd){
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.passwd = passwd;
    }

    public Integer getUserID() {
        return userID;
    }
    public void setClientID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return eMail;
    }
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }



    /*public static User signIn(String login, String pwd) throws InvalidSignIn, InvalidUser{
        (new MapperRepository()).signIn(login, pwd);
        return (new MapperRepository()).findUser(login);
    }*/

    //регистрация
    public abstract void addUser(String name, String eMail, String phoneNumber, String passwd);

    // вход
    public abstract void signIn(String eMail, String passwd);
}
