package hai.database;

import hai.library.Report;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.cmp3005.db.DatabaseManager;

public class Reportdb {

		// report related database queries
		private static String dbName = "C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\hai.accdb";

		public static List<Report> getAllResult() {

			String query = "SELECT * FROM report";
			System.out.println(query);
			DatabaseManager.connectToDatabase(dbName);
			ResultSet rs = DatabaseManager.executeSelectQuery(query);
			List<Report> report = populateReportsFromResultSet(rs);
			DatabaseManager.closeDatabaseConnection();
			return report;
		}

		public static Report getReportByCode(String code) {

			String query = "SELECT * FROM report WHERE code ='" + code + "'";
			System.out.println(query);
			DatabaseManager.connectToDatabase(dbName);
			ResultSet rs = DatabaseManager.executeSelectQuery(query);
			List<Report> reports = populateReportsFromResultSet(rs);
			DatabaseManager.closeDatabaseConnection();
			if (reports.size() > 0) {
				return reports.get(0);
			} else {
				return null;
			}
		}

		public static boolean addReport(Report report) {

			String query = "INSERT INTO result (idnumber, username, firstname, lastname,code,coursename,date,score, remarks) VALUES('"
					+ report.getIdNumber()
					+ "', '"
					+ report.getUserName()
					+ "','"
					+ report.getFirstName()
					+ "','"
					+ report.getLastName()
					+ "','"
					+ report.getCode()
					+ "','"
					+ report.getCourseName()
					+ "','"
					+ report.getDate()
					+ "','"
					+ report.getFinalScore()
					+ "','"
					+ report.getRemarks()
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

		
		private static List<Report> populateReportsFromResultSet(ResultSet rs) {
			List<Report> reports = new ArrayList<Report>();
			if (rs != null) {

				try {
					while (rs.next()) {
						Report report = new Report();

						int idNumber = rs.getInt(0);
						String userName = rs.getString(1);
						String firstName = rs.getString(2);
						String lastName = rs.getString(3);
						Date date = rs.getDate(4);
						String code = rs.getString(5);
						String courseName = rs.getString(6);
	
						int finalScore = rs.getInt(7);
						String remarks = rs.getString(8);
						

						report.setIdNumber(idNumber);
						report.setUserName(userName);
						report.setFirstName(firstName);
						report.setLastName(lastName);
						report.setCode(code);
						report.setDate(date);
						report.setCourseName(courseName);
						report.setFinalScore(finalScore);
						report.setRemarks(remarks);

						reports.add(report);
					}
				}catch(SQLException ex) 
	            {
	            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
	            }
	            catch(Exception ex){
	                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
	            }
			}

			return reports;
		}

		// End of report related database queries

	}
