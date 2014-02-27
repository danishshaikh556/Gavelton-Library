
public class Film extends Media{
	
	private String director;
	private String year;
	
	
	public Film() 
	{
		super();
		
	}
	
	public Film(String call_no, String title, String subject,String director, String notes,String year)
	{
		super(call_no, title, subject, notes);
		this.director = director;
		this.year     = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Director   :" +this.director);
		System.out.println("Year       :" +this.year    );
	}
	
	
	

}
