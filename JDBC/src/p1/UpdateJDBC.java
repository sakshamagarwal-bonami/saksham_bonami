package p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Connect Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection setup
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="software";
			Connection con=DriverManager.getConnection(url,username,password);
			
			//create query
			String q="update table1 set tCity=? where tId=?";
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new city name");
			String city=bf.readLine();
			System.out.println("Enter the id");
			int id=Integer.parseInt(bf.readLine());
			
			System.out.println(id);
			
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, city);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
//			stmt.executeUpdate(q);
			
			System.out.println("Changes done");
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
