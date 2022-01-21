package trail;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




import hai.customgui.StudentRecord;
import hai.library.UtilityClass;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Team5
 */
public class StudentRegistration extends javax.swing.JFrame {

    MAINPAGE LoginWindow;

    /** Creates new form StudentRegistration */
    public StudentRegistration(MAINPAGE) {
        this.MAINPAGE = window;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(homeandawayinstituteprototype.HomeAndAwayInstituteApp.class).getContext().getResourceMap(StudentRegistration.class);
        setFont(resourceMap.getFont("Form.font")); // NOI18N
        setMinimumSize(new java.awt.Dimension(411, 350));
        setName("Form"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load(evt);
            }
        });

        jLabel1.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel1.setText("First Name"); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel2.setText("Last Name"); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel3.setText("User Name"); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel4.setText("Password"); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jPasswordField1.setText(resourceMap.getString("jPasswordField1.text")); // NOI18N
        jPasswordField1.setName("jPasswordField1"); // NOI18N

        jPasswordField2.setText(resourceMap.getString("jPasswordField2.text")); // NOI18N
        jPasswordField2.setName("jPasswordField2"); // NOI18N

        jPasswordField3.setText(resourceMap.getString("jPasswordField3.text")); // NOI18N
        jPasswordField3.setName("jPasswordField3"); // NOI18N
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText("Confirm"); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new Font("Arial Black", Font.BOLD, 14)); // NOI18N
        jLabel6.setText("Register Student"); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(homeandawayinstituteprototype.HomeAndAwayInstituteApp.class).getContext().getActionMap(StudentRegistration.class, this);
        jButton1.setAction(actionMap.get("register")); // NOI18N
        jButton1.setText("Register"); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("resetForm")); // NOI18N
        jButton2.setText("Reset"); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText("Programme"); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(83)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(70)
        					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel2)
        							.addComponent(jLabel1))
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        							.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel4)
        							.addComponent(jLabel5)
        							.addComponent(jLabel7))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jPasswordField3, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        							.addComponent(jPasswordField2, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        							.addComponent(jComboBox1, Alignment.LEADING, 0, 155, Short.MAX_VALUE)))
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel3)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(18))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addComponent(jLabel6)
        			.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton1))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(jPasswordField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7))))
        			.addGap(42))
        );
        getContentPane().setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jPasswordField3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jPasswordField1.setText("");
    jPasswordField2.setText("");
    jPasswordField3.setText("");
}//GEN-LAST:event_jButton2ActionPerformed

private void Load(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load

    try {
        ArrayList<ProgrammeRecord> records = DatabaseLayer.getProgrammes(null);
        UtilityClass.Populate(jComboBox1, records);
        
    } catch (Exception ex) {
        
        
        JOptionPane.showMessageDialog(this, "An error occurred while attempting to load program records!");

    }



}//GEN-LAST:event_Load

    @Action
    public void register() {

        StudentRecord record = new StudentRecord();
        StudentMenu mainpage = new StudentMenu();


        record.setFirstName(jTextField1.getText());
        record.setLastName(jTextField2.getText());
        record.setIdNumber(jTextField3.getText().trim());
        record.setUserName(jTextField3.getText().trim());
        record.setProgramCode(((customcombo)jComboBox1.getSelectedItem()).value );
        record.setAddress("");
    
        record.setContactNumber("");


        try {
            boolean success = Studentdb.addStudent(record, jPasswordField2.getText());

            JOptionPane.showMessageDialog(this, success ? "Registered successfully" : "Registration failed");

            if (success) {

                this.hide();
                LoginWindow.show();


            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    @javax.xml.ws.Action
    public void resetForm() {
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
