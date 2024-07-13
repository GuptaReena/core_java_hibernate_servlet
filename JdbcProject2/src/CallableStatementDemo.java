import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// step 1: load driver
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// step 2: Establish Connection
		
		Connection conn = null;
		
		String connUrl = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password = "root";
		
		try {
			conn = DriverManager.getConnection(connUrl, userName, password);
			System.out.println("Connection Establish......");
			
			// step 3: create statement and execute it 
				
			String callableQuery = "{call demodb.person_details(?,?,?,?,?,?)}";
			
			CallableStatement cstmt = conn.prepareCall(callableQuery);
			
			cstmt.setInt(1, 108);
			cstmt.setString(2, "Kaushal");
			cstmt.setString(3, "Choudhari");
			cstmt.setString(4, "2001-06-21");
			cstmt.setInt(5, 1212111111);
			cstmt.setString(6, "US");
			
			 boolean result = cstmt.execute();
			System.out.println("stored procedure called : ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
