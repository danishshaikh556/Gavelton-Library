
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
	
	public class filmRun {
		public static BufferedReader br;
		
		public filmRun()
		{
			read();
			displayConsole();
		}
	
		public void read()
		{
               try
				{
					br = new BufferedReader(new FileReader("film.txt")); 
					while(true)
					{
						String film    = br.readLine();
						if(film == null) break;	
						//System.out.println(film);
						String[] filmAttr1 =film.split("\\|");
						
						//Need to do this to avoid inefficiencies occured due to the split function
						String[] filmAttr=new String[8];
						int i=0;
						//Deep Copy
						while(i<filmAttr1.length) {filmAttr[i]=filmAttr1[i];i++;}
						//Pad rest of the fields with an empty string
						while(i<6)                   {filmAttr[i]="";i++;}
						
						Film p = new Film(filmAttr[0],filmAttr[1],filmAttr[2],filmAttr[3],filmAttr[4],filmAttr[5]);
					
						Storage.add(p);
					}
				}
				catch(Exception e)
				{
					
				}
		}
		
		
		public void displayConsole()
		{
			Iterator<Film> itr=Storage.iterator();
			System.out.println(Storage.size());
			while(itr.hasNext())
			{
				Film printin=itr.next();
				printin.display();
			}
		}
		
		
		public static void main( String args[] )
		  {
			
			filmRun da = new filmRun();
			
			  
	       }
		  
		  
		  private static ArrayList<Film> Storage=new ArrayList<Film>();
  

}

