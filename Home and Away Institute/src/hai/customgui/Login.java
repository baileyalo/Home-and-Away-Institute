package hai.customgui;

import StudentRecord;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtHomeAway;
	private JTextField txtPleaseEnterYour;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 344);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHomeAway = new JTextField();
		txtHomeAway.setEditable(false);
		txtHomeAway.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeAway.setFont(new Font("Cooper Black", Font.BOLD, 28));
		txtHomeAway.setBackground(new Color(128, 128, 128));
		txtHomeAway.setForeground(new Color(255, 255, 255));
		txtHomeAway.setText("HOME & AWAY INSTITUTE");
		txtHomeAway.setBounds(0, 0, 505, 58);
		contentPane.add(txtHomeAway);
		txtHomeAway.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setBounds(145, 120, 271, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(Color.WHITE);
		txtpnPassword.setForeground(new Color(128, 0, 0));
		txtpnPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPassword.setBounds(145, 164, 271, 20);
		contentPane.add(txtpnPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(new Color(128, 0, 0));
		btnLogin.setBackground(new Color(128, 0, 0));
		btnLogin.addActionListener(this);
		btnLogin.setBounds(201, 238, 125, 41);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setForeground(new Color(128, 0, 0));
		btnClear.setBackground(new Color(128, 0, 0));
		btnClear.addActionListener(this);
		btnClear.setBounds(23, 238, 125, 41);
		contentPane.add(btnClear);
		
		txtPleaseEnterYour = new JTextField();
		txtPleaseEnterYour.setEditable(false);
		txtPleaseEnterYour.setFont(new Font("Calibri", Font.ITALIC, 15));
		txtPleaseEnterYour.setText("                                 Please enter your Login to access the portal");
		txtPleaseEnterYour.setBounds(0, 59, 505, 31);
		contentPane.add(txtPleaseEnterYour);
		txtPleaseEnterYour.setColumns(10);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setBackground(new Color(245, 245, 220));
		txtpnUsername.setForeground(new Color(128, 0, 0));
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnUsername.setText("Username: ");
		txtpnUsername.setBounds(23, 120, 91, 20);
		contentPane.add(txtpnUsername);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
		btnNewButton_2.setForeground(new Color(128, 0, 0));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(368, 238, 119, 41);
		contentPane.add(btnNewButton_2);
		
		JTextPane txtpnPassword_1 = new JTextPane();
		txtpnPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnPassword_1.setForeground(new Color(128, 0, 0));
		txtpnPassword_1.setText("Password");
		txtpnPassword_1.setBounds(23, 164, 105, 20);
		contentPane.add(txtpnPassword_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Documents and Settings\\d610\\My Documents\\school_logo.jpg"));
		button.setEnabled(false);
		button.setForeground(new Color(128, 0, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(128, 0, 0));
		button.addActionListener(this);
		button.setBounds(44, 80, 427, 230);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 193, 6, 20);
		contentPane.add(passwordField);
	}
	
	 public void actionPerformed(ActionEvent e) {
	        Icon btnLogin;
			if (e.getSource() == new JButton (btnLogin)) {
	            try {
	                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                Connection con = DriverManager.getConnection("jdbc:odbc:hai");
	                try {
						String query = "SELECT * FROM AccessStudent WHERE UserName='"+textUserName.getText().trim()+"' AND Password='"+new String(passwordFieldStudent.getPassword())+"'";
						System.out.println(query);
						if(PasswordDb.login(query))
							{
							StudentRecordGui login=new StudentRecordGui();
							login.main(null);
							}else
								JOptionPane.showMessageDialog(null, "Incorrect Password or Id");
	                } catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Invalid", JOptionPane.ERROR_MESSAGE);
	                    txtUName.setText("");
	                    txtPasswd.setText("");
	                }//inner try catch closed
	            } catch (Exception x) {
	                JOptionPane.showMessageDialog(null, "Unable to connect to the database", "Connection error", JOptionPane.ERROR_MESSAGE);
	            }//outer try catch closed
	        }//if closed

	        if (e.getSource() == btnCancel) {
	            System.exit(0);
	        }//if closed
	    }//actionPerformed() closed
/* the name test file*/
	 
	 
	 
}
