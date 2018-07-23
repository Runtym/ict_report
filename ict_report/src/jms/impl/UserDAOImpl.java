package jms.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection conn;
	
	public UserDAOImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public ArrayList<HashMap<String, String>> selectUserList() {
		
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		String sql = "select * from user_info";
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String,String> hs = new HashMap<String,String>();
				hs.put("uiName", rs.getString("uiName"));
				hs.put("uiNum", rs.getString("uiNum"));
				hs.put("uiAge", rs.getString("uiAge"));
				al.add(hs);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
