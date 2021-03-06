package hai.records;

import java.util.Date;


public class StudentRecord extends LoggedInUser {

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String ProgramCode) {
        this.ProgramCode = ProgramCode;
    }
  private String IdNumber;
  
  private String Address;
  private String ProgramCode;
  private Date  DateEnrolled;
  private String ContactNumber ; 

    @Override
    public String toString() {
        return "StudentRecord{" + "IdNumber=" + IdNumber + ", Address=" + Address + ", DateEnrolled=" + DateEnrolled + ", ContactNumber=" + ContactNumber + '}';
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public Date getDateEnrolled() {
        return DateEnrolled;
    }

    public void setDateEnrolled(Date DateEnrolled) {
        this.DateEnrolled = DateEnrolled;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

  
  
}