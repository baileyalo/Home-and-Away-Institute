

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Button;

public class MAINPAGE extends JFrame {

	private JPanel contentPane;
	private JTextField txtHomeAway;
	private JTextField txtPleaseEnterYour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINPAGE frame = new MAINPAGE();
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
	public MAINPAGE() {
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
		textPane.setBounds(145, 120, 271, 31);
		contentPane.add(textPane);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(new Color(245, 245, 220));
		txtpnPassword.setForeground(new Color(128, 0, 0));
		txtpnPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPassword.setBounds(145, 164, 271, 20);
		contentPane.add(txtpnPassword);
		
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
		txtpnUsername.setBounds(23, 120, 110, 31);
		contentPane.add(txtpnUsername);
		
		JTextPane txtpnPassword_1 = new JTextPane();
		txtpnPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnPassword_1.setForeground(new Color(128, 0, 0));
		txtpnPassword_1.setText("Password");
		txtpnPassword_1.setBounds(23, 164, 105, 20);
		contentPane.add(txtpnPassword_1);
		
		Button button_1 = new Button("CLEAR");
		button_1.setForeground(new Color(128, 0, 0));
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(48, 238, 119, 41);
		contentPane.add(button_1);
		
		Button button_2 = new Button("SUBMIT");
		button_2.setForeground(new Color(128, 0, 0));
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBounds(195, 238, 119, 41);
		contentPane.add(button_2);
		
		Button button_3 = new Button("EXIT");
		button_3.setForeground(new Color(128, 0, 0));
		button_3.setFont(new Font("Dialog", Font.BOLD, 12));
		button_3.setBounds(345, 238, 119, 41);
		contentPane.add(button_3);
	}
}
