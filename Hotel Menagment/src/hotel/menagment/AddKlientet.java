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
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class AddKlientet extends JFrame  implements ActionListener{
    
    
    
    JTextField t1,t2,t3,t4,t5;
    JRadioButton r1,r2;
    Choice c1;
    JButton b1,b2;
      JComboBox k1;
    AddKlientet(){
        
      
        
        JLabel l1=new JLabel("Shto Klientet");
        l1.setBounds(30,40,170,20);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        
        JLabel l2=new JLabel("Id");
        l2.setBounds(30,80,170,30);
        add(l2);
        
    String str[]={"Pasaport","Leternjoftim","PatentShofer"};
    k1=new JComboBox(str);
      k1.setBounds(200,80,150,30);
      add(k1);
         JLabel l3=new JLabel("Numri");
        l3.setBounds(30,120,170,30);
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(200,120,150,30);
        add(t1);
        
         JLabel l4=new JLabel("Emri");
        l4.setBounds(30,160,170,30);
        add(l4);
        
        t2=new JTextField();
        t2.setBounds(200,160,150,30);
        add(t2);
         JLabel l5=new JLabel("Gjinia");
        l5.setBounds(30,200,170,30);
        add(l5);
        
        
        
        r1=new JRadioButton("Mashkull");
        
        r1.setBounds(200,200,80,30);
        add(r1);
        
        r2=new JRadioButton("Femer");
        r2.setBounds(300,200,70,30);
        add(r2);
         JLabel l6=new JLabel("Shteti");
        l6.setBounds(30,240,170,30);
        add(l6);
        
        t3=new JTextField();
        t3.setBounds(200,240,150,30);
        add(t3);
        
         JLabel l7=new JLabel("Dhoma");
        l7.setBounds(30,280,170,30);
        add(l7);
        
        c1=new Choice();
        try{
            conn c =new conn();
            
            String str1="select * from dhoma";
            ResultSet rs=c.s.executeQuery(str1);
            while(rs.next()){
                c1.add(rs.getString("nr_dhomes"));
                
            }
        }catch(Exception e){}
        c1.setBounds(200,280,150,30);
        add(c1);
         JLabel l8=new JLabel("Statusi");
        l8.setBounds(30,320,170,30);
        add(l8);
        
        t4=new JTextField();
        t4.setBounds(200,320,150,30);
        add(t4);
         JLabel l9=new JLabel("Deposita");
        l9.setBounds(30,360,170,30);
        add(l9);
        
         t5=new JTextField();
        t5.setBounds(200,360,150,30);
        add(t5);
        
        
        
        b1=new JButton("Shto");
        b1.setBounds(50,420,100,30);
           b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("Kthehu");
        b2.setBounds(190,420,100,30);
           b2.setBackground(Color.BLACK);
     b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
       
        
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/cus1.jpeg"));
      JLabel l60=new JLabel(i1);
        l60.setBounds(300,50,500,400);
        add(l60);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(270,160,800,560);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String kid=(String)k1.getSelectedItem();
            String numri=t1.getText();
            String emri=t2.getText();
            String  gjinia=null;
            if(r1.isSelected()){
                gjinia="Mashkull";
            }else if(r2.isSelected()){
                gjinia="Femer";
            }
            String shteti=t3.getText();
            String dhoma=c1.getSelectedItem();
            String statusi=t4.getText();
            String deposita=t5.getText();
            
  
            try{
                String str10="insert into klient values('"+kid+"','"+numri+"','"+emri+"','"+gjinia+"','"+shteti+"','"+dhoma+"','"+statusi+"','"+deposita+"')";
                conn c=new conn();
                c.s.executeUpdate(str10);
                JOptionPane.showMessageDialog(null,"Klienti i ri eshte shtuar");
                new Recepsioni().setVisible(true);
                this.setVisible(false);
            }catch(Exception e){
            System.out.println(e);
            }
            
        }else if(ae.getSource()==b2){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
            
        }
    
    public static void main(String []args){
        new AddKlientet().setVisible(true);
    }
}
