package p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DynamicFun {

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
			Scanner scn=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			Integer n;
//			n=scn.nextInt();
			
			System.out.println("Enter name");
			String str_name=br.readLine();
			pstmt.setString(1, str_name);
			System.out.println("Enter city");
			String str_city=br.readLine();
			pstmt.setString(2, str_city);

			
//			pstmt.setString(1, "Saksham Agarwal");
//			pstmt.setString(2, "Ghaziabad");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted dynamically...");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
