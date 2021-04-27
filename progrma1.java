package BASICSPROGRAMS;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class progrma1 {
	public static void main(String[] args) throws ClassNotFoundException {
System.out.println("Program starts...");
        
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "usersdb";
		String dbusername = "root";
		String dbuserpwd = "root";
		java.sql.Connection con=null;
		try 
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url+dbname,dbusername,dbuserpwd);
			System.out.println("connected to userdb");
			
			java.sql.Statement stmt = con.createStatement();

//			String insertQuery = "insert into usersdb.new_table values(3,'USER1')";
//			stmt.execute(insertQuery);
//			System.out.println("insert record success");
//			String updata="update usersdb.new_table set name='raju' where id=3";
//			stmt.execute(updata);
//			System.out.println("update record success");
			String delete="delete from usersdb.new_table  where id=3";
			stmt.execute(delete);
			System.out.println(" delete sucessfully");
			System.out.println("update record success");
			
			
//			
//			String updateQuery = "update usersdb.new_table set name = 'madhu' where id=1";
//			stmt.execute(updateQuery);
//			System.out.println("update record success");
//			
//			String deleteQuery = "delete from usersdb.users where id = 1";
//			stmt.execute(deleteQuery);
//			System.out.println("delete record success");
			
			
			con.close();
			System.out.println("disconnected from userdb");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Program ends...");
	}

}
