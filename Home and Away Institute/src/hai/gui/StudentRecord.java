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

public class StudentRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextPane textPane;
	private JTextPane txtpnFirstName;
	private JTextPane txtpnLastName;
	private JTextPane txtpnDateOfBirth;
	private JTextPane txtpnAddress;
	private JTextPane txtpnParish;
	private JTextPane txtpnTel;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextPane txtpnProgramme;
	private JTextField textField_7;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
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
	public StudentRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 460);
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
		txtpnStudentRecord.setText("   STUDENT RECORD");
		txtpnStudentRecord.setBounds(0, 0, 472, 61);
		contentPane.add(txtpnStudentRecord);
		
		textField = new JTextField();
		textField.setBounds(159, 72, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 103, 238, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 134, 238, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 196, 238, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(159, 165, 238, 20);
		contentPane.add(textField_4);
		
		textPane = new JTextPane();
		textPane.setText("ID Number");
		textPane.setBackground(new Color(169, 169, 169));
		textPane.setBounds(36, 72, 75, 20);
		contentPane.add(textPane);
		
		txtpnFirstName = new JTextPane();
		txtpnFirstName.setText("First Name");
		txtpnFirstName.setBackground(new Color(169, 169, 169));
		txtpnFirstName.setBounds(36, 103, 75, 20);
		contentPane.add(txtpnFirstName);
		
		txtpnLastName = new JTextPane();
		txtpnLastName.setText("Last Name");
		txtpnLastName.setBackground(new Color(169, 169, 169));
		txtpnLastName.setBounds(36, 134, 75, 20);
		contentPane.add(txtpnLastName);
		
		txtpnDateOfBirth = new JTextPane();
		txtpnDateOfBirth.setText("Date of Birth");
		txtpnDateOfBirth.setBackground(new Color(169, 169, 169));
		txtpnDateOfBirth.setBounds(36, 165, 75, 20);
		contentPane.add(txtpnDateOfBirth);
		
		txtpnAddress = new JTextPane();
		txtpnAddress.setText("Address");
		txtpnAddress.setBackground(new Color(169, 169, 169));
		txtpnAddress.setBounds(36, 196, 75, 20);
		contentPane.add(txtpnAddress);
		
		txtpnParish = new JTextPane();
		txtpnParish.setText("Parish");
		txtpnParish.setBackground(new Color(169, 169, 169));
		txtpnParish.setBounds(36, 227, 75, 20);
		contentPane.add(txtpnParish);
		
		txtpnTel = new JTextPane();
		txtpnTel.setText("Tel #");
		txtpnTel.setBackground(new Color(169, 169, 169));
		txtpnTel.setBounds(36, 258, 75, 20);
		contentPane.add(txtpnTel);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(159, 227, 238, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(159, 258, 238, 20);
		contentPane.add(textField_6);
		
		txtpnProgramme = new JTextPane();
		txtpnProgramme.setText("Programme");
		txtpnProgramme.setBackground(new Color(169, 169, 169));
		txtpnProgramme.setBounds(36, 289, 75, 20);
		contentPane.add(txtpnProgramme);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(159, 289, 238, 20);
		contentPane.add(textField_7);
		
		button = new JButton("SUBMIT");
		button.setBounds(36, 388, 89, 23);
		contentPane.add(button);
		
		button_1 = new JButton("CLEAR");
		button_1.setBounds(189, 388, 89, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("EXIT");
		button_2.setBounds(335, 388, 89, 23);
		contentPane.add(button_2);
		
		JTextPane userName = new JTextPane();
		userName.setText("Programme");
		userName.setBackground(new Color(169, 169, 169));
		userName.setBounds(36, 333, 75, 20);
		contentPane.add(userName);
	}
}


