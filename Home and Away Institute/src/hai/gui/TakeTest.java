package hai.gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class TakeTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TakeTest frame = new TakeTest();
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
	public TakeTest() {
		setTitle("Home & Away Institute");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnrolledCourses = new JLabel("Please select the programme you belong to");
		lblEnrolledCourses.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblEnrolledCourses.setBounds(36, 11, 385, 26);
		contentPane.add(lblEnrolledCourses);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMPUTER MANAGEMENT", "Computer System Hardware", "Database Management", "Maths 2", "Object Orriented Programming", "Software Engineering", "System Software"}));
		comboBox.setBounds(36, 48, 277, 20);
		contentPane.add(comboBox);
		
		JButton btnBeginTest = new JButton("Begin Test");
		btnBeginTest.setBounds(66, 232, 122, 23);
		contentPane.add(btnBeginTest);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(260, 232, 89, 23);
		contentPane.add(btnExit);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"COMPUTER SERVICE MANAGEMENT", "Basics of Computer Systems", "English 2", "Maths 2", "Office Administration"}));
		comboBox_1.setBounds(36, 81, 277, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"TECHNOLOGY ESSENTIALS", "Operating Systems", "Basics of computer Systems", "Computer Systems", "System Software"}));
		comboBox_2.setBounds(36, 114, 277, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"BUSINESS COMPUTING", "Operating Systems", "Computer Systems Hardware", "Database Management", "English 2", "Maths 2", "Human Resource Management System", "Maths 2"}));
		comboBox_3.setBounds(36, 152, 277, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"BUSINESS MANAGEMENT", "Maths 2", "English 2", "Data Communication", "Operating Systems", "Basics of Computer Systems", "Human resource Management Systems"}));
		comboBox_4.setBounds(36, 182, 277, 20);
		contentPane.add(comboBox_4);
	}
}
