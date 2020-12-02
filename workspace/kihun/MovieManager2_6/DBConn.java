package MovieManager2_6;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	private static Connection dbConn;
	public static Connection getConnection() {
		try {
			String url = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
			
			String user = "corner";
			String password = "gangster123";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Driver를 로딩
			
			dbConn = DriverManager.getConnection(url, user, password);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
		return dbConn;
	}
	
	public static void close() {
		if(dbConn == null ) {
			try { 
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		dbConn=null;
	}
}
