package homeandawayinstituteprototype;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Date;

/**
 *
 * @author Team5
 */
public class StudentRecord extends LoggedInUser {

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String ProgramCode) {
        this.ProgramCode = ProgramCode;
    }
  private String IdNumber;
  
  private String Address;
  private String Parish;
  private String Country;
  private String ProgramCode;
  private Date  DateofBirth;
  private String ContactNumber ; 

    @Override
    public String toString() {
        return "StudentRecord{" + "IdNumber=" + getIdNumber() + ", Address=" + getAddress() + ", DateofBirth=" + getDateofBirth() + ", ContactNumber=" + getContactNumber() + '}';
    }

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getParish() {
		return Parish;
	}

	public void setParish(String parish) {
		Parish = parish;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Date getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

   
  
}
