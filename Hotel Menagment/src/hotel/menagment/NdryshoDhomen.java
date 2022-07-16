/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.menagment;

/**
 *
 * @author LED COM
 */

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class NdryshoDhomen extends JFrame  implements ActionListener{
    Choice c1;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    NdryshoDhomen(){
     JLabel l1=new JLabel("Ndrysho statusin e dhomes");
     l1.setFont(new Font("Tahoma",Font.PLAIN,20));
     l1.setForeground(Color.BLUE);
     
     l1.setBounds(30,20,250,30);
     add(l1);
     
     
     JLabel l2=new JLabel("KlientId");
     l2.setBounds(30,70,100,30);
     add(l2);
     
     
       c1=new Choice();
     
     try{
         conn c=new conn();
         ResultSet rs=c.s.executeQuery("select * from klient");
         while(rs.next()){
             c1.add(rs.getString("numri"));
         }
         
     }catch(Exception e ){}
     
     c1.setBounds(200,70,150,60);
     add(c1);
     
      JLabel l3=new JLabel("Nr.Dhomes");
     l3.setBounds(30,120,100,30);
     add(l3);
     
     t1=new JTextField();
     t1.setBounds(200,120,150,30);
     add(t1);
   
      JLabel l4=new JLabel("Disponueshmeria");
     l4.setBounds(30,170,100,30);
     add(l4);
     
     
     t2=new JTextField();
     t2.setBounds(200,170,150,30);
     add(t2);
     
      JLabel l5=new JLabel("Statusi i Pastertise");
     l5.setBounds(30,220,80,30);
     add(l5);
     
     t3=new JTextField();
     t3.setBounds(200,220,150,30);
     add(t3);
     
     
     b1=new JButton("Kontrollo");
     b1.setBounds(100,290,100,30);
     b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
     b1.addActionListener(this);
     add(b1);
     
     b2=new JButton("Ndrysho");
     b2.setBounds(250,290,100,30);
        b2.setBackground(Color.BLACK);
     b2.setForeground(Color.WHITE);
     b2.addActionListener(this);
     add(b2);
     
     b3=new JButton("Kthehu");
     b3.setBounds(180,350,100,30);
        b3.setBackground(Color.BLACK);
     b3.setForeground(Color.WHITE);
     b3.addActionListener(this);
     add(b3);
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/ho.jpeg"));
     JLabel l10=new JLabel(i1);
     l10.setBounds(400,30,500,400);
     add(l10);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     setBounds(230,165,950,500);
     setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String dhoma=null;
            String s1=c1.getSelectedItem();
            conn c=new conn();
            try{
                ResultSet rs=c.s.executeQuery("SELECT * FROM klient where numri='"+s1+"'");
                while(rs.next()){
                    t1.setText(rs.getString("dhoma"));
                    dhoma=rs.getString("dhoma");
                }
                ResultSet rs2=c.s.executeQuery("SELECT * FROM dhoma where nr_dhomes ='"+dhoma+"'");
                while(rs2.next()){
                    t2.setText(rs2.getString("dispozicion"));
                    t3.setText(rs2.getString("statusi"));
                }
            }catch(Exception e){
            System.out.println(e);
            }
            
            
        }else if(ae.getSource()==b2){
            
            try{
                conn c=new conn();
                String dhoma=t1.getText();
                String dispozicion=t2.getText();
                String statusi=t3.getText();
                
                String str="UPDATE dhoma set dispozicion='"+dispozicion+"',statusi='"+statusi+"' where nr_dhomes='"+dhoma+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Statusi i dhomes eshte ndryshuar");
                new Recepsioni().setVisible(true);
                this.setVisible(false);
                
            } catch (Exception e) {}
               
            
        }else if(ae.getSource()==b3){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[]args){
        new NdryshoDhomen().setVisible(true);
    }
}
