package hai.records;

public class CourseRecord extends nameCode {

	 
	 private String Code;
	 private String Name;
	 private String Description;
	 private String Credits;
	 private String ProgramCode;
	 private int Duration;

	    public String getCode() {
	        return Code;
	    }

	    public void setCode(String Code) {
	        this.Code = Code;
	    }

	    public String getCredits() {
	        return Credits;
	    }

	    public void setCredits(String Credits) {
	        this.Credits = Credits;
	    }

	    public String getDescription() {
	        return Description;
	    }

	    public void setDescription(String Description) {
	        this.Description = Description;
	    }

	    public int getDuration() {
	        return Duration;
	    }

	    public void setDuration(int Duration) {
	        this.Duration = Duration;
	    }

	    public String getName() {
	        return Name;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }

	    @Override
	    public String toString() {
	        return "CourseRecord{" + "Code=" + Code + ", Name=" + Name + ", Description=" + Description + ", Credits=" + Credits + ", Duration=" + Duration + '}';
	    }
	    
	       public String getProgramCode() {
	        return ProgramCode;
	    }

	    public void setProgramCode(String ProgramCode) {
	        this.ProgramCode = ProgramCode;
	    }
	 
	}
