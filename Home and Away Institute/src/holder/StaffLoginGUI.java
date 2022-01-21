package holder;

import hai.driver.StaffRecordGui;
import hai.query.PasswordDb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JPasswordField;

public class StaffLoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textUserInput;
	private JPasswordField passwordFieldStaff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLoginGUI frame = new StaffLoginGUI();
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
	public StaffLoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeStaffMember = new JLabel("Welcome Staff Member");
		lblWelcomeStaffMember.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblWelcomeStaffMember.setBackground(Color.DARK_GRAY);
		lblWelcomeStaffMember.setBounds(135, 11, 180, 14);
		contentPane.add(lblWelcomeStaffMember);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(121, 101, 70, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(121, 135, 70, 14);
		contentPane.add(lblPassword);
		
		textUserInput = new JTextField();
		textUserInput.setBounds(224, 98, 106, 20);
		contentPane.add(textUserInput);
		textUserInput.setColumns(10);
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				/*StudentRecordGui login=new StudentRecordGui();
				login.main(null); */
				try {
					String query = "SELECT * FROM StaffPass WHERE UserName='"+textUserInput.getText().trim()+"' AND Password='"+new String(passwordFieldStaff.getPassword())+"'";
					System.out.println(query);
					if(PasswordDb.login(query))
						{
						StaffRecordGui login=new StaffRecordGui();
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
		buttonLogin.setBounds(173, 203, 91, 23);
		contentPane.add(buttonLogin);
		
		passwordFieldStaff = new JPasswordField();
		passwordFieldStaff.setBounds(224, 132, 106, 20);
		contentPane.add(passwordFieldStaff);
	}
	

}
