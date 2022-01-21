package hai.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import hai.library.Question;
import com.cmp3005.db.DatabaseManager;

public class Questiondb {

	// Question related database queries

	public static List<Question> getAllQuestions() {

		String query = "SELECT * FROM questions";
		System.out.println(query);
		
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		
		List<Question> questions = populateQuestionsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		return questions;
	}

	public static Question getQuestionById(int questionId) {

		String query = "SELECT * FROM QuestionBank WHERE QuestionId ='" + questionId + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Question> questions = populateQuestionsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		if (questions.size() > 0) {
			return questions.get(0);
		} else {
			return null;
		}
	}

	public static boolean addQuestion(Question question) {

		String query = "INSERT INTO questions (test_id,question,Option_A,Option_B,Option_C,Option_D,answer) "
				+ "VALUES('"
				+ question.getTestId()
				+ "', '"
				+ question.getQuestion()
				+ "','"
				+ question.getOption_A()
				+ "','"
				+ question.getOption_B()
				+ "','"
				+ question.getOption_C()
				+ "','"
				+ question.getOption_D()
				+ "','"
				+ question.getAnswer()
				+ "')";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	public static boolean deleteQuestion(int id) {
		String query = "DELETE FROM questions WHERE id='" + id + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		boolean result = DatabaseManager.executeDeleteQuery(query);
		DatabaseManager.closeDatabaseConnection();
		return result;
	}

	public static boolean updateQuestion(Question question) {
		String query = "UPDATE questions SET test_id='" + question.getTestId()
				+ "', question='" + question.getQuestion() + "', Option_A='"
				+ question.getOption_A() + "', Option_B='"
				+ question.getOption_B() + "', Option_C='"
				+ question.getOption_C() + "', Option_D='"
				+ question.getOption_D() + "', answer='" + question.getAnswer()
				+ "' WHERE id='" + question.getQuestionId() + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("HAI.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	private static List<Question> populateQuestionsFromResultSet(ResultSet rs) {
		List<Question> questions = new ArrayList<Question>();
		if (rs != null) {

			try {
				while (rs.next()) {
					Question question = new Question();

					int id = rs.getInt(0);
					int testId = rs.getInt(1);
					String actualQuestion = rs.getString(2);
					String choiceA = rs.getString(3);
					String choiceB = rs.getString(4);
					String choiceC = rs.getString(5);
					String choiceD = rs.getString(6);
					String answer = rs.getString(7);

					question.setQuestionId(id);
					question.setTestId(testId);
					question.setQuestion(actualQuestion);
					question.setOption_A(choiceA);
					question.setOption_B(choiceB);
					question.setOption_C(choiceC);
					question.setOption_D(choiceD);
					question.setAnswer(answer);
					questions.add(question);
				}
			}catch(SQLException ex) 
            {
            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
            }
		}

		return questions;
	}

	// End of Question related database queries

}
