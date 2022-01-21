package hai.gui;





import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;

@SuppressWarnings("serial")
public class StaffLoginGui extends JFrame {

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
					StaffLoginGui frame = new StaffLoginGui();
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
	public StaffLoginGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Home & Away Student");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(107, 11, 260, 14);
		contentPane.add(lblNewLabel);
		
		JLabel labelUserName = new JLabel("Username");
		labelUserName.setBounds(40, 100, 70, 14);
		contentPane.add(labelUserName);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(40, 155, 70, 14);
		contentPane.add(labelPassword);
		
		textStudentId = new JTextField();
		textStudentId.setColumns(10);
		textStudentId.setBounds(153, 97, 106, 20);
		contentPane.add(textStudentId);

		passwordFieldStudent = new JPasswordField();
		passwordFieldStudent.setBounds(153, 152, 106, 20);
		contentPane.add(passwordFieldStudent);
		
		JButton buttonLogin = new JButton("Login");
		
		buttonLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				/*StudentRecordGui login=new StudentRecordGui();
				login.main(null); */
				try {
					String query = "SELECT * FROM AccessStudent WHERE Id='"+textStudentId.getText().trim()+"' AND Password='"+new String(passwordFieldStudent.getPassword())+"'";
					System.out.println(query);
					if(PasswordDb.login(query))
						{
						StaffLoginGui login=new StaffLoginGui();
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
