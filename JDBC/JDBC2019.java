import java.sql.*;

public class JDBC2019 {
    public static void main(String[] args) {
        try {
            // java is the name of database. so change it to your db name
            String url = "jdbc:mysql://localhost/java";
            
            // user for mysql connection
            String user = "puru";

            //password for mysql user
            String pass = "123456789";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stm = con.createStatement();

            String query = "Select * from students where district='morang'";

            ResultSet rs = stm.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}