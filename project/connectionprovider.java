package project;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author moidin
 */
public class connectionprovider {
    public static Connection getcon() {
        try {
            // Class.forName("com.mysql.jdbc.Driver"); (Not needed in modern versions)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/lib", "root", "aiktc");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
