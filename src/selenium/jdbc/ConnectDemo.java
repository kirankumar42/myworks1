package selenium.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ConnectDemo {

	Statement stmt;
	Connection con;
	@BeforeTest
	public void setUp() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
		stmt=con.createStatement();
	}
	@Test
	public void display() throws SQLException{
		String query="select * from emp";
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()){
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getString(3));
		}
	}
	@AfterTest
	public void close() throws SQLException{
		System.out.println("This is con close");
		con.close();
	}
	

}
