import java.io.BufferedReader;
import java.io.FileReader;


public class SearchEngine {
	
	private String query;
	private BufferedReader br;

	public SearchEngine()
	{
		query = "Create table Media(Call_no Text,"
				+ "Title Text"
				+ "Subject Text"
				+ "Notes Text"
				+ "Type Text"
				+ "Id Number)";
	//	DBConnection.executeQuery(query);
		
		query = "Create table Book("
				+ "Id Number unique"
				+ "Author Text,"
				+ "Description Text"
				+ "Publisher Text"
				+ "City Text"
				+ "Series Text"
				+ "Year Text)";
		//DBConnection.executeQuery(query);		
	}
	
	public void readBooks()
	{
		try
		{
			br = new BufferedReader(new FileReader("book.txt")); 
			int counter = 1;
			while(true)
			{
				String book       = br.readLine();
				if(book == null) break;	
				String []bookAttr1 = book.split("\\|");
				
				//Need to do this to avoid inefficiencies occured due to the split function
				String[] bookAttr= new String[10];
				int i=0;
				//Deep Copy
				while(i<bookAttr1.length) {bookAttr[i]=bookAttr1[i];i++;}
				//Pad rest of the fields with an empty string
				while(i<10)                   {bookAttr[i]="";i++;}

				
				Book b = new Book(bookAttr[0],bookAttr[1],bookAttr[2],bookAttr[3],bookAttr[4],
						bookAttr[5],bookAttr[6],bookAttr[7],bookAttr[8],bookAttr[9]);
				
				b.display();
				
				query  = "Insert into media('"
						+ b.getCallNo()+"','"+b.getTitle()+"','"+b.getSubject()+"','"+b.getNotes()+"','Book',"+counter+");";
				
				DBConnection.executeQuery(query);
				
				query  = "Insert into book(" +counter+ ",'"
						+b.getAuthor()+"','"+b.getDescription()+"','"+b.getPublisher()+"','"+b.getCity()+"','"+b.getSeries()+"','"+b.getYear()+"')";
				
				DBConnection.executeQuery(query);
				
				
				counter++;
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void main( String args[] )
	{
		SearchEngine se = new SearchEngine();
		se.readBooks();
	}
	
}
