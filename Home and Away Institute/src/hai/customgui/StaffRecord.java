package hai.customgui;
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
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.TextField;
import java.awt.Button;

public class StaffRecord extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnFirst;
	private JTextPane txtpnLastName;
	private JTextPane txtpnDepartment;
	private JTextPane txtpnPosition;
	private JTextPane txtpnDateOfEmployment;
	private JTextPane txtpnIdNumber;
	private TextField textField_5;
	private TextField textField;
	private TextField textField_1;
	private TextField textField_2;
	private TextField textField_4;
	private TextField textField_3;
	private Button button;
	private Button button_1;
	private Button button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffRecord frame = new StaffRecord();
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
		
		textField_5 = new TextField();
		textField_5.setBounds(159, 79, 238, 22);
		contentPane.add(textField_5);
		
		textField = new TextField();
		textField.setBounds(159, 110, 238, 22);
		contentPane.add(textField);
		
		textField_1 = new TextField();
		textField_1.setBounds(159, 141, 238, 22);
		contentPane.add(textField_1);
		
		textField_2 = new TextField();
		textField_2.setBounds(159, 172, 238, 22);
		contentPane.add(textField_2);
		
		textField_4 = new TextField();
		textField_4.setBounds(159, 203, 238, 22);
		contentPane.add(textField_4);
		
		textField_3 = new TextField();
		textField_3.setBounds(159, 232, 238, 22);
		contentPane.add(textField_3);
		
		button = new Button("CLEAR");
		button.setBounds(58, 267, 70, 22);
		contentPane.add(button);
		
		button_1 = new Button("SUBMIT");
		button_1.setBounds(187, 267, 70, 22);
		contentPane.add(button_1);
		
		button_2 = new Button("EXIT");
		button_2.setBounds(354, 267, 70, 22);
		contentPane.add(button_2);
	}
}
