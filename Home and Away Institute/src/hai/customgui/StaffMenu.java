package hai.customgui;

import javax.swing.JApplet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.ImageIcon;

public class StaffMenu extends javax.swing.JFrame {

	public static void main(String [] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				StaffMenu m = new StaffMenu();
				m.setSize(450, 310);
				m.setVisible(true);
			}
		});
	}
	/**
	 * Create the applet.
	 */
	public StaffMenu() {
		setTitle("Staff Menu");
		
		JButton btnCreate = new JButton("Register Student");
		btnCreate.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//enter the student info here
				StudentRecord r = new StudentRecord();
				r.setVisible(true);
			}
		});
		
		JButton btnAward = new JButton("Generate Award");
		
		JButton btnReport = new JButton("Generate Progress Report");
		
		JButton btnExit = new JButton("Log Off");
		btnExit.setIcon(new ImageIcon("C:\\Users\\Antonette Harvey\\Documents\\year 3\\semester 2\\java\\HomeandAwayInstitutePrototype\\Home and Away Institute\\src\\images\\cancel.PNG"));
		btnExit.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel = new JLabel("Home & Away Institute Staff Menu");
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(304, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCreate)
							.addGap(77)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnAward, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnReport, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCreate)
						.addComponent(btnReport))
					.addGap(29)
					.addComponent(btnAward)
					.addGap(57)
					.addComponent(btnExit)
					.addGap(21))
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStudent = new JMenu("Students");
		menuBar.add(mnStudent);
		
		JMenuItem mntmExitCtrl = new JMenuItem("Update Student");
		mntmExitCtrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// add update query here
			}
		});
		mnStudent.add(mntmExitCtrl);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);

	}
}
