package hai.driver;

import hai.customgui.AddCourses;
import hai.database.Programdb;
import hai.library.Programme;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Record {

	public static void main(String args[]) {
		/*
		 * PhoneNumber PhoneNumber = new PhoneNumber ();
		 * System.out.println(PhoneNumber); Programme programme = new Programme
		 * (); System.out.println(programme); Course course= new Course ();
		 * System.out.println(course);
		 */
		JFrame t = new JFrame();
		
		AddCourses co = new AddCourses();
		co.setVisible(true);
		Programme program = new Programme ("bed ca","pro name",4,"cert","yes");
		
		Programdb.addProgramme(program);// certificate = new Programdb();
		//certificate.addProgramme(program);
		
		t.getContentPane().add(co,BorderLayout.CENTER);
		t.setSize(300, 300);
		t.setVisible(true);
/*
		Programme programme = new Programme();
		System.out.println(programme.toString());
		Staff staff = new Staff();
		System.out.println(staff);
		TestReport testReport = new TestReport();
		System.out.println(testReport);*/
	}
}
