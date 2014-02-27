
public class Periodic extends Media {
	private String author;
	private String description;
	private String publisher;
	private String publishingHistory;
	private String series;
	private String relatedTitles;
	private String otherFormsofTitiles;
	private String govDocNumber;
	
	public Periodic()
	{
		super();
	}
	
	public Periodic(String callnumber,String title,String subjects,String author, String description, String publisher,
			String publishingHistory, String series,String notes, String relatedTitles,
			String otherFormsofTitiles, String govDocNumber) 
	{
		super(callnumber,title,subjects,notes);
		
		this.author               = author             ;
		this.description          = description        ;
		this.publisher            = publisher          ;
		this.publishingHistory    = publishingHistory  ;
		this.series               = series             ;
		this.relatedTitles        = relatedTitles      ;
		this.otherFormsofTitiles  = otherFormsofTitiles;
		this.govDocNumber         = govDocNumber       ;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

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

	public String getPublishingHistory() {
		return publishingHistory;
	}

	public void setPublishingHistory(String publishingHistory) {
		this.publishingHistory = publishingHistory;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getRelatedTitles() {
		return relatedTitles;
	}

	public void setRelatedTitles(String relatedTitles) {
		this.relatedTitles = relatedTitles;
	}

	public String getOtherFormsofTitiles() {
		return otherFormsofTitiles;
	}

	public void setOtherFormsofTitiles(String otherFormsofTitiles) {
		this.otherFormsofTitiles = otherFormsofTitiles;
	}

	public String getGovDocNumber() {
		return govDocNumber;
	}

	public void setGovDocNumber(String govDocNumber) {
		this.govDocNumber = govDocNumber;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Author                :"  +this.author);
		System.out.println("Description           :"  +this.description);
		System.out.println("Publisher             :"  +this.publisher);
		System.out.println("Publishing History    :"  +this.publishingHistory);
		System.out.println("Series                :"  +this.series);
		System.out.println("Related Titiles       :"  +this.relatedTitles);
		System.out.println("Other forms of Title  :"  +this.otherFormsofTitiles);
		System.out.println("Goverment Doc Number  :"  +this.govDocNumber);
		
	}
	
	
	

}
