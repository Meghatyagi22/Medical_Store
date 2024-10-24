package medicalstore;
import java.sql.*;
public class database1 {
Connection cnct;
Statement stmt;
ResultSet rst;
PreparedStatement ps;
void connect()
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
	try
	{
		cnct=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1");
		stmt=cnct.createStatement();
		rst=stmt.executeQuery("select *from login");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
}
	public static void main(String[] args)
	{
		database db=new database();
		db.connect();
	}

}

