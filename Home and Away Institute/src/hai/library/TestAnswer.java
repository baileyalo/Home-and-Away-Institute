package hai.library;

public class TestAnswer {

	private int id;
	private int questionId;
	private String courseCode;
	private int studentId;
	private String choice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	@Override
	public String toString() {
		return "TestAnswer [id=" + id + ", questionId=" + questionId
				+ ", courseCode=" + courseCode + ", studentId=" + studentId
				+ ", choice=" + choice + "]";
	}

}
