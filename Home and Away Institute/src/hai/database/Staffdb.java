package hai.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import hai.library.Staff;

import com.cmp3005.db.DatabaseManager;

public class Staffdb {

	// Staff related database queries

	public static List<Staff> getAllStaff() {

		String query = "SELECT * FROM staff";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Staff> staffs = populateStaffsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		return staffs;
	}

	public static Staff getStaffByIDd(int staffId) {

		String query = "SELECT * FROM staff WHERE idNumber ='" + staffId + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		ResultSet rs = DatabaseManager.executeSelectQuery(query);
		List<Staff> staffs = populateStaffsFromResultSet(rs);
		DatabaseManager.closeDatabaseConnection();
		if (staffs.size() > 0) {
			return staffs.get(0);
		} else {
			return null;
		}
	}

	public static boolean addStaff(Staff staff) {

		String query = "INSERT INTO staff (idNumber,userName, firstName,lastName,department,position,dateofEmp,password) "
				+ "VALUES('"
				+ staff.getIdNumber()
				+ "', '"
				+ staff.getUserName()
				+ "', '"
				+ staff.getFirstName()
				+ "','"
				+ staff.getLastName()
				+ "','"
				+ staff.getDepartment()
				+ "','"
				+ staff.getPosition()
				+ "','"
				+ staff.getDateofEmp()
				+ "','"
				+ staff.getPassword() + "')";
		System.out.println(query);
		DatabaseManager.connectToDatabase("HAI.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	public static boolean deleteStaff(int staffId) {
		String query = "DELETE FROM staff WHERE idNumber='" + staffId + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("HAI.accdb");
		boolean result = DatabaseManager.executeDeleteQuery(query);
		DatabaseManager.closeDatabaseConnection();
		return result;
	}

	public static boolean updateStaff(Staff staff) {
		String query = "UPDATE staff SET userName='" + staff.getUserName()
				+ "',firstName='" + staff.getFirstName() + "', lastName='"
				+ staff.getLastName() + "', department='"
				+ staff.getDepartment() + "', position='" + staff.getPosition()
				+ "', dateEmployed='" + staff.getDateofEmp() + "', password='"
				+ staff.getPassword() + "' WHERE idNumber='"
				+ staff.getIdNumber() + "'";
		System.out.println(query);
		DatabaseManager.connectToDatabase("hai.accdb");
		int rowsAffected = DatabaseManager.executeInsertQuery(query);
		DatabaseManager.closeDatabaseConnection();
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	private static List<Staff> populateStaffsFromResultSet(ResultSet rs) {
		List<Staff> staffs = new ArrayList<Staff>();
		if (rs != null) {

			try {
				while (rs.next()) {
					Staff staff = new Staff();

					int idNumber = rs.getInt(0);
					String userName = rs.getString(1);
					String firstName = rs.getString(2);
					String lastName = rs.getString(3);
					String department = rs.getString(4);
					String position = rs.getString(5);
					Date dateofEmp = rs.getDate(6);
					String password = rs.getString(7);

					staff.setIdNumber(idNumber);
					staff.setUserName(userName);
					staff.setFirstName(firstName);
					staff.setLastName(lastName);
					staff.setDateofEmp(dateofEmp);
					staff.setDepartment(department);

					staff.setPosition(position);
					staff.setPassword(password);

					staffs.add(staff);
				}
			}catch(SQLException ex) 
            {
            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
            }
		}

		return staffs;
	}

	// End of Staff related database queries

}
