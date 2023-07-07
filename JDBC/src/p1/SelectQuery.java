package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create connection
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="software";
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Create query
			String q="select * from table1";
			
			//Create statement
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String city=set.getString(3);
				System.out.println(id+" : "+name+" : "+city);
			}
			System.out.println("done");
			
			//close connection
			con.close();
		} 
		
		
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
