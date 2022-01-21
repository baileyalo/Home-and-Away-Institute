package homeandawayinstituteprototype;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 * 
 * @author
 */

public class StaffRecord extends LoggedInUser {

	private String IdNumber;

	private String Position;
	private String Department;
	private Date DateEmployed;

	@Override
	public String toString() {
		return "Staff{" + "idNumber=" + IdNumber + ", position="
				+ Position + ", Department=" + Department + ", dateEmployed="
				+ DateEmployed + '}';
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getDateEmployed() {
		return DateEmployed;
	}

	public void setDateEmployed(Date dateEmployed) {
		DateEmployed = dateEmployed;
	}

}
