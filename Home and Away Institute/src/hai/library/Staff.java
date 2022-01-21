package hai.library;

import java.util.Date;

public class Staff extends User {
	
	private String department;
	private String position;
	private Date dateofEmp;
	private String password;

	public Staff() {
		super();
		setDepartment("");
		setPosition("");
		setDateofEmp(new Date());
	}

	public Staff(int idNumber, String userName, String firstName, String lastName, String department,
			String position, Date dateofEmp) {
		super(idNumber, userName, firstName, lastName);
		setDepartment(department);
		setPosition(position);
		setDateofEmp(dateofEmp);
	}

	public Staff(Staff obj) {
		setIdNumber(obj.getIdNumber());
		setFirstName(obj.getFirstName());
		setLastName(obj.getLastName());
		setDepartment(obj.getDepartment());
		setPosition(obj.getPosition());
		setDateofEmp(obj.getDateofEmp());
	}

	

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the date of Employment
	 */
	public Date getDateofEmp() {
		return dateofEmp;
	}

	/**
	 * @param doe
	 *            the date of Employment to set
	 */
	public void setDateofEmp(Date dateofEmp) {
		this.dateofEmp = dateofEmp;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	

}
