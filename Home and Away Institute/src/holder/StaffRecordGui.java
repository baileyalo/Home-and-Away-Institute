package holder;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StaffRecordGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffRecordGui frame = new StaffRecordGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StaffRecordGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCreateStudent = new JButton("Create Student Record");
		btnCreateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCreateStudent.setBounds(50, 93, 167, 23);
		contentPane.add(btnCreateStudent);
		
		JButton btnDeleteStudent = new JButton("Delete Student Record");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeleteStudent.setBounds(50, 141, 167, 23);
		contentPane.add(btnDeleteStudent);
		
		JButton btnStudentReport = new JButton("Student Report");
		btnStudentReport.setBounds(240, 93, 123, 23);
		contentPane.add(btnStudentReport);
		
		JButton btnStudentAwards = new JButton("Student Awards");
		btnStudentAwards.setBounds(240, 141, 123, 23);
		contentPane.add(btnStudentAwards);
		
		JButton btnLogOff = new JButton("Log Off");
		btnLogOff.setBounds(50, 220, 91, 23);
		contentPane.add(btnLogOff);
	}
}
