package homeandawayinstituteprototype;
import homeandawayinstituteprototype.nameCode;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aharvey
 */
public class CourseRecord extends nameCode {

 
 private String code;
 private String name;
 private String description;
 private String credits;
 private String programmeCode;
 private String duration;

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String Credits) {
        this.credits = Credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(int Duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public String toString() {
        return "CourseRecord{" + "Code=" + code + ", Name=" + name + ", Description=" + description + ", Credits=" + credits + ", Duration=" + duration + '}';
    }
    
       public String getProgramCode() {
        return programmeCode;
    }

    public void setProgramCode(String ProgrammeCode) {
        this.programmeCode = programmeCode;
    }
 
}
