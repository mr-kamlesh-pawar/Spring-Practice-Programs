package in.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
	
	public static void main(String[] args) throws Exception
	{
		// Step 1 : load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 : Establish connection between java and DB
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kpawar", "root", "root");
		
		
		//step 3: Create a object PreparedStatement
		String query= "update t1 set name=? where id=?";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, "Abhishek");
		ps.setInt(2, 23);
		
		//step4 : send and execute sql query
		int count= ps.executeUpdate();
		if(count > 0) {
			System.out.println("User Updated Sucessfully");
		} else {
			System.out.println("User not Updated due to some Error");
		}
		
		//step 5 : close the connection
		ps.close();
		con.close();
		
			
		
		
		System.out.println("Success");
	}

}
