package add.reminder.dao;
import java.sql.*;
public class adddao {
	
	String sql = "Insert into reminder_details values(?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/signup_login_details";
	String username = "root";
	String password="Bhoomi13@";
	public boolean fill(String email, int time, String date, String label)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,email);
			st.setInt(2,time);
			st.setString(3, date);
			st.setString(4,label);
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
