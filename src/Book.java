
public class Book extends Media{

	private String author;
	private String description;
	private String publisher;
	private String city;
	private String series;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	private String year;
	public Book()
	{
		super();
	}
	public Book(String call_no, String title, String subject, String author,String description, 
			String publisher, String city, String year,String series,String notes) 
	{
		super(call_no, title, subject, notes);
		this.author      = author;
		this.description = description;
		this.publisher   = publisher;
		this.city        = city;
		this.series      = series;
		this.year        = year;
		
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		super.display();
		System.out.println("Author     : "+this.author);
		System.out.println("Description: "+this.description);
		System.out.println("Publisher  : "+this.publisher);
		System.out.println("City       : "+this.city);
		System.out.println("Series     : "+this.series);
		System.out.println("Year       : "+this.year);
	}
	
}




