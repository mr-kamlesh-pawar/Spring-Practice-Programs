package in.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public static void main(String[] args) throws Exception
	{
		// Step 1 : load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 : Establish connection between java and DB
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kpawar", "root", "root");
		
		
		//step 3: Create a object PreparedStatement
		String query= "select * from t1";
		PreparedStatement ps= con.prepareStatement(query);
		
		ResultSet rs=  ps.executeQuery();
		
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String name= rs.getString("name");
			String college = rs.getString("college");
			
			
			System.out.println("Id: "+ id + " " +"Name: "+ name + " " + "College: "+ college);
		}
		
		
	
		//step 5 : close the connection
		ps.close();
		con.close();
		
		
		
		
		
		System.out.println("Success");
	}

}
