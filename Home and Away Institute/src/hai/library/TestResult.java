package hai.library;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author Team5
 */
public class TestResult {

    @Override
    public String toString() {
        return  testDate.toString();
    }
  private Date testDate;
  

 
  private String courseName;
  private float Score;
  private String Remarks;
  
    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public float getScore() {
        return Score;
    }

    public void setScore(float Score) {
        this.Score = Score;
    }

  

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    
 
  
}
