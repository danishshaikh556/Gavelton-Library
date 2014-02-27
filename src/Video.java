
public class Video extends Media {
	
	  private String description;
	  private String distributor;
	  private String series     ;
	  private String label      ;
  
	  
	  public Video()
	  {
		  super();
	  }
	  
	  public Video(String callnumber,String title,String subjects, String description, String distributor,
			       String notes,String series,String label) 
	  {
		
		super(callnumber,title,subjects,notes);
		this.description = description ;
		this.distributor = distributor ;
		this.series      = series      ;
		this.label       = label       ;
	   }

	   public String getDescription() {
		return description;
	   }

	   public void setDescription(String description) {
		this.description = description;
	   }

	   public String getDistributor() {
		return distributor;
	   }

	   public void setDistributor(String distributor) {
		this.distributor = distributor;
	    }

	   public String getSeries() {
		return series;
	   }

	   public void setSeries(String series) {
		this.series = series;
	    }

	    public String getLabel() {
		return label;
	    }

	    public void setLabel(String label) {
		this.label = label;
	
	    }

	    
	    public void display()
		{
			super.display();
			
			System.out.println("Description           :"  +this.description);
			System.out.println("Distributor           :"  +this.distributor);
			System.out.println("Series                :"  +this.series);
			System.out.println("Label                 :"  +this.label);
		}
  
  
	
	
}
