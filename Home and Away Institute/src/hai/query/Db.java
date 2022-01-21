package hai.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Db {

	/**
	 * @param args
	 */
	
	private static Connection con;
	private static Statement st;
	@SuppressWarnings("unused")
	private static ResultSet rs; 
	
	public static Connection getDb()
	{
		
		connect();
		return con;
	}
	
	public static void connect()
	{
		
		try {
		
		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);
		
		String Db="jdbc:odbc:hai";
		con=DriverManager.getConnection(Db);
	
		st = con.createStatement();
		String sql="select * from Student";
		st.executeQuery(sql);
		
		}catch(Exception ex){
		}
	}
	
	
	public static int insert(String query) throws SQLException
	{
		 Connection conn = getDb();		 
		 Statement st = conn.createStatement();
		 int rows=  st.executeUpdate(query);
		 System.out.println("Number of rows affected: "+rows);
		 st.close();
		 conn.close();
		 return rows;
	}
	
	public static ResultSet select(String query) throws SQLException
	{
		 Connection conn = getDb();
		 Statement st = conn.createStatement();
		 ResultSet rs = st.executeQuery(query);
		 int rows = 0;
		 while(rs.next())
		 {
			 rows ++;
		 }		 
		 System.out.println("Number of rows retreived: "+rows);
		 st.close();
		 conn.close();
		 return rs;
		
	}
	
	public static int update(String query) throws SQLException
	{
		 Connection conn = getDb();
		 Statement st = conn.createStatement();
		 int rows=  st.executeUpdate(query);		
		 System.out.println("Number of rows affected: "+rows);
		 st.close();
		 conn.close();
		 return rows;
	}
	
	public static int create(String query) throws SQLException
	{
		 Connection conn = getDb();
		 Statement st = conn.createStatement();
		 int rows=  st.executeUpdate(query);
		 System.out.println("Number of rows affected: "+rows);
		 st.close();
		 conn.close();
		 return rows;
		
	}	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Db.connect();
	}

}
