package homeandawayinstituteprototype;

import java.sql.Connection;// sql server connectivity
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;//Sql server connectivity
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author Team5
 */
public final class DatabaseLayer {
	private static Connection getDatabaseConnection() {
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		String accessFileName = "C:/Users/Antonette Harvey/Documents/year 3/prototype";
		String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ="
				+ accessFileName + ".accdb;";
		String username = "";
		String password = "";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(connURL, username,
					password);
			if (conn == null)
				System.out.println("Could not connect to database");
			else
				System.out.println("Successfully connected to database");
			return conn;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}

	}

	public static LoggedInUser getLoggedinUser(String Username, String password)
			throws ClassNotFoundException, SQLException {
		Connection conn = getDatabaseConnection();

		String SQL = "{call getLoggedInUser(?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, Username);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();

		LoggedInUser user = null;
		while (rs.next()) {

			boolean isStudent = rs.getBoolean("isStudent");
			boolean isStaff = rs.getBoolean("isStaff");

			if (isStudent) {
				user = new StudentRecord();
			} else if (isStaff) {
				user = new StaffRecord();
			} else {
				user = new LoggedInUser();
			}

			user.setUserName(rs.getString("userName"));
			user.setFirstName(rs.getString("LastName"));
			user.setLastName(rs.getString("firstName"));

			user.setIsStaff(isStaff);
			user.setIsStudent(isStudent);

			if (isStaff) {
				StaffRecord staff = (StaffRecord) user;
				staff.setDateEmployed(rs.getDate("DateEmployed"));
				staff.setDepartment(rs.getString("Postion"));
				staff.setDepartment(rs.getString("Department"));

				staff.setIdNumber(user.getUserName());

			} else if (isStudent) {
				StudentRecord student = (StudentRecord) user;
				student.setDob(rs.getDate("Dob"));
				student.setProgramCode(rs.getString("ProgramCode"));
				student.setContactNumber(rs.getString("contactNumber"));
				student.setAddress(rs.getString("Address"));
				student.setIdNumber(user.getUserName());

			}

		}
		rs.close();
		pstmt.close();
		conn.close();

		return user;
	}

	/*
	 * public static Statement getStatement(Connection conn) throws
	 * ClassNotFoundException, SQLException {
	 * 
	 * 
	 * }
	 */
	public static boolean addStudent(StudentRecord record, String password)
			throws Exception {

		Connection conn = getDatabaseConnection();

		String SQL = "{call AddStudentWithLogin(?,?,?,?,?,?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, record.getIdNumber());

		pstmt.setString(2, password);
		pstmt.setString(3, record.getFname());
		pstmt.setString(4, record.getLname());
		pstmt.setString(5, record.getAddress());
		pstmt.setString(6, record.getContactNumber());
		pstmt.setString(7, record.getProgramCode());
		boolean result = pstmt.execute();

		pstmt.close();
		conn.close();
		return result;
	}

	public static boolean addStaff(StaffRecord record, String password)
			throws Exception {

		Connection conn = getDatabaseConnection();

		String SQL = "{call AddStaffWithLogin(?,?,?,?,?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, record.getUserName());

		pstmt.setString(2, password);
		pstmt.setString(3, record.getFname());
		pstmt.setString(4, record.getLname());
		pstmt.setString(5, record.getFaculty());
		pstmt.setString(6, record.getDepartment());

		boolean result = pstmt.execute();

		pstmt.close();
		conn.close();
		return result;

	}

	public static ArrayList<ProgrammeRecord> getProgrammes(String Program)
			throws Exception {
		ArrayList<ProgrammeRecord> records = new ArrayList<ProgrammeRecord>();

		Connection conn = getDatabaseConnection();

		String SQL = "{call usp_ProgrammeRecordSelect(?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		if (Program == "") {
			pstmt.setString(1, null);
		} else {
			pstmt.setString(1, Program);
		}

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			ProgrammeRecord pr = new ProgrammeRecord();
			pr.setCode(res.getString("Code"));
			pr.setName(res.getString("Name"));
			pr.setAward(res.getString("Award"));
			pr.setAccreditation(res.getString("Accreditation"));
			pr.setMaximum_courses(res.getString("Maximum_courses"));

			records.add(pr);

		}
		res.close();
		pstmt.close();
		conn.close();

		return records;
	}

	public static ArrayList<CourseRecord> getCoursesByProgram(String Program)
			throws Exception {
		ArrayList<CourseRecord> records = new ArrayList<CourseRecord>();

		Connection conn = getDatabaseConnection();

		String SQL = "{call getCourseByProgram(?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		if (Program == "") {
			pstmt.setString(1, null);
		} else {
			pstmt.setString(1, Program);
		}

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			CourseRecord pr = new CourseRecord();
			pr.setCode(res.getString("Code"));
			pr.setName(res.getString("Name"));
			pr.setDescription(res.getString("Description"));
			pr.setDuration(res.getInt("Duration"));
			pr.setCredits(res.getString("Credits"));
			pr.setProgramCode(res.getString("programCode"));

			records.add(pr);

		}

		res.close();
		pstmt.close();
		conn.close();

		return records;
	}

	public static ArrayList<Question> getQuestions(String courseCode)
			throws Exception {

		ArrayList<Question> questions = new ArrayList<Question>();

		Connection conn = getDatabaseConnection();

		String SQL = "{call getRandomTest(?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		if (courseCode == "") {
			pstmt.setString(1, null);
		} else {
			pstmt.setString(1, courseCode);
		}

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			Question pr = new Question();
			pr.setAnswer(res.getString("answer"));
			pr.setCourseCode(res.getString("CourseCode"));
			pr.setQuestionid(res.getInt("questionid"));

			pr.setQuestion(res.getString("question"));

			pr.setOptionA(res.getString("OptionA"));
			pr.setOptionB(res.getString("OptionB"));
			pr.setOptionC(res.getString("OptionC"));
			pr.setOptionD(res.getString("OptionD"));

			questions.add(pr);

		}

		res.close();
		pstmt.close();
		conn.close();

		return questions;

	}

	public static boolean setTest(ArrayList<Question> questions,
			String StaffID, Date date, String CourseCode) throws Exception {

		boolean result = false;
		Connection conn = getDatabaseConnection();
		int testID = -1;
		String SQL = "{call usp_TestRecordInsert(?,?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		pstmt.setDate(1, date);

		pstmt.setString(2, StaffID);
		pstmt.setString(3, CourseCode);

		ResultSet rs = pstmt.executeQuery();

		result = rs.next();
		if (result) {
			testID = rs.getInt("testid");
		}
		rs.close();
		pstmt.close();

		if (!result) {
			conn.close();
			return false;// test not added

		}

		SQL = "{call usp_test_questionInsert(?,?)}";

		for (Question q : questions) {

			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, q.getQuestionid());
			pstmt.setInt(2, testID);

			result = pstmt.execute();
			pstmt.close();
		}

		pstmt.close();
		conn.close();

		return result;

	}

	public static ArrayList<TestRecord> getNewTest(String studentidNumber,
			String code) throws Exception {

		ArrayList<TestRecord> questions = new ArrayList<TestRecord>();

		Connection conn = getDatabaseConnection();

		String SQL = "{call getNewTest(?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		pstmt.setString(1, code);
		pstmt.setString(2, studentidNumber);

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			TestRecord pr = new TestRecord();
			pr.setTestid(res.getInt("testid"));
			pr.setCourseCode(res.getString("CourseCode"));
			pr.setTestDate(res.getString("testDate"));
			pr.setStaffID(res.getString("staffID"));

			questions.add(pr);

		}
		res.close();
		pstmt.close();
		conn.close();
		return questions;

	}

	public static ArrayList<Question> getTestQuestions(int testID)
			throws Exception {

		ArrayList<Question> questions = new ArrayList<Question>();

		Connection conn = getDatabaseConnection();

		String SQL = "{call getTestQuestions(?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		pstmt.setInt(1, testID);

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			Question pr = new Question();
			pr.setAnswer(res.getString("answer"));
			pr.setCourseCode(res.getString("CourseCode"));
			pr.setQuestionid(res.getInt("questionid"));

			pr.setQuestion(res.getString("question"));

			pr.setOptionA(res.getString("OptionA"));
			pr.setOptionB(res.getString("OptionB"));
			pr.setOptionC(res.getString("OptionC"));
			pr.setOptionD(res.getString("OptionD"));

			questions.add(pr);

		}
		res.close();
		pstmt.close();
		conn.close();

		return questions;

	}

	static boolean AddTestResult(TestResult record, String idNumber, int testid)
			throws Exception {

		Connection conn = getDatabaseConnection();

		String SQL = "{call usp_TestResultInsert(?,?,?,?)}";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, idNumber);

		pstmt.setInt(2, testid);
		pstmt.setFloat(3, record.getScore());
		pstmt.setString(4, record.getRemarks());

		boolean result = pstmt.execute();

		pstmt.close();
		conn.close();
		return result;

	}

	public static ArrayList<extendedTestResult> LoadTestResults(
			LoggedInUser user, String CourseCode, Object testid)
			throws Exception {

		ArrayList<extendedTestResult> records = new ArrayList<extendedTestResult>();

		Connection conn = getDatabaseConnection();

		String SQL = (user.isIsStaff() ? "{call getTestResultByStaffCourse(?,?,?)}"
				: "{call getTestResultByStudentCourse(?,?,?)}");
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		String ID = user.getUserName();
		if (ID == "") {
			pstmt.setString(1, null);
		} else {
			pstmt.setString(1, ID);
		}
		pstmt.setString(2, CourseCode);

		pstmt.setObject(3, testid);

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			extendedTestResult pr = new extendedTestResult();
			pr.setCourseName(res.getString("Name"));
			pr.setTestDate(res.getDate("testDate"));
			pr.setScore(res.getFloat("Score"));
			pr.setFname(res.getString("firstName"));
			pr.setLname(res.getString("LastName"));
			pr.setStudentID(res.getString("StudentID"));
			pr.setStaffID(res.getString("staffID"));
			pr.setRemarks(res.getString("Remarks"));

			pr.setTestID(res.getInt("testid"));

			records.add(pr);

		}

		res.close();
		pstmt.close();
		conn.close();

		return records;

	}

	public static ArrayList<CourseRecord> LoadTestCourses(LoggedInUser user,
			String CourseCode) throws Exception {

		ArrayList<CourseRecord> records = new ArrayList<CourseRecord>();

		Connection conn = getDatabaseConnection();

		String SQL = (user.isIsStaff() ? "{call getTestCoursesByStaff(?)}"
				: "{call getTestCoursesByStudent(?)}");
		PreparedStatement pstmt = conn.prepareStatement(SQL);

		String ID = user.getUserName();
		if (ID == "") {
			pstmt.setString(1, null);
		} else {
			pstmt.setString(1, ID);
		}

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {
			CourseRecord pr = new CourseRecord();
			pr.setCode(res.getString("Code"));
			pr.setName(res.getString("Name"));
			pr.setDescription(res.getString("Description"));
			pr.setDuration(res.getInt("Duration"));
			pr.setCredits(res.getString("Credits"));
			pr.setProgramCode(res.getString("programCode"));

			records.add(pr);

		}

		res.close();
		pstmt.close();
		conn.close();

		return records;
	}
}
