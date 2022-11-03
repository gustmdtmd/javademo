package project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static BookDAO dao = new BookDAO();
	
	private BookDAO() {}
	
	public static BookDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		
		return DriverManager.getConnection(url, username, password);
	}//end init()
	
	private void exit() throws SQLException{
		if(rs!=null)
			rs.close();
		
		if(stmt!=null)
			stmt.close();
		
		if(pstmt!=null)
			pstmt.close();
		
		if(conn!=null)
			conn.close();
	}//end exit()
	
	
}//end class
