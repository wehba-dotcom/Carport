package business.entities;
public class User{

    public User(String name, String email, String adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phonenumber = phonenumber;
        this.balance = balance;
        this.rolle = rolle;
        this.password = password;
    }

    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String name;
    private String email;
    private String adress;
    private String phonenumber;
    private int balance;
    private String rolle;
    private String password; // Should be hashed and secured

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Double getBalance() {
        return Double.valueOf(balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
