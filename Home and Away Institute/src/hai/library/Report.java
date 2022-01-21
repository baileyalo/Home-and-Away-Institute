package hai.library;
import java.util.Date;

public class Report extends User {
	private int finalScore;
	private String remarks;
	private Date date;
	private String code;
	private String courseName;

	public Report() {
		super();
		setCourseName("");
		setCode("");
		setDate(new Date());
		setFinalScore(0);
		setRemarks("");
	}

	public Report(int idNumber, String userName, String firstName, String lastName, String code,
			String courseName, Date date, int finalScore, String remarks) {
		super(idNumber, userName, firstName, lastName);
		setCode(code);
		setCourseName(courseName);
		setFinalScore(finalScore);
		setRemarks(remarks);
	}

	public Report(Report obj) {
		setIdNumber(obj.getIdNumber());
		setFirstName(obj.getFirstName());
		setLastName(obj.getLastName());
		setCode(obj.getCode());
		setFinalScore(obj.getFinalScore());
		setRemarks(obj.getRemarks());
	}

	@Override
	public String toString() {
		String str;
		str = super.toString() + "\n";
		str += "Course Code   :" + getCode() + "\n";
		str += "Course Name   :" + getCourseName() + "\n";
		str += "Remarks       :" + getRemarks() + "\n";
		return str;
	}

	/**
	 * @return the finalScore
	 */
	public int getFinalScore() {
		return finalScore;
	}

	/**
	 * @param finalScore the finalScore to set
	 */
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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

}
