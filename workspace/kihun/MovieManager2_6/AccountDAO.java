package MovieManager2_6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
	
	// 1.insert
	
	public int insertData(AccountDTO dto) {
		int result = 0;
		
		Connection conn = Main.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		try {
			sql = "insert into Account (id,pw,name,gender,birth,email,tel,brand)";
			sql += "values (?,?,?,?,?,?,?,?)"; 
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getBirth());
			pstmt.setString(6, dto.getEmail());
			pstmt.setString(7, dto.getTel());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} 
		return result;
	}
	public int updateData(AccountDTO dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "update Member set pw=?, email=?, tel=?";
			sql += "where id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getTel());
			pstmt.setString(3, dto.getTel());
			pstmt.setString(4, dto.getId());
			result = pstmt.executeUpdate();
			pstmt.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	public int deleteData(String id,String pw) {
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "delete Member where id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			result = pstmt.executeUpdate();
			pstmt.close();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	public List<AccountDTO> getList(){
		List<AccountDTO> lists = new ArrayList<AccountDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try { 
			sql = "select id,pw,name,geder,birth,email,brand,tel";
			sql += "from Account order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AccountDTO dto = new AccountDTO();
				
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setGender(rs.getString("gender"));
				dto.setBirth(rs.getString("Birth"));
				dto.setEmail(rs.getString("email"));
				dto.setTel(rs.getString("tel"));
				
				lists.add(dto);
			}
			rs.close();
			pstmt.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	public List<AccountDTO> getList(String id){ // search
		List<AccountDTO> lists = new ArrayList<AccountDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try { 
			sql = "select id,pw,name,geder,birth,email,brand,tel";
			sql += "from Account where id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AccountDTO dto = new AccountDTO();
				
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setGender(rs.getString("gender"));
				dto.setBirth(rs.getString("Birth"));
				dto.setEmail(rs.getString("email"));
				dto.setTel(rs.getString("tel"));
				
				lists.add(dto);
			}
			rs.close();
			pstmt.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
}
