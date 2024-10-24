package medicalstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
	public class database {
	   
		
		Connection cnct;
		Statement stmt;
		ResultSet rst;
		PreparedStatement ps;
		void connect()
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println(e);
			}
		
		
		   try {
			   cnct=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1");
			   stmt=cnct.createStatement();
			   
		   
		 }
		   catch(SQLException e) {
			   e.printStackTrace(); 
			   System.out.println(e);
		   }
		}


		
		public static void main(String args[])
		{
		database db= new database();
		db.connect();
		}
	}




