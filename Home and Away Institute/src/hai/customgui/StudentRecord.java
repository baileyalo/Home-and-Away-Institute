package hai.customgui;


import hai.library.Programme;
import hai.library.UtilityClass;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StudentRecord extends JFrame {

	private JPanel contentPane;
	private JLabel lblid;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblDateOfBirth;
	private JLabel lblAddress;
	private JLabel lblcontactNumber;
	private JLabel lblprogram;
	private JTextField userName;
	private TextField idNumber;
	private TextField firstName;
	private TextField lastName;
	private TextField dob;
	private TextField address;
	private TextField contactNumber;
	private Button button;
	private Button StaffMenu;
	private Button addSt;
	private JLabel lbluserName;
	private JLabel lblpassword;
	private JPasswordField password;
	private JLabel lblConfirm;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord frame = new StudentRecord();
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
		setBounds(100, 100, 577, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentRecord = new JLabel();
		lblStudentRecord.setForeground(new Color(255, 255, 255));
		lblStudentRecord.setBackground(new Color(128, 128, 128));
		lblStudentRecord.setFocusable(false);
		lblStudentRecord.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 41));
		lblStudentRecord.setText("   STUDENT RECORD");
		lblStudentRecord.setBounds(0, 0, 472, 61);
		contentPane.add(lblStudentRecord);
		
		lblid = new JLabel();
		lblid.setText("ID Number");
		lblid.setBackground(new Color(169, 169, 169));
		lblid.setBounds(36, 72, 75, 20);
		contentPane.add(lblid);
		
		lblFirstName = new JLabel();
		lblFirstName.setText("First Name");
		lblFirstName.setBackground(new Color(169, 169, 169));
		lblFirstName.setBounds(36, 103, 75, 20);
		contentPane.add(lblFirstName);
		
		lblLastName = new JLabel();
		lblLastName.setText("Last Name");
		lblLastName.setBackground(new Color(169, 169, 169));
		lblLastName.setBounds(36, 134, 75, 20);
		contentPane.add(lblLastName);
		
		lblDateOfBirth = new JLabel();
		lblDateOfBirth.setText("Date of Birth");
		lblDateOfBirth.setBackground(new Color(169, 169, 169));
		lblDateOfBirth.setBounds(36, 165, 75, 20);
		contentPane.add(lblDateOfBirth);
		
		lblAddress = new JLabel();
		lblAddress.setText("Address");
		lblAddress.setBackground(new Color(169, 169, 169));
		lblAddress.setBounds(36, 196, 75, 20);
		contentPane.add(lblAddress);
		
		lblcontactNumber = new JLabel();
		lblcontactNumber.setText("Contact Number");
		lblcontactNumber.setBackground(new Color(169, 169, 169));
		lblcontactNumber.setBounds(36, 227, 97, 20);
		contentPane.add(lblcontactNumber);
		
		userName = new JTextField();
		userName.setColumns(10);
		userName.setBounds(159, 289, 238, 22);
		contentPane.add(userName);
		
		idNumber = new TextField();
		idNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		idNumber.setBounds(159, 75, 238, 22);
		contentPane.add(idNumber);
		
		firstName = new TextField();
		firstName.setBounds(159, 103, 238, 22);
		contentPane.add(firstName);
		
		lastName = new TextField();
		lastName.setBounds(159, 134, 238, 22);
		contentPane.add(lastName);
		
		dob = new TextField();
		dob.setBounds(159, 165, 238, 22);
		contentPane.add(dob);
		
		address = new TextField();
		address.setBounds(159, 196, 238, 22);
		contentPane.add(address);
		
		contactNumber = new TextField();
		contactNumber.setBounds(159, 227, 238, 22);
		contentPane.add(contactNumber);
		
		button = new Button("Log Off");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(467, 389, 70, 22);
		contentPane.add(button);
		
		StaffMenu = new Button("Main");
		StaffMenu.setActionCommand("SUBMIT");
		StaffMenu.setBounds(467, 337, 70, 22);
		contentPane.add(StaffMenu);
		
		addSt = new Button("Save");
		addSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		addSt.setActionCommand("EXIT");
		addSt.setBounds(467, 289, 70, 22);
		contentPane.add(addSt);
		
		lblprogram = new JLabel();
		lblprogram.setText("Programme");
		lblprogram.setBackground(new Color(169, 169, 169));
		lblprogram.setBounds(36, 258, 75, 20);
		contentPane.add(lblprogram);
		
		final JComboBox<Programme> comboBox = new JComboBox<Programme>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
        	}
				
			private void Load(java.awt.event.WindowEvent evt) {

			    try {
			    	List<Programme> programmes = new ArrayList<Programme>();
			    	programmes.add(new Programme());
			        UtilityClass.Populate(comboBox, programmes);
			        
			    } catch (Exception ex) {
			        
			        
			        JOptionPane.showMessageDialog(comboBox, "An error occurred while attempting to load program records!");

			    }



			}//GEN-LAST:event_Load	
			
			
		});
		comboBox.setModel(new DefaultComboBoxModel<Programme>(new Programme [] {new Programme()}));//String[] {"Computer Management", "Customer Service Management ", "Technology Essentials", "Business Computing", "Business Management"}));
		comboBox.setEditable(true);
		comboBox.setBounds(159, 255, 238, 26);
		contentPane.add(comboBox);
		
		lbluserName = new JLabel("User Name");
		lbluserName.setBounds(36, 289, 75, 14);
		contentPane.add(lbluserName);
		
		lblpassword = new JLabel("Password");
		lblpassword.setBounds(36, 324, 75, 14);
		contentPane.add(lblpassword);
		
		lblConfirm = new JLabel("Confirm");
		lblConfirm.setBounds(36, 359, 46, 14);
		contentPane.add(lblConfirm);
		
		password = new JPasswordField();
		password.setBounds(159, 320, 238, 26);
		contentPane.add(password);
		password.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 356, 238, 26);
		contentPane.add(passwordField);
	}
}


