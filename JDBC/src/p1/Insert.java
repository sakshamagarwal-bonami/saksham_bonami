package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

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
			String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			
			//create a statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);//gives no of changes made
			System.out.println("Table created in database..");
			con.close();
			
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
