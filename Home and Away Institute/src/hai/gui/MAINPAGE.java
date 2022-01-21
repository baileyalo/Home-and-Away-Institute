package hai.gui;

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
		textPane.setBounds(145, 120, 271, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(new Color(245, 245, 220));
		txtpnPassword.setForeground(new Color(128, 0, 0));
		txtpnPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPassword.setBounds(145, 164, 271, 20);
		contentPane.add(txtpnPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(new Color(128, 0, 0));
		btnLogin.setBackground(new Color(128, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(201, 238, 125, 41);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setForeground(new Color(128, 0, 0));
		btnClear.setBackground(new Color(128, 0, 0));
		btnClear.setBounds(23, 238, 125, 41);
		contentPane.add(btnClear);
		
		txtPleaseEnterYour = new JTextField();
		txtPleaseEnterYour.setEditable(false);
		txtPleaseEnterYour.setFont(new Font("Calibri", Font.ITALIC, 15));
		txtPleaseEnterYour.setText("                                 Please enter your Login to access the system");
		txtPleaseEnterYour.setBounds(0, 59, 505, 31);
		contentPane.add(txtPleaseEnterYour);
		txtPleaseEnterYour.setColumns(10);
		
		Button Exit = new Button("EXIT");
		Exit.setBackground(Color.PINK);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Exit.setBounds(362, 238, 125, 41);
		contentPane.add(Exit);
		
		JLabel lblUserName = new JLabel("User Name: ");
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUserName.setBounds(23, 120, 91, 16);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(23, 164, 81, 20);
		contentPane.add(lblPassword);
	}
}
