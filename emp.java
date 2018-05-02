import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class emp extends JFrame implements ActionListener{
 JPanel p=new JPanel();
 JPanel q=new JPanel();
 JTextField tname,textra,tusr,tpwd;
 JLabel lname,lextra,lfield,lsal,Blank,Blank1,Blank2,Blank3,Blank4,lusr,lpwd;
 JComboBox cbsal;
 JRadioButton it,civil,mech;
 JButton bSub,bRes;
 int field;

 public static void main(String args[]){
  new emp();
 }
 

 public emp(){

  getContentPane().add(p,BorderLayout.CENTER);
  getContentPane().add(q,BorderLayout.SOUTH);

  setTitle("Placement Office");
 
  lname=new JLabel("Name: ");
  lextra=new JLabel("Vacancy(s): ");
  lfield=new JLabel("Field: ");
  lsal=new JLabel("Minimum Expected Salary: ");
  lusr=new JLabel("Login name: ");
  lpwd=new JLabel("Password: ");

  tname=new JTextField(20);
  textra=new JTextField(15);
  tusr=new JTextField(10);
  tpwd=new JTextField(10);
 
  cbsal=new JComboBox();
  cbsal.addItem("5,000");
  cbsal.addItem("10,000");
  cbsal.addItem("15,000");
  cbsal.addItem("20,000"); 

  it=new JRadioButton("Software Engg.");
  civil=new JRadioButton("Civil Engg.");
  mech=new JRadioButton("Mechanical Engg.");
  ButtonGroup bg2=new ButtonGroup();
  bg2.add(it);
  bg2.add(civil);
  bg2.add(mech);

  bSub=new JButton("Submit");
  bRes=new JButton("Reset");

  p.setLayout(new GridLayout(11,2));
  Blank=new JLabel(""); 
  Blank1=new JLabel(""); 
  Blank2=new JLabel(""); 
  Blank3=new JLabel("");
  Blank4=new JLabel("");


  p.add(lusr);
  p.add(tusr);   

  p.add(lpwd);
  p.add(tpwd);

  p.add(lname);
  p.add(tname);   

  p.add(lextra);
  p.add(textra);

  p.add(lfield);
  p.add(it);

  p.add(Blank4);
  p.add(civil);
 
  p.add(Blank1);
  p.add(mech);

  p.add(lsal);
  p.add(cbsal);


  q.add(bSub);
  q.add(bRes);
 
  bSub.addActionListener(this);
  bRes.addActionListener(this);
  setVisible(true);
  setBounds(200,200,300,300);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
 }

 public void actionPerformed(ActionEvent e){
  Object source=e.getSource();

  if(source==bRes){
   tname.setText("");
   textra.setText("");
  }
  else{
   if(it.isSelected())field=1;
   else if(civil.isSelected())field=2;
   else if(mech.isSelected())field=3;

   if(tname.getText().equals("") | textra.getText().equals("") | field==0 ) JOptionPane.showMessageDialog(null,"Please Fill in All Entries!!");

   else{
    String sal=(String)cbsal.getSelectedItem();

    try{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection conn=DriverManager.getConnection("jdbc:odbc:go");
     Statement pst=conn.createStatement();
     pst.executeUpdate("INSERT INTO Company VALUES('" + tname.getText() + "','" + textra.getText() + "','" + (String)sal + "','" + field + "','" + tusr.getText() + "','" + tpwd.getText() + "')");
     conn.close();
     String msg="Your Details are Stored. Login again to View Related applicants!  Thank You!!";
     JOptionPane.showMessageDialog(null,msg);
     setVisible(false);
     new login();
    
    }
    catch(Exception exc){
     JOptionPane.showMessageDialog(null,tname.getText()+" : "+exc);
     System.exit(0);
    }
   }
  }
 }
}