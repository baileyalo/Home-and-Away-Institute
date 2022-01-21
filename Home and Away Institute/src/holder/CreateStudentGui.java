package holder;


import hai.database.Studentdb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


@SuppressWarnings("serial")
public class CreateStudentGui extends JFrame {

	private JPanel contentPane;
	private JTextField textfirstName;
	private JTextField textlastName;
	private JTextField textdob;
	private JTextField textcontactNumber;
	private JTextField textidNumber;
	private JTextField textuserName;
	private JTextField textaddress;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateStudentGui frame = new CreateStudentGui();
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
	public CreateStudentGui() {
		setTitle("New Student Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 470);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewStudent = new JLabel("New Student");
		lblNewStudent.setIcon(new ImageIcon("C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\Home and Away Institute\\src\\images\\user.png"));
		lblNewStudent.setForeground(Color.BLUE);
		lblNewStudent.setBackground(new Color(255, 0, 0));
		lblNewStudent.setFont(new Font("Engravers MT", Font.ITALIC, 14));
		lblNewStudent.setBounds(136, 11, 174, 22);
		contentPane.add(lblNewStudent);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(33, 44, 77, 22);
		contentPane.add(lblFirstName);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(10, 65, 161, 29);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(336, 48, 98, 18);
		contentPane.add(lblLastName);
		
		textlastName = new JTextField();
		textlastName.setBounds(308, 66, 155, 28);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(10, 100, 110, 22);
		contentPane.add(lblDateOfBirth);
		
		textdob = new JTextField();
		textdob.setBounds(10, 119, 161, 28);
		contentPane.add(textdob);
		textdob.setColumns(10);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(10, 152, 110, 14);
		contentPane.add(lblContactNumber);
		
		textcontactNumber = new JTextField();
		textcontactNumber.setBounds(10, 165, 161, 28);
		contentPane.add(textcontactNumber);
		textcontactNumber.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID number");
		lblIdNumber.setBounds(10, 198, 86, 18);
		contentPane.add(lblIdNumber);
		
		textidNumber = new JTextField();
		textidNumber.setBounds(10, 219, 161, 28);
		contentPane.add(textidNumber);
		textidNumber.setColumns(10);
		
		JLabel lblidNumber = new JLabel("ID number");
		lblIdNumber.setBounds(10, 198, 86, 18);
		contentPane.add(lblIdNumber);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(Color.BLUE);
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				try {
					
						StaffRecordGui login2=new StaffRecordGui();
						login2.main(null);
	
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		btnBack.setBounds(454, 393, 88, 22);
		contentPane.add(btnBack);
		
		JButton btnLogOff = new JButton("LOG OFF");
		btnLogOff.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				try {
		Choice choice1=new Choice();
	    choice1.main(null);	
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		
		btnLogOff.setBackground(Color.BLUE);
		btnLogOff.setForeground(Color.BLACK);
		btnLogOff.setBounds(554, 393, 89, 22);
		contentPane.add(btnLogOff);
		
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try {
					
					int idNumber = Integer.parseInt(txtIdNumber.getText());		

					Student student = Studentdb.getStudentById(idNumber);
					/*String query = "INSERT INTO 'StudentRecord' ('Firstname, 'Last Name', 'ID', 'DateOfBirth','ContactNumber') VALUES('"+textfirstName.getText()+"','"+textdob.getText()+"','"+textcontactNumber.getText()+"','"+textField_4.getText()+"'";
					System.out.println(query);
					if(StudentDb.insert(query))*/
						{
							JOptionPane.showMessageDialog(null, "New Student Record created!");
						}else
							JOptionPane.showMessageDialog(null, "Student Record was no created!");
					;
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnEnter.setBackground(Color.BLUE);
		btnEnter.setBounds(355, 393, 89, 23);
		contentPane.add(btnEnter);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(20, 252, 116, 14);
		contentPane.add(lblUserName);
		
		textuserName = new JTextField();
		textuserName.setBounds(10, 275, 161, 28);
		contentPane.add(textuserName);
		textuserName.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(640, 100, 15, 117);
		contentPane.add(scrollBar);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(355, 101, 55, 16);
		contentPane.add(lblAddress);
		
		textaddress = new JTextField();
		textaddress.setBounds(308, 119, 161, 28);
		contentPane.add(textaddress);
		textaddress.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(20, 315, 116, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(19, 332, 152, 28);
		contentPane.add(passwordField);
		
		JLabel lblprogramme = new JLabel("Programme");
		lblprogramme.setBounds(319, 171, 163, 16);
		contentPane.add(lblprogramme);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String programme Code = String (textProgram.getText ());
					Programme programme = Programdb.getProgram
				}
				catch exception 
							
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer Management", "Customer Service Management ", "Technology Essentials", "Business Computing", "Business Management"}));
		comboBox.setEditable(true);
		comboBox.setBounds(315, 194, 167, 26);
		contentPane.add(comboBox);
	}
}
