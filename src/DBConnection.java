import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

    private static DBConnection me;

    public static DBConnection getInstance() {
        if (me == null) {
            me = new DBConnection();
        }
        return me;
    }
    
    public static void executeQuery(String query)
    {
    	   Connection c = null;
    	    Statement stmt = null;
    	    try 
    	    {
    	      Class.forName("org.sqlite.JDBC");
    	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
    	      System.out.println("Opened database successfully");

    	      stmt = c.createStatement();
    	      stmt.executeUpdate(query);
    	      stmt.close();
    	      c.close();
    	    } 
    	    catch ( Exception e ) 
    	    {
    	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    	      System.exit(0);
    	    }
    	    System.out.println("Executed successfully");
    }
    public static void selectQuery(String attribute,String value)
    {
    	    String query;
    	    Connection c = null;
    	    Statement stmt = null;
    	    try 
    	    {
    	      Class.forName("org.sqlite.JDBC");
    	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
    	      System.out.println("Opened database successfully");
 
    	      stmt  = c.createStatement();
    	      query = "select * from media where "+attribute+" like "+ ""+value;
    	      
    	      ResultSet rs = stmt.executeQuery(query);
    	      while(rs!= null)
    	      {
    	   	      Book b = new Book();
    	    	  b.setCallNo(rs.getString("callno"));
	    	      b.setTitle(rs.getString("title"));
	    	      b.setSubject(rs.getString("subject"));
	    	      b.setNotes(rs.getString("notes"));
	    	      
	    	      query = "select * from book where id ="+rs.getInt("id");
	    	      ResultSet rs1 = stmt.executeQuery(query); 
	    	      b.setPublisher(rs1.getString("publisher"));
	    	      b.setDescription(rs1.getString("description"));
	    	      b.setCity(rs1.getString("city"));
	    	      b.setSeries(rs1.getString("series"));
	    	      b.setYear(rs1.getString("year"));
	    	      b.display();
    	      }
	    	  stmt.close();
    	      c.close();
    	    } 
    	    catch ( Exception e ) 
    	    {
    	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    	      System.exit(0);
    	    }
    	    System.out.println("Executed successfully");
    }
    
}