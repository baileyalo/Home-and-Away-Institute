ackage hai.database;

import hai.library.Report;
import hai.records.Question;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cmp3005.db.DatabaseManager;


public class test {
	
	private static String dbName = "C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\hai.accdb";

	
		DatabaseManager.connectToDatabase(dbName);
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		
		DatabaseManager.closeDatabaseConnection();
	
	public static boolean setTest(ArrayList<Question> questions, String StaffID, Date date, String CourseCode) throws Exception {

        boolean result = false;
        Connection conn = getConnection();
        int testID = -1;
        String SQL = "{call dbo.usp_TestRecordInsert(?,?,?)}";
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
            return false;//test not added

        }

        SQL = "{call dbo.usp_test_questionInsert(?,?)}";

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
