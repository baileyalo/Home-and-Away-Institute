package hai.customgui;

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

public class AWARD extends JFrame {

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
	public AWARD() {
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
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Documents and Settings\\d610\\My Documents\\Graduation2.jpg"));
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 155, 472, 159);
		contentPane.add(btnNewButton);
	}
}
