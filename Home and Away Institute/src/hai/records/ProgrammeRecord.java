package hai.records;

public class ProgrammeRecord extends nameCode  {
	 private String Code;
	 private String Name;
	 private String Maximum_courses;
	 private String Award;
	 private String Accreditation;

	    public String getAccreditation() {
	        return Accreditation;
	    }

	    public void setAccreditation(String Accreditation) {
	        this.Accreditation = Accreditation;
	    }

	    public String getAward() {
	        return Award;
	    }

	    public void setAward(String Award) {
	        this.Award = Award;
	    }

	    public String getCode() {
	        return Code;
	    }

	    public void setCode(String Code) {
	        this.Code = Code;
	    }

	    public String getMaximum_courses() {
	        return Maximum_courses;
	    }

	    public void setMaximum_courses(String Maximum_courses) {
	        this.Maximum_courses = Maximum_courses;
	    }

	    public String getName() {
	        return Name;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }

	    @Override
	    public String toString() {
	        return "ProgrammeRecord{" + "Code=" + Code + ", Name=" + Name + ", Maximum_courses=" + Maximum_courses + ", Award=" + Award + ", Accreditation=" + Accreditation + '}';
	    }
	 
	    
	}
