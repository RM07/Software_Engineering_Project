import java.net.InetAddress;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class test {

	public static Connection getConnection() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?useSSL=false","root","rohanmeena07@");
			Statement stmt = null;
			stmt = conn.createStatement();
		    String sql = "CREATE DATABASE IF NOT EXISTS ROHAN1";
		    stmt.executeUpdate(sql);
			System.out.println("Connected...");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ROHAN1?useSSL=false","root","rohanmeena07@");
			
			
			return (Connection) con;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
	}

}
