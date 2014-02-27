public class Media {
  
  private String callNo;
  private String title;
  private String subject;
  private String notes;
	
  	public Media()
  	{
  		
  	}
	public Media(String call_no,String title,String subject,String notes)
	{
		this.callNo = call_no;
		this.title   = title;
		this.subject = subject;
		this.notes   = notes;
	}
	
	public void display()
	{
		System.out.println("Call No: "+this.callNo);
		System.out.println("Title  : "+this.title);
		System.out.println("Subject: "+this.subject);
		System.out.println("Notes  : "+this.notes);
	}
	
	public void setCallNo(String callNo)
	{
		this.callNo = callNo;
	}
	
	public String getCallNo()
	{
		return this.callNo;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	
	public String getSubject()
	{
		return this.subject;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	
	public String getNotes()
	{
		return this.notes;
	}
}
