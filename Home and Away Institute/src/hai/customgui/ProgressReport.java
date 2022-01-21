package hai.customgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import hai.library.Course;
import hai.library.Student;
import hai.library.Test;
import hai.database.Coursedb;
import hai.database.Studentdb;
import hai.database.dbTest;

public class ProgressReport extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStudentId;

	public ProgressReport(Student student){


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProgressReport = new JLabel("Progress Report");
		lblProgressReport.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblProgressReport.setBounds(140, 11, 170, 26);
		contentPane.add(lblProgressReport);

		JLabel lblSelectStudent = new JLabel("Student ID: ");
		lblSelectStudent.setBounds(59, 65, 93, 26);
		contentPane.add(lblSelectStudent);

		final JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBounds(101, 209, 110, 23);
		contentPane.add(btnViewReport);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(265, 209, 89, 23);
		contentPane.add(btnBack);

		txtStudentId = new JTextField();
		txtStudentId.setBounds(163, 68, 154, 20);
		contentPane.add(txtStudentId);
		txtStudentId.setColumns(10);

		final JLabel lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setBounds(98, 130, 289, 14);
		contentPane.add(lblError);



		ActionListener viewAwardListener = new ActionListener(){

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {	
				try
				{
					int studentId = Integer.parseInt(txtStudentId.getText());		

					Student student = Studentdb.getStudentById(studentId);

					if(student!=null)
					{
						dispose();
						ProgressReport progressReportDetail = new ProgressReport(student);						
						progressReportDetail.setVisible(true);					
						
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
		btnViewReport.addActionListener(viewAwardListener);
	}


}
