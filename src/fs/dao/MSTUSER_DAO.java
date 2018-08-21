package fs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fs.common.JDBC_Connection;

public class MSTUSER_DAO {

	public static boolean validate(String userName, String password) {
		Connection conn = JDBC_Connection.getConnection();
		String sql = "SELECT * FROM MSTUSER WHERE USER_ID = ? AND PASSWORD =?";
		int totalRecord = 0;
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				totalRecord++;
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalRecord > 0 ? true : false;
	}
}
