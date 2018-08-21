package fs.common;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBC_Connection {

		private static String dbURL = "jdbc:sqlserver://localhost:1433;" + "databaseName=CustomerSystem";
	    private static String userName = "sa";
	    private static String password = "12345";
	 

	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	        	//khai bao class Driver
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            conn = DriverManager.getConnection(dbURL, userName, password);
	            
	            System.out.println("OKKKKK");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            System.out.println("Loiiiiiiiiiii");
	        }
	        return conn;
	    }
	    
	    public static void main(String[] args) {
			System.out.println(getConnection());
		}
}
