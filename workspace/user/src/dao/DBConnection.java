package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		//������ �ϱ� ���ؼ��� url, user, pw, driver�� �ʿ��ϴ�.
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "hr";
			String pw = "hr";
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			//1.�ڹ� Ŭ������ �ƴ� ��� Ȥ�� ������ Ŭ����ȭ ��Ű�� �۾�
			//2.�ܺ� Ŭ������ �������� ����
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
			
			//Exception ��ü���� ���� Ŭ���� �빮�ڸ� �����ͼ� �����.
		} catch (ClassNotFoundException cnfe) {
			//���� �߻��� � ����, ��� ° �������� �ۼ����ְ�, �ش� ������ �ۼ��Ѵ�.
			System.out.println("DBConnection.java:20, ����̹� �ε� ���� : " + cnfe);
		} catch (SQLException sqle) {
			System.out.println("DBConnection.java:22, DB ���� ���� : " + sqle);
		} catch (Exception e) {
			System.out.println("DBConnection.java:24, " + e);
		}
		
		return conn;
	}
}










