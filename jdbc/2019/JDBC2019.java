import java.sql.;

public class JDBC2019 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/java";
            String user = "puru";
            String pass = "123456789";

            Class.forName("com.mysql.jdbc.Driver");

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