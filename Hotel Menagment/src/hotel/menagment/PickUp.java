/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.menagment;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class PickUp extends JFrame implements ActionListener{
    
    Choice c1;
    JButton b1,b2;
    JTable t1;
    PickUp(){
        
        
        JLabel l1=new JLabel("Merrni Sherbime");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(300,30,200,30);
        add(l1);
        
        
        JLabel l2=new JLabel("Tipi i makines");
        l2.setBounds(50,100,120,20);
        add(l2);
        
        c1=new Choice();
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from shoferi");
            while(rs.next()){
                c1.add(rs.getString("brendi"));
            }
        }catch(Exception e){
        
        
        }
        c1.setBounds(170,100,150,25);
        add(c1);
        
       
        
        t1=new JTable();
        t1.setBounds(0,200,800,300);
        add(t1);
        
         b1=new JButton("Merr");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(250,520,100,30);
         b1.addActionListener(this);
         add(b1);
         
         b2=new JButton("Kthehu");
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.setBounds(450,520,100,30);
         b2.addActionListener(this);
         add(b2);
         
         
         JLabel l11=new JLabel("Emri");
         l11.setBounds(40,165,100,20);
         add(l11);
         
        
              JLabel l12=new JLabel("Mosha");
         l12.setBounds(135,165,100,20);
         add(l12);
         
              JLabel l13=new JLabel("Gjinia");
         l13.setBounds(250,165,100,20);
         add(l13);
         
              JLabel l14=new JLabel("Kompania");
         l14.setBounds(360,165,100,20);
         add(l14);
         
              JLabel l15=new JLabel("Tipi I Makines");
         l15.setBounds(465,165,100,20);
         add(l15);
         
           JLabel l16=new JLabel("Disponueshmeria");
         l16.setBounds(575,165,100,20);
         add(l16);
         
           JLabel l17=new JLabel("Lokacioni");
         l17.setBounds(700,165,100,20);
         add(l17);
         
getContentPane().setBackground(Color.WHITE);         
         
        setLayout(null);
        setBounds(300,145,800,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                String str="select * from shoferi where brendi='"+c1.getSelectedItem()+"'";
                
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e ){
            System.out.println(e);
            }
            
            
        }else if(ae.getSource()==b2){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[]args){
        new PickUp().setVisible(true);
    }
}
