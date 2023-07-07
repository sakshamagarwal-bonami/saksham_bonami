package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="software";
			Connection con=DriverManager.getConnection(url,username,password);
			
			//create query
			String q="insert into table1(tName,tCity) values (?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1, "Saksham Agarwal");
			pstmt.setString(2, "Ghaziabad");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted...");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
