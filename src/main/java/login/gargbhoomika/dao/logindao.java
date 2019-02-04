package login.gargbhoomika.dao;
import java.sql.*;
public class logindao {
	
	String sql = "Select * from signuplogin where email=? and pass=?";
	
	String url = "jdbc:mysql://localhost:3306/signup_login_details";
	String username = "root";
	String password="Bhoomi13@";
	
	public boolean check(String email, String pass)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			if(rs.next())
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
