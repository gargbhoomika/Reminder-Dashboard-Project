package delete.reminder.dao;
import java.sql.*;
public class deletedao {
	
	String sql = "Delete from reminder_details where email=? AND time1=? AND date1=?";
	String url = "jdbc:mysql://localhost:3306/signup_login_details";
	String username = "root";
	String password="Bhoomi13@";
	
	public boolean delete(String email, int time, String date)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,email);
			st.setInt(2,time);
			st.setString(3, date);
			int n = st.executeUpdate();
			if(n==1)
			{
				System.out.println("enter deletedao");
				return true;
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		return false;
	}

}
