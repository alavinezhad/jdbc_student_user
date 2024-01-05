import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private Date signUp_date;

    public User() {
    }

    public User(String username, String password, Date signUp_date) {
        this.username = username;
        this.password = password;
        this.signUp_date = signUp_date;
    }

    public User(int id, String username, String password, Date signUp_date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.signUp_date = signUp_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSignUp_date() {
        return signUp_date;
    }

    public void setSignUp_date(Date signUp_date) {
        this.signUp_date = signUp_date;
    }
}
