package homeandawayinstituteprototype;

public class TestRecord {

   
    public String toString() {
        return "testid=" + testid + ", testDate=" + testDate + ", staffID=" + staffID ;
    }

    private int testid;
    private String testDate;
    private String staffID; 
    private String CourseCode;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
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
    
   
}
