package hai.customgui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextPane;

import hai.library.Course;
import hai.library.Programme;
import hai.library.Student;
import hai.library.Test;
import hai.database.Coursedb;
import hai.database.Programdb;
import hai.database.dbTest;

public class AwardDetail extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public AwardDetail(Student student) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAwardDetail = new JLabel("   AWARD DETAIL");
		lblAwardDetail.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAwardDetail.setBounds(135, 11, 228, 23);
		contentPane.add(lblAwardDetail);
		
		JLabel lblStudent = new JLabel("Student:");
		lblStudent.setBounds(10, 47, 76, 14);
		contentPane.add(lblStudent);
		
		JLabel lblFname = new JLabel(student.getFirstName());
		lblFname.setBounds(96, 45, 77, 14);
		contentPane.add(lblFname);
		
		JLabel lblLname = new JLabel(student.getLastName());
		lblLname.setBounds(165, 45, 46, 14);
		contentPane.add(lblLname);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourse.setBounds(10, 104, 46, 14);
		contentPane.add(lblCourse);
		
		JLabel lblGrade = new JLabel("Score");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrade.setBounds(285, 104, 46, 14);
		contentPane.add(lblGrade);
		
		JLabel lblStatus = new JLabel("Grade");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus.setBounds(370, 104, 46, 14);
		contentPane.add(lblStatus);
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.setBounds(127, 389, 165, 23);
		contentPane.add(btnBackToMenu);
		
		JLabel lblAwardAchieved = new JLabel("Award Achieved:");
		lblAwardAchieved.setBounds(10, 361, 111, 14);
		contentPane.add(lblAwardAchieved);
		
		JLabel lblAwardGiven = new JLabel("");
		lblAwardGiven.setBounds(115, 361, 200, 14);
		contentPane.add(lblAwardGiven);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 129, 414, 228);
		contentPane.add(textPane);
		
		JLabel lblIdNumber = new JLabel("ID Number:");
		lblIdNumber.setBounds(10, 63, 87, 14);
		contentPane.add(lblIdNumber);
		
		JLabel lblId = new JLabel(String.valueOf(student.getIdNumber()));
		lblId.setBounds(96, 63, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblProgramme = new JLabel("Programme:");
		lblProgramme.setBounds(10, 79, 87, 14);
		contentPane.add(lblProgramme);
		
		JLabel lblProgrammeL = new JLabel(student.getProgrammeCode());
		lblProgrammeL.setBounds(96, 79, 46, 14);
		contentPane.add(lblProgrammeL);
		
		Programme programme = Programdb.getProgrammeByCode(student.getProgrammeCode());
		lblAwardGiven.setText(programme.getAward());
		
		List<Course> courses = Coursedb.getCoursesByProgrammeCode(student.getProgrammeCode());
		List<Test> Tests = new ArrayList<Test>();
		
		for(Course course : courses)
		{
			Test Test = dbTest.getTest(student.getIdNumber(), course.getCode());
			System.out.println("Student Test Retreived: "+Test);
			Tests.add(Test);
		}
		
		for (Course course : courses)
		{
			String courseName = course.getName();
			String score = "0%";
			String grade = "F";
			
			for (Test Test : Tests)
			{
				if(Test!=null){
					if(Test.getTest().getCourseCode().equalsIgnoreCase(course.getCode()))
					{
						score = String.valueOf(Test.getScore())+"%";
						grade = getGrade(Test.getScore());
					}
				}
			}
			
			String displayRow = String.format("%s\t\t\t%s\t%s", courseName,score,grade);
			
			textPane.setText(textPane.getText()+"\n"+displayRow);
		
		}
		
		
		ActionListener backListener = new ActionListener(){

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {	

				dispose();
				StaffMenu staffMenu = new StaffMenu();
				staffMenu.setVisible(true);			

			};
		};


		btnBackToMenu.addActionListener(backListener);
	}
	
	
	private String getGrade(int score){
		
		String grade = "D-";
		
		if(score>94)
			grade="A+";
		else if (score>89)
			grade = "A";
		else if (score>82)
			grade="A-";
		else if (score>75)
			grade="B+";
		else if (score >70)
			grade = "B";
		else if (score>67)
			grade = "B-";
		else if (score>60)
			grade = "C+";
		else if (score > 55)
			grade = "C";
		else if (score >49)		
			grade = "C-";
		else
			grade = "D";
		
		return grade;
			
		}
	}


