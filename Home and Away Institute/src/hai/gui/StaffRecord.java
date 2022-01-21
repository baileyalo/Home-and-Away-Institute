import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


package hai.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class StaffRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextPane txtpnFirst;
	private JTextPane txtpnLastName;
	private JTextPane txtpnDepartment;
	private JTextPane txtpnPosition;
	private JTextPane txtpnDateOfEmployment;
	private JTextPane txtpnIdNumber;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnClear;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tudent frame = new student();
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
	public StaffRecord() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\Home and Away Institute\\src\\images\\clear.png"));
		setTitle("HOME & AWAY INSTITUTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnStudentRecord = new JTextPane();
		txtpnStudentRecord.setForeground(new Color(255, 255, 255));
		txtpnStudentRecord.setBackground(new Color(128, 128, 128));
		txtpnStudentRecord.setEditable(false);
		txtpnStudentRecord.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 41));
		txtpnStudentRecord.setText("      STAFF RECORD");
		txtpnStudentRecord.setBounds(0, 0, 472, 61);
		contentPane.add(txtpnStudentRecord);
		
		textField = new JTextField();
		textField.setBounds(159, 110, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 141, 238, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 172, 238, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 234, 238, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(159, 203, 238, 20);
		contentPane.add(textField_4);
		
		txtpnFirst = new JTextPane();
		txtpnFirst.setText("First Name");
		txtpnFirst.setBackground(new Color(169, 169, 169));
		txtpnFirst.setBounds(39, 110, 75, 20);
		contentPane.add(txtpnFirst);
		
		txtpnLastName = new JTextPane();
		txtpnLastName.setText("Last Name");
		txtpnLastName.setBackground(new Color(169, 169, 169));
		txtpnLastName.setBounds(39, 141, 75, 20);
		contentPane.add(txtpnLastName);
		
		txtpnDepartment = new JTextPane();
		txtpnDepartment.setText("Department");
		txtpnDepartment.setBackground(new Color(169, 169, 169));
		txtpnDepartment.setBounds(39, 172, 75, 20);
		contentPane.add(txtpnDepartment);
		
		txtpnPosition = new JTextPane();
		txtpnPosition.setText("Position");
		txtpnPosition.setBackground(new Color(169, 169, 169));
		txtpnPosition.setBounds(39, 203, 75, 20);
		contentPane.add(txtpnPosition);
		
		txtpnDateOfEmployment = new JTextPane();
		txtpnDateOfEmployment.setText("Date of Employment");
		txtpnDateOfEmployment.setBackground(new Color(169, 169, 169));
		txtpnDateOfEmployment.setBounds(39, 234, 110, 20);
		contentPane.add(txtpnDateOfEmployment);
		
		txtpnIdNumber = new JTextPane();
		txtpnIdNumber.setText("ID Number");
		txtpnIdNumber.setBackground(new Color(169, 169, 169));
		txtpnIdNumber.setBounds(39, 79, 75, 20);
		contentPane.add(txtpnIdNumber);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(159, 79, 238, 20);
		contentPane.add(textField_5);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add record by getting staff info from databse
				//
			}
		});
		btnNewButton.setBounds(60, 265, 89, 23);
		contentPane.add(btnNewButton);
		
		btnClear = new JButton("CLEAR");
		btnClear.setBounds(194, 265, 89, 23);
		contentPane.add(btnClear);
		
		btnExit = new JButton("EXIT");
		btnExit.setBounds(322, 265, 89, 23);
		contentPane.add(btnExit);
	}
}
