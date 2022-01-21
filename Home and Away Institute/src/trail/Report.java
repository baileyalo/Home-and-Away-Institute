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
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Button;

public class Report extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setTitle("HOME & AWAY INSTITUTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnStudentRecord = new JTextPane();
		txtpnStudentRecord.setForeground(new Color(255, 255, 255));
		txtpnStudentRecord.setBackground(new Color(128, 128, 128));
		txtpnStudentRecord.setEditable(false);
		txtpnStudentRecord.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 41));
		txtpnStudentRecord.setText("      Progress Report");
		txtpnStudentRecord.setBounds(0, 0, 472, 61);
		contentPane.add(txtpnStudentRecord);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Documents and Settings\\d610\\My Documents\\Graduation2.jpg"));
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 273, 472, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblAwardRecieved = new JLabel("Name: ");
		lblAwardRecieved.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAwardRecieved.setBounds(0, 89, 106, 14);
		contentPane.add(lblAwardRecieved);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(238, 96, 106, 20);
		contentPane.add(editorPane);
		
		JLabel lblIdNumber = new JLabel("Id Number:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblIdNumber.setBounds(0, 124, 115, 14);
		contentPane.add(lblIdNumber);
		
		JLabel lblProgramme = new JLabel("Programme: ");
		lblProgramme.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblProgramme.setBounds(0, 160, 106, 14);
		contentPane.add(lblProgramme);
		
		JLabel lblAwardToBe = new JLabel("Award to be Granted");
		lblAwardToBe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAwardToBe.setBounds(1, 185, 182, 14);
		contentPane.add(lblAwardToBe);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(20, 172, 163, 14);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(89, 81, 208, 22);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(136, 124, 208, 22);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(154, 152, 208, 22);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(198, 187, 208, 22);
		contentPane.add(textField_3);
		
		Button button = new Button("SUBMIT");
		button.setBounds(182, 233, 115, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("EXIT");
		button_1.setBounds(328, 233, 115, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("CLEAR");
		button_2.setBounds(14, 233, 115, 22);
		contentPane.add(button_2);
	}
}
