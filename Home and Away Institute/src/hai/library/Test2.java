package hai.library;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class Test2 {

    @Override
    public String toString() {
        return "testid=" + testid + ", testDate=" + testDate + ", idNumber=" + idNumber ;
    }

    private int testid;
    private String testDate;
    private String idNumber;
    private String CourseCode;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public int getTestid() {
        return testid;
    }

    public void setTestid(int testid) {
        this.testid = testid;
    }

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
    
   
}
