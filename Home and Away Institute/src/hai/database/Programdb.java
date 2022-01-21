package hai.database;

import java.sql.*;

import hai.library.Programme;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.cmp3005.db.DatabaseManager;



public class Programdb {

	// Programme related database queries
	private static String dbName = "C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\hai.accdb";

	public static List<Programme> getAllProgrammes() {

		String query = "SELECT * FROM programme";
		System.out.println(query);
		DatabaseManager.connectToDatabase(dbName);
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Programme> programmes = populateProgrammesFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		return programmes;
	}

	public static Programme getProgrammeByCode(String code) {

		String query = "SELECT * FROM programme WHERE code ='" + code + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase(dbName);
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Programme> programmes = populateProgrammesFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		if (programmes.size() > 0) {
			return programmes.get(0);
		} else {
			return null;
		}
	}

	public static boolean addProgramme(Programme programme) {

		String query = "INSERT INTO programme (code,programmename,award,accreditation, MaximumNumberCourses) VALUES('"
				+ programme.getCode()
				+ "', '"
				+ programme.getName()
				+ "','"
				+ programme.getAward()
				+ "','"
				+ programme.getAccreditation()
				+ "','"
				+ programme.getMaximumNumberCourses()
				+ "')";
		System.out.println(query);
		DatabaseManager.connectToDatabase(dbName);
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	public static boolean deleteProgramme(String code) {
		String query = "DELETE FROM programme WHERE code='" + code + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		boolean result = DatabaseManager.executeDeleteQuery(query);
		DatabaseManager.closeDatabaseConnection();
		return result;
	}

	public static boolean updateProgramme(Programme programme) {
		String query = "UPDATE programme SET name='" + programme.getName()
				+ "', award='" + programme.getAward() + "', accredation='"
				+ programme.getAccreditation() + "' WHERE code='"
				+ programme.getCode() + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	private static List<Programme> populateProgrammesFromResultSet(ResultSet rs) {
		List<Programme> programmes = new ArrayList<Programme>();
		if (rs != null) {

			try {
				while (rs.next()) {
					Programme programme = new Programme();

					String code = rs.getString(0);
					String name = rs.getString(1);
					String award = rs.getString(2);
					String accredation = rs.getString(3);

					programme.setAccreditation(accredation);
					programme.setAward(award);
					programme.setCode(code);
					programme.setName(name);

					programmes.add(programme);
				}
			}catch(SQLException ex) 
            {
            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
            }
		}

		return programmes;
	}

	// End of Programme related database queries

}
