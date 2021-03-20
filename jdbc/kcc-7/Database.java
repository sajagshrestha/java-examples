//classpath chai milauna parxa yo garna
import java.sql.*;

class Database{
	public static void main(String args[]){
		try{
			//exam ma chai lekhna parxa: Class.forName("com.mysql.jdbc.Driver");  
			Connection dbConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testJava","root","password"); 
			//dbname= javaTest, username=root, password=password
			Statement statement =  dbConnection.createStatement();
			//insert
			statement.executeUpdate("INSERT INTO students VALUES(1,'Ram','BIT',20)");
			System.out.println("insert sucessfull");
			//update
			statement.executeUpdate("UPDATE students SET name = 'Shyam' WHERE id=2 ");
			System.out.println("update sucessfull");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}