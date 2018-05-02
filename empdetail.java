import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class empdetail extends JFrame{
 public static void main(String args[]){
  new empdetail(0);
 }


 JTable tab;
 JPanel tpan=new JPanel();
 JPanel bpan=new JPanel();
 String header[]={"Name","Vacancy","Salary"};
 Object data[][]=new String[15][3];
 JButton check=new JButton("TRY");
 int i,j,ki;

 public empdetail(int k){
  this.ki=k;
  setVisible(true);
  setSize(600,600);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  getContentPane().add(tpan,BorderLayout.CENTER);
  getContentPane().add(bpan,BorderLayout.SOUTH);
  bpan.add(check);
  try{
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection conn=DriverManager.getConnection("jdbc:odbc:go");
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("select * from Company where Field="+ki);
   while(rs.next()){
    for(j=0;j<=2;j++)
     data[i][j]=rs.getString(j+1);
    i++;
   }
  }
  catch(Exception e){
   JOptionPane.showMessageDialog(null,data[1][0]);
   System.exit(0);
  }
  tab=new JTable(data,header);
  tab.setPreferredScrollableViewportSize(new Dimension(600,600));
  JScrollPane sp=new JScrollPane(tab);
  tpan.add(sp);
  pack();
  
 }
} 