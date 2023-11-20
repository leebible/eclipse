//23-11-16-5

package kr.or.ddit.study06.sec05.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection conn = null;
	
	private DBConn() {
		
	}
	
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@192.168.142.38:1521:xe"; //"jdbc:oracle:this:개인ip주소:포트주소:비번"
		String user = "LSK95";
		String password = "java";
		
		if(conn == null) {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		    } catch (ClassNotFoundException | SQLException e) {
		      	e.printStackTrace();
		    }
	    }
		return conn;
    }
}