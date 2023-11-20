//23-11-16-4

package kr.or.ddit.study06.sec05.test01;

//누군가 만들어놓은 ojdbc 자바객체를 가져온것 뿐!
//밑에 private 다음 단어 쓴 다음에 ctrl+shift+o 찾기
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public static void main(String[] args) {
		DBConnService dbs = new DBConnService();
		dbs.selectAll();
	}
	
	public void selectAll() {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id   = rs.getString("mem_id"); //현재있는 줄에 "_"를 가져와라 뜻
				String pass = rs.getString("mem_pass");
				String name = rs.getString("mem_name");
				System.out.printf("%s,%s,%s\n",id,pass,name);
		    }   
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
