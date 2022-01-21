package hai.library;

public class Course {

	private String code;
	private String courseName;
	private String description;
	private int credits;
	private String duration;
	
	
	public Course(){
		setCode("");
		setCourseName("");
		setDescription("");
		setCredits(3);
		setDuration("");
	}
	
	
	public Course(String code, String courseName, String description,
			int credits, String duration) {
		setCode(code);
		setCourseName(courseName);
		setDescription(description);
		setCredits(credits);
		setDuration(duration);
	}


	@Override
	public String toString() {
		String str;
		str = "Course Code      :" + getCode() + "\n";
		str += "Name             :" + getCourseName() + "\n";
		str += "Description      :" + getDescription() + "\n";
		str += "Credits          :" + getCredits() + "\n";
		str += "Duration         :" + getDuration() + "\n";
		return str;
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}


	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}


	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

}