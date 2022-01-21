package hai.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cmp3005.db.DatabaseManager;
import javax.swing.JOptionPane;


import hai.library.Course;


public class Coursedb {

	// Course related database queries

	public static List<Course> getAllCourses() {

		String query = "SELECT * FROM course";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Course> courses = populateCoursesFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		return courses;

	}

	public static Course getCourseByCode(String courseCode) {

		String query = "SELECT * FROM course WHERE code ='" + courseCode + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Course> courses = populateCoursesFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		if (courses.size() > 0) {
			return courses.get(0);
		} else {
			return null;
		}

	}

	public static boolean addCourse(Course course) {

		String query = "INSERT INTO course (code,name,description,credits,duration) VALUES('"
				+ course.getCode()
				+ "', '"
				+ course.getCourseName()
				+ "','"
				+ course.getDescription()
				+ "','"
				+ course.getCredits()
				+ "','"
				+ course.getDuration() + "')";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;

	}

	public static boolean deleteCourse(String courseCode) {
		String query = "DELETE FROM course WHERE code='" + courseCode + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		boolean result = DatabaseManager.executeDeleteQuery(query);
		DatabaseManager.closeDatabaseConnection();
		return result;
	}

	public static boolean updateCourse(Course course) {
		String query = "UPDATE course SET name='" + course.getCourseName()
				+ "', description='" + course.getDescription() + "', credits='"
				+ course.getCredits() + "', duration='" + course.getDuration()
				+ "' WHERE code='" + course.getCode() + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	private static List<Course> populateCoursesFromResultSet(ResultSet rs) {
		List<Course> courses = new ArrayList<Course>();
		if (rs != null) {

			try {
				while (rs.next()) {
					Course course = new Course();

					String code = rs.getString(0);
					String name = rs.getString(1);
					String description = rs.getString(2);
					int credits = rs.getInt(3);
					String duration = rs.getString(4);

					course.setCode(code);
					course.setCredits(credits);
					course.setDescription(description);
					course.setDuration(duration);
					course.setCourseName(name);
					courses.add(course);
				}
			 }catch(SQLException ex) 
	            {
	            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
	            }
	            catch(Exception ex){
	                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
	            }
		}

		return courses;
	}

	// End of Course related database queries

}
