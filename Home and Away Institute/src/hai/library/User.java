package hai.library;

public class User {
	protected int idNumber;
	protected String userName;
	protected String firstName;
	protected String lastName;

	public User() {
		setIdNumber(1234567);
		setUserName("");
		setFirstName("");
		setLastName("");
	}

	public User(int idNumber, String userName, String firstName, String lastName) {
		setIdNumber(idNumber);
		setUserName(userName);
		setFirstName(firstName);
		setLastName(lastName);
	}

	public User(User obj) {
		setIdNumber(obj.getIdNumber());
		setUserName(obj.getUserName());
		setFirstName(obj.getFirstName());
		setLastName(obj.getLastName());
	}

	public void display() {
		System.out.println("Id Number:" + getIdNumber() + "User Name:"+ getUserName()+ "\n Full Name:"
				+ getFirstName() + "" + getLastName());
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}