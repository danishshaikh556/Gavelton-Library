import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
	
	public class periodicRun {
		public static BufferedReader br;
		
		public periodicRun()
		{
			read();
			displayConsole();
		}
	
		public void read()
		{
               try
				{
					br = new BufferedReader(new FileReader("periodic.txt")); 
					while(true)
					{
						String periodic    = br.readLine();
						if(periodic == null) break;	
						System.out.println(periodic);
						String[] periodicAttr1 =periodic.split("\\|");
						
						//Need to do this to avoid inefficiencies occured due to the split function
						String[] periodicAttr= new String[12];
						int i=0;
						//Deep Copy
						while(i<periodicAttr1.length) {periodicAttr[i]=periodicAttr1[i];i++;}
						//Pad rest of the fields with an empty string
						while(i<12)                   {periodicAttr[i]="";i++;}
						
						
						Periodic p = new Periodic(periodicAttr[0],periodicAttr[1],periodicAttr[2],periodicAttr[3],periodicAttr[4],
								periodicAttr[5],periodicAttr[6],periodicAttr[7],periodicAttr[8],periodicAttr[9],periodicAttr[10],periodicAttr[11]);
					
						Storage.add(p);
					}
				}
				catch(Exception e)
				{
					
				}
		}
		
		
		public void displayConsole()
		{
			Iterator<Periodic> itr=Storage.iterator();
			System.out.println(Storage.size());
			while(itr.hasNext())
			{
				Periodic printin=itr.next();
				printin.display();
			}
		}
		
		
		public static void main( String args[] )
		  {
			
			periodicRun da = new periodicRun();
			
			  
	       }
		  
		  
		  private static ArrayList<Periodic> Storage=new ArrayList<Periodic>();
  

}
