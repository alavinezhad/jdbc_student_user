import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    Connection connection = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/postgres",
            "postgres",
            "67065018"
    );

    public JdbcConnection() throws SQLException {
    }

    public Connection getConnection() {
        return connection;
    }
}
