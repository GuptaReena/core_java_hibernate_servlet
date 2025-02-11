import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	/*
	 * Types of execute method
	 * --------------------------------------
	 * 
		boolean  = execute() -- This query is used for DDL commands	
		int rowAffected = executeUpdate() -- This query is used for DML commands
		ResultSet rs = executeQuery() -- This query is used for DQL commands
	*/
			/*
			 * 
			 * Types of Statement
			 * 
			 * --------------------------------------
			 * 
			 * 1. Statement
			 * 2. Callable statement
			 * 			 -It is used to execute the stored procedure
			 * 			 -Callable statement is only use to call the stored procedure not to create 
			 * 			 -If you want to create a stored procedure use mysql workbench or from java side use
			 * 				statement , prepared statement 
			 * 			
			 * 3. Prepared Statement
			 * 			- they are precompiled once 
			 * 			- And get executed many times
			 * 
			 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// step1 : Load Drivers
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// step2 : Establish Connection
		
		
		Connection conn = null;
		Statement stmt = null;
		
		String connUrl = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password = "root";
		
		
		 try {
			 conn = DriverManager.getConnection(connUrl, userName, password);
			System.out.println("Connection Establish .....");
			
			 stmt = conn.createStatement();
			String selectQuery = "select * from person_details";
			
			// we use executeQuery method  as we are executing  the DQL select query			
			ResultSet rs  = stmt.executeQuery(selectQuery);
			
			while(rs.next()) {
				
				int pId = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName =  rs.getString(3);
				Date dob = rs.getDate(4);
				Long mobile = rs.getLong(5);
				String city = rs.getString(6);
			
				System.out.println("ID : " + pId);
				System.out.println("FirstName : " + firstName );
				System.out.println("LastName : " + lastName);
				System.out.println("DOB : " + dob );
				System.out.println("Mobile.No : " + mobile);
				System.out.println("City : " + city);
				
				System.out.println("====================================");
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 try {
				stmt.close();
				 conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
		
		
		
		// step3 : create statement and execute it
		// step4 : Handle exception
		
		
	}

}
