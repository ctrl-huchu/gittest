package com.tj.hu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection con;
	PreparedStatement psmt;
	ResultSet res;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	public void addmember(MemberBean dto) throws SQLException {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "tjsw", "tj311");
			String sql = "insert into member(name,id,nickname,password,email,phone) values(?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getNickname());
			psmt.setString(4, dto.getPassword());
			psmt.setString(5, dto.getEmail());
			psmt.setString(6, dto.getPhone());
		
			psmt.executeUpdate();
			con.commit();

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			if(res != null) res.close();
			if(psmt != null) psmt.close();
			if(con != null) con.close();
		}
	}
}
