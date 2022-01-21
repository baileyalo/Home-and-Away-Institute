




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
import java.awt.TextField;
import java.awt.Button;

@SuppressWarnings("serial")
public class StaffLoginGui extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;

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
		
		TextField textField = new TextField();
		textField.setBounds(135, 92, 124, 22);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(135, 142, 124, 22);
		contentPane.add(textField_1);
		
		Button button = new Button("CLEAR");
		button.setBounds(40, 218, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("SUBMIT");
		button_1.setBounds(189, 218, 70, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("EXIT");
		button_2.setBounds(321, 218, 70, 22);
		contentPane.add(button_2);
		
		

	}
}
