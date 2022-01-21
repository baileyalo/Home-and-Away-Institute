package hai.customgui;


import hai.database.PasswordDb;
import hai.customgui.StudentRecord;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class StudentLoginGui extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textStudentId;
	private JPasswordField passwordFieldStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLoginGui frame = new StudentLoginGui();
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
	public StudentLoginGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Home & Away Student");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(107, 11, 260, 14);
		contentPane.add(lblNewLabel);
		
		JLabel labelUserName = new JLabel("Username");
		labelUserName.setBounds(128, 100, 70, 14);
		contentPane.add(labelUserName);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(128, 155, 70, 14);
		contentPane.add(labelPassword);
		
		textStudentId = new JTextField();
		textStudentId.setColumns(10);
		textStudentId.setBounds(222, 97, 106, 20);
		contentPane.add(textStudentId);

		passwordFieldStudent = new JPasswordField();
		passwordFieldStudent.setBounds(222, 152, 106, 20);
		contentPane.add(passwordFieldStudent);
		
		JButton buttonLogin = new JButton("Login");
		
		buttonLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				/*StudentRecordGui login=new StudentRecordGui();
				login.main(null); */
				try {
					String query = "SELECT * FROM UserPass WHERE UserName='"+textStudentId.getText().trim()+"' AND Password='"+new String(passwordFieldStudent.getPassword())+"'";
					System.out.println(query);
					if(PasswordDb.login(query))
						{
						StudentRecord login=new StudentRecord();
						login.main(null);
						}else
							JOptionPane.showMessageDialog(null, "Incorrect Password or Id");
					;
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		buttonLogin.setBounds(178, 219, 91, 23);
		contentPane.add(buttonLogin);
		
		

	}
}
