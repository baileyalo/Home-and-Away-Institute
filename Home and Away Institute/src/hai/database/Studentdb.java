package hai.database;

import hai.library.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.cmp3005.db.DatabaseManager;

public class Studentdb {

	// Student related database queries

	public static List<Student> getAllStudents() {

		String query = "SELECT * FROM student";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Student> students = populateStudentsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		return students;
	}

	public static Student getStudentById(int idNumber) {

		String query = "SELECT * FROM student WHERE idNumber ='" + idNumber
				+ "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Student> students = populateStudentsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		if (students.size() > 0) {
			return students.get(0);
		} else {
			return null;
		}
	}

	public static boolean addStudent(Student student) {
		String query = "INSERT INTO student (idNumber,userName, programeCode,firstName,lastName,address, parish, country,dob,contactNumber,password) "
				+ "VALUES('"
				+ student.getIdNumber()
				+ "', '"
				+ student.getUserName()
				+ "', '"
				+ student.getProgrammeCode()
				+ "','"
				+ student.getFirstName()
				+ "','"
				+ student.getLastName()
				+ "','"
				+ student.getAddress()
				+ "','"
				+ student.getParish()
				+ "','"
				+ student.getCountry()
				+ "','"
				+ student.getDob()
				+ "','"
				+ student.getContactNumber()
				+ "','" + student.getPassword() + "')";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	public static boolean deleteStudent(int studentId) {
		String query = "DELETE FROM student WHERE idNumber='" + studentId + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		boolean result = DatabaseManager.executeDeleteQuery(query);
		DatabaseManager.closeDatabaseConnection();
		return result;
	}

	public static boolean updateStudent(Student student) {
		String query = "UPDATE student SET programmeCode='"
				+ student.getProgrammeCode() + "',firstName='"
				+ student.getFirstName() + "'," + " lastName='"
				+ student.getLastName() + "', address='" + student.getAddress()
				+ "', parish='" + student.getParish() + "'," + " country='"
				+ student.getCountry() + "',dob='" + student.getDob()
				+ "',contactNumber='" + student.getContactNumber() + "',"
				+ "password='" + student.getPassword() + "' WHERE idNumber='"
				+ student.getIdNumber() + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	private static List<Student> populateStudentsFromResultSet(ResultSet rs) {
		List<Student> students = new ArrayList<Student>();
		if (rs != null) {

			try {
				while (rs.next()) {
					Student student = new Student();

					int idNumber = rs.getInt(0);
					String userName = rs.getString(1);
					String programmeCode = rs.getString(2);
					String firstName = rs.getString(3);
					String lastName = rs.getString(4);

					String address = rs.getString(5);
					String parish = rs.getString(6);
					String country = rs.getString(7);
					Date dob = rs.getDate(8);
					String contactNumber = rs.getString(9);
					String password = rs.getString(10);

					student.setIdNumber(idNumber);
					student.setUserName(userName);
					student.setProgrammeCode(programmeCode);
					student.setFirstName(firstName);
					student.setLastName(lastName);
					student.setAddress(address);
					student.setParish(parish);
					student.setCountry(country);

					student.setDob(dob);
					student.setContactNumber(contactNumber);
					student.setPassword(password);

					students.add(student);
				}
			 }catch(SQLException ex) 
	            {
	            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
	            }
	            catch(Exception ex){
	                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
	            }
		}

		return students;
	}

	// End of Student related database queries

}
