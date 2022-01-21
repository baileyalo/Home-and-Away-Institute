package hai.gui;
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
					student frame = new student();
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
		contentPane = 
				
				new JPanel();
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
		lblAwardRecieved.setBounds(20, 72, 163, 14);
		contentPane.add(lblAwardRecieved);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(238, 96, 106, 20);
		contentPane.add(editorPane);
		
		JLabel lblIdNumber = new JLabel("Id Number:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblIdNumber.setBounds(20, 97, 163, 14);
		contentPane.add(lblIdNumber);
		
		JLabel lblProgramme = new JLabel("Programme: ");
		lblProgramme.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblProgramme.setBounds(20, 122, 163, 14);
		contentPane.add(lblProgramme);
		
		JLabel lblAwardToBe = new JLabel("Award to be Granted");
		lblAwardToBe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAwardToBe.setBounds(20, 147, 203, 14);
		contentPane.add(lblAwardToBe);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(20, 172, 163, 14);
		contentPane.add(label);
	}
}
