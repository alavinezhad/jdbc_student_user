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
}
