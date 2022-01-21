package hai.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hai.library.Course;
import hai.library.Test;


public class dbTest {

	//Test related database queries

	public static List<Test> getAllTests(){

		return null;		
	}
	
	public static List<Test> getCourseTests(String courseCode) throws SQLException{
		String query = String.format("SELECT * FROM QuestionBank WHERE course_code = '%s'",courseCode); //revisit test it
		System.out.println(query);		
		ResultSet rs = haidb.select(query);
		List<Test> tests = populateTestsFromResultSet(rs);		
		return tests;	
	}

	public static Test getTestById(int id){
		String query = String.format("SELECT * FROM test WHERE CourseCode = '%s'",CourseCode);//revisit the dbfile
		System.out.println(query);
		ResultSet rs = hai.select(query);//change the dbconnection file
		List<Test> tests=populateTestsFromResultSet(rs);

		return TestById;
	}
	
	public static int addStudentTest(int studentId, int testId) throws SQLException{

		String query = String.format("INSERT INTO student_test (test_id,student_id) VALUES('%d', '%d')",testId,studentId);
		System.out.println(query);
		
		int rowsAffected = haidb.insert(query);
		
		return rowsAffected;
	}

	public static boolean addTest(Test test){

		return true;
	}

	public static boolean deleteTest(int id)
	{
		return true;
	}

	public static boolean updateTest(Test test)
	{
		return true;
	}
	
	private static List<Test> populateTestsFromResultSet(ResultSet rs)
	{
		List<Test> tests = new ArrayList<Test>();
		if(rs!=null){
			
			try {
				while(rs.next())
				{
					Test test = new Test();
					
					int id = rs.getInt(1);
					String courseCode = rs.getString(2);
					String name = rs.getString(3);
					String description = rs.getString(4);
					
					test.setId(id);
					test.setCourseCode(courseCode);
					test.setName(name);
					test.setDescription(description);
					
					System.out.println("Test retreived: "+test);
					tests.add(test);
				}
			} catch (SQLException e) {
				 System.out.println("SQL Exception occurred: "+e);
			}
		}
		System.out.println("Number of Test records retreived: "+tests.size());
		
		return tests;
	}


	//End of Test related database queries

}
