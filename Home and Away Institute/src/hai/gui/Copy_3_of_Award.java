package hai.gui;

import hai.database.Studentdb;

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

public class Copy_3_of_Award extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentdb frame = new Studentdb();
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
	public Copy_3_of_Award() {
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
		txtpnStudentRecord.setText("            AWARD");
		txtpnStudentRecord.setBounds(0, 0, 472, 61);
		contentPane.add(txtpnStudentRecord);
		
		btnNewButton = new JButton("Accreditation");
		btnNewButton.setIcon(new ImageIcon("C:\\Documents and Settings\\d610\\My Documents\\Graduation2.jpg"));
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 198, 472, 116);
		contentPane.add(btnNewButton);
		
		JLabel lblAwardRecieved = new JLabel("ID Number :");
		lblAwardRecieved.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAwardRecieved.setBounds(42, 72, 163, 14);
		contentPane.add(lblAwardRecieved);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(238, 96, 106, 20);
		contentPane.add(editorPane);
		
		JLabel lblProgramme = new JLabel("Programme : ");
		lblProgramme.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblProgramme.setBounds(42, 97, 163, 14);
		contentPane.add(lblProgramme);
		
		JLabel lblAccreditation = new JLabel("Accreditation :");
		lblAccreditation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAccreditation.setBounds(42, 122, 163, 14);
		contentPane.add(lblAccreditation);
		
		JLabel lblAwardGranted = new JLabel("Award Granted: ");
		lblAwardGranted.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAwardGranted.setBounds(42, 152, 163, 14);
		contentPane.add(lblAwardGranted);
	}
}
