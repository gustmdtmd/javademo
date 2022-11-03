package project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public int insertMethod(BookDTO dto) {
		int chk = -1;
		
		try {
			conn= init();
			conn.setAutoCommit(false);
			
			String sql = "INSERT INTO book(num, title, author) ";
			   sql += "VALUES(book_num_seq.nextval, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			
			chk = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return chk;
	}//end insertMethod()
	
	public List<BookDTO> listMethod(){
		List<BookDTO> aList = new ArrayList<BookDTO>();
		try {
			conn=init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM book ORDER BY num";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				aList.add(dto);
			}
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;
	}//end listMethod()
	
	public List<BookDTO> searchMethod(String title) {
		List<BookDTO> aList = new ArrayList<BookDTO>();
		try {
			conn=init();
			conn.setAutoCommit(false);
//			stmt = conn.createStatement();
//			String sql = "SELECT * FROM book WHERE title LIKE '%" + title + "%' ORDER BY num";
//			rs = stmt.executeQuery(sql);
			
			String sql = "SELECT * FROM book WHERE title LIKE ? ORDER BY num";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				aList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList;
	}//end searchMethod()
	
	public int deleteMethod(int num) {
		int chk = -1;
		try {
			conn=init();
			conn.setAutoCommit(false);
			String sql = "DELETE FROM book WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			num = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}//end deleteMethod()
	
}//end class
