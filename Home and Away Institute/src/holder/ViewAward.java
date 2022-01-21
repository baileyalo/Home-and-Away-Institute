package holder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import hai.library.Course;
import hai.library.Student;
import hai.library.Test;
import hai.customgui.AwardDetail;
import hai.customgui.StaffMenu;
import hai.database.Coursedb;
import hai.database.Studentdb;
import hai.database.dbTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ViewAward extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStudentId;

	public ViewAward(){


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAwardMenu = new JLabel("Award Menu");
		lblAwardMenu.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAwardMenu.setBounds(163, 11, 147, 26);
		contentPane.add(lblAwardMenu);

		JLabel lblSelectStudent = new JLabel("Student ID: ");
		lblSelectStudent.setBounds(59, 65, 93, 26);
		contentPane.add(lblSelectStudent);

		final JButton btnViewAward = new JButton("View Award");
		btnViewAward.setBounds(101, 209, 110, 23);
		contentPane.add(btnViewAward);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(265, 209, 89, 23);
		contentPane.add(btnBack);

		txtStudentId = new JTextField();
		txtStudentId.setBounds(163, 68, 154, 20);
		contentPane.add(txtStudentId);
		txtStudentId.setColumns(10);

		final JLabel lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setBounds(78, 130, 300, 14);
		contentPane.add(lblError);



		ActionListener viewAwardListener = new ActionListener(){

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {	
				try
				{
					int idNumber = Integer.parseInt(txtIdNumber.getInt());	//checkfile	

					Student student = Studentdb.getStudentById(idNumber);

					if(student!=null)
					{
						List<Course> courses = Coursedb.getCoursesByProgrammeCode(student.getProgrammeCode());
						List<Test> tests = new ArrayList<Test>();
						
						for(Course course : courses)
						{
							Test test = dbTest.getTest(student.getIdNumber(), course.getCode());
							System.out.println("Student Test Retreived: "+test);
							tests.add(test);
						}
						
						boolean hasFailedCourses = false;
						boolean hasIncompleteTests = false;
						
						for(Test test : tests)
						{
							if(test!=null){
								if(test.getScore()<50)
								{
									hasFailedCourses = true;									
								}
							}
							else
							{
								hasIncompleteTests = true;
							}
						}
						
						if(hasFailedCourses)
						{
							lblError.setText("Student has failed courses and cannot get award");
						}
						if(hasIncompleteTests)
						{
							lblError.setText("\nStudent has not completed all courses in programme");
						}
						
						//if(! hasFailedCourses && hasIncompleteTests)
						//{
							dispose();
							AwardDetail awardDetail = new AwardDetail(student);
							awardDetail.setVisible(true);
						//}
						
						
						
					}
					else
					{				
						lblError.setText("No Student found matching ID "+txtStudentId.getText());
						
					}

				}
				catch(NumberFormatException ex)
				{
					lblError.setText("Only Valid Numbers are acceptible as Student IDs");
					
				}


			};
		};

		ActionListener backListener = new ActionListener(){

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {	

				dispose();
				StaffMenu staffMenu = new StaffMenu();
				staffMenu.setVisible(true);			

			};
		};


		btnBack.addActionListener(backListener);
		btnViewAward.addActionListener(viewAwardListener);
	}

}
