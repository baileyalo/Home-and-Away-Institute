package hai.library;



public class Programme {
	protected String code;
	protected String name;
	protected String award;
	protected String accreditation;
	protected int maximumNumberCourses;
	

public Programme(){
	setCode("code");
	setName("name");
	setMaximumNumberCourses(8);
	setAward("award");
	setAccreditation("accreditation");
		
	}
	
	public Programme (String code,String name,int maximumNumberCourses,String award,String accreditation){
		setCode(code);
		setName(name);
		setMaximumNumberCourses(maximumNumberCourses);
		setAward(award);
		setAccreditation(accreditation);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaximumNumberCourses() {
		return maximumNumberCourses;
	}

	public void setMaximumNumberCourses(int maximumNumberCourses) {
		this.maximumNumberCourses = maximumNumberCourses;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}
	
	public String toString()
	{
		return getName();
	}
}

