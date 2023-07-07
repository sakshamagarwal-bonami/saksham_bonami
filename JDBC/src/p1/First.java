package p1;
import java.sql.Connection;
import java.sql.DriverManager;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="software";
			Connection con=DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			}
			else {
				System.out.println("Connection created");	
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
