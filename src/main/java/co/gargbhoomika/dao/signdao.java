package co.gargbhoomika.dao;
import java.sql.*;
public class signdao {
	String sql = "Insert into signuplogin values(?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/signup_login_details";
	String username = "root";
	String password="Bhoomi13@";
	
	public boolean fill(String name, String email, long phone, String pass)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2,email);
			st.setLong(3,phone);
			st.setString(4,pass);
			int n = st.executeUpdate();
			if(n==1)
			{
				return true;	
			}
		} 
		catch (Exception e) {
			System.out.println(e);		
		}
		
		
		return false;
	}

}
