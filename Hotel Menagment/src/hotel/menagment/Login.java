/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.menagment;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author LED COM
 */
public class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Login(){
    l1 =new JLabel("Perdoruesi");
    l1.setBounds(40,20,100,30);
    add(l1);
    l2=new JLabel("Fjalkalimi");
    l2.setBounds(40,70,150,30);
    add(l2);
    t1=new JTextField();
    t1.setBounds(150,20,150,30);
    add(t1);
    t2=new JPasswordField();
    t2.setBounds(150,70,150,30);
    add(t2);
    
  
    
    b1=new JButton("Kyqu");
   b1.setBackground(Color.BLACK);
   b1.setForeground(Color.WHITE);
    b1.setBounds(40,150,120,30);
    b1.addActionListener(this);
    add(b1);
b2=new JButton("Hiqe");
b2.setBounds(180,150,120,30);
b2.setBackground(Color.BLACK);
b2.setForeground(Color.white);
b2.addActionListener(this);
add(b2);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/admin.jpeg"));
Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel l3=new JLabel(i3);
l3.setBounds(350,10,200,270);
add(l3);

getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    setBounds(400,200,600,350);
    setVisible(true);
         
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String user=t1.getText();
            String pass=t2.getText();
                    conn c=new conn();
            
           String st="select * from login where  perdoruesi = '"+user+"' and fjalkalimi='"+pass+"'";
            try{
        
               ResultSet rs = c.s.executeQuery(st);
                  
               if(rs.next()){
                  new Dashboard().setVisible(true);
                   this.setVisible(false);
               }
             }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Nuk eshte ne rregull perdoruesi ose fjaklalimi");
                   this.setVisible(false);
             }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new Login();
    }

}
