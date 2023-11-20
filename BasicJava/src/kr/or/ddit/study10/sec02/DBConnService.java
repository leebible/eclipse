//23-11-16-4

package kr.or.ddit.study10.sec02;

//누군가 만들어놓은 ojdbc 자바객체를 가져온것 뿐!
//밑에 private 다음 단어 쓴 다음에 ctrl+shift+o 찾기
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.study06.sec05.test01.DBConn;

public class DBConnService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public static void main(String[] args) {
		DBConnService dbs = new DBConnService();
		dbs.selectAll();
		System.out.println("프로그램 실행되고있음");
		System.out.println("프로그램 실행되고있음");
		System.out.println("프로그램 실행되고있음");
	}
	
	public void selectAll() {
		conn = DBConn.getConnection();
		try { //=if
			System.out.println("실행1");
			stmt = conn.createStatement();
			String sql = "select * from member";
			System.out.println("실행2");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id   = rs.getString("mem_id"); //현재있는 줄에 "_"를 가져와라 뜻
				String pass = rs.getString("mem_pass");
				String name = rs.getString("mem_name");
				System.out.printf("%s,%s,%s\n",id,pass,name);
				System.out.println("실행3");
		    }   
			System.out.println("실행4");
		} catch (SQLException e) { //=else
			System.out.println("실행5");
			e.printStackTrace();
			// TODO: handle exception
		}finally { // 언제나 실행됌
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
