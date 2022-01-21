
import javax.swing.*;//creating a frame
import java.awt.event.*;//writing action listener
import java.sql.*;//connect to database
public class Login{
Connection con;
Statement st;
ResultSet rs;
//gui
JFrame f = new JFrame ("Registration");
JLabel l = new JLabel ("Username:");
JLabel l1 = new JLabel ("Password:");
JTextField t = new JTextField(15);
JTextField t1 = new JTextField(15);
JButton b = new JButton ("Login");
public Login(){
connect();
frame();
}
public void connect()

{
try
{
String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
Class.forName(driver);//loading driver
String db="jdbc:odbc:HAI";
con = DriverManager.getConnection(db);
st =con.createStatement();
}
catch (Exception ex) 
{
}
}

public void frame()
{
f.setSize(400,400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
f.setResizable( false );
f.setLocationRelativeTo(null);
JPanel panel = new JPanel ();
panel.add(l);
panel.add(t);
panel.add(l1);
panel.add(t1);
panel.add(b);
f.add(panel);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
//String typea = null;
try
{
String user = t.getText().trim(); //remove any space
String pass = t1.getText().trim();
// this section points to where info will be collected for the user after login
String sql = "select * from User where ID_Number like '"+user+"'and Password = '"+pass+"'";
rs = st.executeQuery(sql);
int count = 0;
String typea="";
while(rs.next())
{
typea=rs.getString("User_Type");
count=count + 1;//count the number of persons in the database with that login
typea = typea.trim();//must trim to get the actual length
} 
if(count==1)
{
System.out.println(count+""); 
if (typea.equalsIgnoreCase("Staff"))
{
new CreateStudentRecordGui();
f.setVisible(false);
}
else if (typea.equals("Student"))  
{
new StudentMenu(user);//pass the user id
f.setVisible(false);
}
}
else
{
JOptionPane.showMessageDialog(null, "Sorry, Not Found! Try Again");
}
} 
catch (Exception ex)
{
}
}
});
}
public static void main(String[] args)  {
new Login();
}
}
