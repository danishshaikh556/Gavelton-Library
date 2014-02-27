import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
	
	public class videoRun {
		public static BufferedReader br;
		
		public videoRun()
		{
			read();
			displayConsole();
		}
	
		public void read()
		{
               try
				{
					br = new BufferedReader(new FileReader("video.txt")); 
					while(true)
					{
						String video    = br.readLine();
						if(video == null) break;	
						//System.out.println(video);
						String[] videoAttr1 =video.split("\\|");
						
						//Need to do this to avoid inefficiencies occured due to the split function
						String[] videoAttr=new String[8];
						int i=0;
						//Deep Copy
						while(i<videoAttr1.length) {videoAttr[i]=videoAttr1[i];i++;}
						//Pad rest of the fields with an empty string
						while(i<8)                   {videoAttr[i]="";i++;}
						
						Video p = new Video(videoAttr[0],videoAttr[1],videoAttr[2],videoAttr[3],videoAttr[4],
								videoAttr[5],videoAttr[6],videoAttr[7]);
					
						Storage.add(p);
					}
				}
				catch(Exception e)
				{
					
				}
		}
		
		
		public void displayConsole()
		{
			Iterator<Video> itr=Storage.iterator();
			System.out.println(Storage.size());
			while(itr.hasNext())
			{
				Video printin=itr.next();
				printin.display();
			}
		}
		
		
		public static void main( String args[] )
		  {
			
			videoRun da = new videoRun();
			
			  
	       }
		  
		  
		  private static ArrayList<Video> Storage=new ArrayList<Video>();
  

}
