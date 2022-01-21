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


public class AddProgramme extends JInternalFrame implements ActionListener{
    private JLabel lblCourseCode,lblProgrammeName,lblAward,lblDecription,lblMaximumCourses;
    private JTextField txtProgrammeCode,txtProgrammeName,txtAccreditation,txtDuration, txtDescription;
    
    private JButton btnSave,btnCancel;
    public AddProgramme(){
        super("Add Program",false,true,false,true);
        setSize(200,200);
        setLocation(400,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c=this.getContentPane();
        getContentPane().setLayout(new GridLayout(6,2));
        
        lblCourseCode=new JLabel(" Programme Code");
        lblProgrammeName=new JLabel(" Programme Name");
        lblAward=new JLabel("Award");
        lblDecription=new JLabel("Accreditation");
        lblMaximumCourses=new JLabel("Maximum  Courses");
   
        txtProgrammeCode=new JTextField();
        txtProgrammeName=new JTextField();
        txtAccreditation=new JTextField();
        txtDuration=new JTextField();
        txtDescription=new JTextField();
       
        btnSave=new JButton("Save");
        btnCancel=new JButton("Cancel");
                
        c.add(lblCourseCode);
        c.add(txtProgrammeCode);
        c.add(lblProgrammeName);
        c.add(txtProgrammeName);
        c.add(lblAward);
        c.add(txtAccreditation);
        c.add(lblDecription);
        c.add(txtDuration);
        c.add(lblMaximumCourses);
        c.add(txtDescription);
        
        
        c.add(btnSave);
        c.add(btnCancel);
        
        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);
    }//constructor closed
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnSave){
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");                
                Connection con=DriverManager.getConnection("jdbc:odbc:hai","","");
                String sql="INSERT INTO Programme values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1, txtProgrammeCode.getText());
                ps.setString(2, txtProgrammeName.getText());
                ps.setInt(3, Integer.parseInt(txtAccreditation.getText()));
                ps.setString(4,txtDuration.getText());
                ps.setString(5, txtDescription.getText());
                
                
                int retval=ps.executeUpdate();
                if(retval>0){
                    JOptionPane.showMessageDialog(null, "Record successfully added to database");
                    txtAccreditation.setText("");
                    txtDescription.setText("");
                    txtProgrammeName.setText("");
                    txtProgrammeCode.setText("");
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