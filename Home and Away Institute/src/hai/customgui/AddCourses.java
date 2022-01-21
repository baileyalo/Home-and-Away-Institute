package hai.customgui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class AddCourses extends JInternalFrame implements ActionListener{
    private JLabel lblCourseCode,lblCourseName,lblCredit,lblDuration,lblDescription;
    private JTextField txtCourseCode,txtCourseName,txtCredit,txtDuration, txtDescription;
    
    private JButton btnSave,btnCancel;
    public AddCourses(){
        super("Add Courses",false,true,false,true);
        setSize(292,279);
        setLocation(400,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c=this.getContentPane();
        
        lblCourseCode=new JLabel(" Code");
        lblCourseName=new JLabel(" Name");
        lblCredit=new JLabel(" Credit");
        lblDuration=new JLabel(" Duration");
        lblDescription=new JLabel(" Description");
   
        txtCourseCode=new JTextField();
        txtCourseName=new JTextField();
        txtCredit=new JTextField();
        txtDuration=new JTextField();
        txtDescription=new JTextField();
       
        btnSave=new JButton("Save");
        btnCancel=new JButton("Cancel");
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(lblCourseCode, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(txtCourseCode, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(txtCourseName, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(lblCredit, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(txtCredit, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(lblDuration, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(txtDuration, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblCourseCode, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCourseCode, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCourseName, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblCredit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCredit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDuration, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtDuration, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
        );
        getContentPane().setLayout(groupLayout);
        
        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);
    }//constructor closed
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnSave){
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");                
                Connection con=DriverManager.getConnection("jdbc:odbc:hai","","");
                String sql="INSERT INTO Course values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1, txtCourseCode.getText());
                ps.setString(2, txtCourseName.getText());
                ps.setInt(3, Integer.parseInt(txtCredit.getText()));
                ps.setString(4,txtDuration.getText());
                ps.setString(5, txtDescription.getText());
                
                
                int retval=ps.executeUpdate();
                if(retval>0){
                    JOptionPane.showMessageDialog(null, "Record successfully added to database");
                    txtCredit.setText("");
                    txtDescription.setText("");
                    txtCourseName.setText("");
                    txtCourseCode.setText("");
                    txtDuration.setText("");
                    
                   
                }
            }catch(ClassNotFoundException ex)
            {
            	JOptionPane.showMessageDialog(null,"Error loading database driver","Error",JOptionPane.ERROR_MESSAGE);
            }catch(SQLException ex)
            {
            	JOptionPane.showMessageDialog(null,"Error connecting to database","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else if(ae.getSource()==btnCancel){
            this.dispose();
        }
    }
}//class closed
