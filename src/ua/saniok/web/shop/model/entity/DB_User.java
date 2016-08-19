package ua.saniok.web.shop.model.entity;

/**
 * Created by sAnCho on 17.08.2016.
 */
public class DB_User {

    private int idU;
    private String login;
    private String email;
    private String passw;
    private String name;
    private String sourname;
    private int cityKey;
    private String dateBirth;
    private String dateReg;

    public DB_User(int idU, String login, String email, String passw, String name, String sourname, String dateBirth, String dateReg, int cityKey) {
        this.idU = idU;
        this.login = login;
        this.email = email;
        this.passw = passw;
        this.name = name;
        this.sourname = sourname;
        this.cityKey = cityKey;
        this.dateBirth = dateBirth;
        this.dateReg = dateReg;
    }

    public int getIdU() {
        return idU;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassw() {
        return passw;
    }

    public String getName() {
        return name;
    }

    public String getSourname() {
        return sourname;
    }

    public int getCityKey() {
        return cityKey;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }

    public void setCityKey(int cityKey) {
        this.cityKey = cityKey;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
