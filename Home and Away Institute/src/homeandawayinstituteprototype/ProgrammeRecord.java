package homeandawayinstituteprototype;




/**
 *
 * @author harvey
 */
public class ProgrammeRecord extends nameCode  {
 private String Code;
 private String Name;
 private String Maximum_Courses;
 private String Award;
 private String Accreditation;

    
	@Override
	public String toString() {
		return "Program [code=" + Code + ", name=" + Name
				+ ", maximum_Courses=" + Maximum_Courses + ", award=" + Award
				+ ", accreditation=" + Accreditation + "]";
	}


	public String getCode() {
		return Code;
	}


	public void setCode(String code) {
		Code = code;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getMaximum_Courses() {
		return Maximum_Courses;
	}


	public void setMaximum_Courses(String maximum_Courses) {
		Maximum_Courses = maximum_Courses;
	}


	public String getAward() {
		return Award;
	}


	public void setAward(String award) {
		Award = award;
	}


	public String getAccreditation() {
		return Accreditation;
	}


	public void setAccreditation(String accreditation) {
		Accreditation = accreditation;
	}

    
}
