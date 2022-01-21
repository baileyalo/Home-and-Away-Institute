package holder;

import hai.customgui.StaffLoginGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choice frame = new Choice();
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
	public Choice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntro = new JLabel("Welcome to Home and Away Institute");
		lblIntro.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		lblIntro.setBounds(88, 11, 293, 14);
		contentPane.add(lblIntro);
		
		JLabel lblBestChoice = new JLabel("The best choice in education");
		lblBestChoice.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblBestChoice.setBounds(138, 60, 161, 14);
		contentPane.add(lblBestChoice);
		
		JButton btnGoToStaff = new JButton("Go to Staff Login");
		btnGoToStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLoginGUI choice1=new StaffLoginGUI();
			    choice1.main(null);	
			}
			
		});
		btnGoToStaff.setBounds(66, 142, 129, 23);
		contentPane.add(btnGoToStaff);
		
		JButton btnGoToStudent = new JButton("Go to Student Login");
		btnGoToStudent.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			StudentLoginGui choice1=new StudentLoginGui();
		    choice1.main(null);	
		}
		
	});
		
		btnGoToStudent.setBounds(229, 142, 152, 23);
		contentPane.add(btnGoToStudent);
	}
	
}
