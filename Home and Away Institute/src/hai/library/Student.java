package hai.library;
import java.util.Date;

public class Student extends User {
	private String programmeCode;

	private String Address;
	private String Parish;
	private String country;
	private Date dob;
	private String contactNumber;
	private String password;
	
	public Student() {
		super();
		setProgrammeCode("");
		setAddress("");
		setParish("");
		setCountry("");
		setDob(new Date());
		setContactNumber("");
		setPassword("");
	}

	public Student(int id,  String userName, String firstName, String lastName, String programmeCode, String address,
			String parish, String country, Date dob, String contactNumber, String password) {
		super(id, userName,firstName, lastName);
		setProgrammeCode(programmeCode);
		setAddress(address);
		setParish(parish);
		setCountry(country);
		setDob(dob);
		setContactNumber(contactNumber);
		setPassword(password);
	}

	public Student(Student obj) {
		setIdNumber(obj.getIdNumber());
		setFirstName(obj.getFirstName());
		setLastName(obj.getLastName());
		setProgrammeCode(obj.getProgrammeCode());
		setAddress(obj.getAddress());
		setParish(obj.getParish());
		setDob(obj.getDob());
		setContactNumber(obj.getContactNumber());
		setPassword(obj.getPassword());
	}

	@Override
	public String toString() {
		String str;
		str = super.toString() + "\n";
		str+= "Programme         :" + getProgrammeCode()+"\n";
		str += "Address          :" + getAddress() + "\n";
		str += "Parish           :" + getParish() + "\n";
		str += "Date of Birth    :" + getDob() + "\n";
		str += "Contact Number   :" + getContactNumber() + "\n";
		str+= "Password          :" + getPassword() + "\n";
		return str;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the parish
	 */
	public String getParish() {
		return Parish;
	}

	/**
	 * @param parish
	 *            the parish to set
	 */
	public void setParish(String parish) {
		Parish = parish;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	@Override
	public void display() {
		super.display();

		System.out.println("Programme Code:" + getProgrammeCode()+ "\nAddress:" + getAddress() + "\nDate:" + getDob()
				+ "\nContactNumber:" + getContactNumber() + "\nPassword:" + getPassword());

	}

	/**
	 * @return the programmeCode
	 */
	public String getProgrammeCode() {
		return programmeCode;
	}

	/**
	 * @param programmeCode the programmeCode to set
	 */
	public void setProgrammeCode(String programmeCode) {
		this.programmeCode = programmeCode;
	}
}
