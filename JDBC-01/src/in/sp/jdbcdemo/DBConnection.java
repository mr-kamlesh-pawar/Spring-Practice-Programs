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
		String query= "insert into t1 values(?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, 213);
		ps.setString(2, "Siddhesh");
		ps.setString(3, "JSPM");
		
		//step4 : send and execute sql query
		int count= ps.executeUpdate();
		if(count > 0) {
			System.out.println("User Inserted Sucessfully");
		} else {
			System.out.println("User not registered due to some Error");
		}
		
		//step 5 : close the connection
		ps.close();
		con.close();
		
		
		
		
		
		System.out.println("Success");
	}

}
