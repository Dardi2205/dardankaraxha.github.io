/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.menagment;

import java.awt.Color;
    import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


import net.proteanit.sql.*;
public class KlientInfo extends JFrame implements ActionListener{
    JTextField c1,c2;
    JTable t1;
    JButton b1,b2,b3;
    KlientInfo(){
        
        t1=new JTable();
        t1.setBounds(0,40,1050,350);
        add(t1);
        
        JLabel l1=new JLabel("Dokumenti");
        l1.setBounds(50,10,70,20);
        add(l1);
        
           JLabel l2=new JLabel("Numri");
        l2.setBounds(200,10,70,20);
        add(l2);
        
   
         JLabel l3=new JLabel("Emri");
        l3.setBounds(300,10,70,20);
        add(l3);
           JLabel l4=new JLabel("Gjinia");
        l4.setBounds(400,10,70,20);
        add(l4);
        
        
           JLabel l5=new JLabel("Shteti");
        l5.setBounds(550,10,70,20);
        add(l5);
        
           JLabel l6=new JLabel("Dhoma");
        l6.setBounds(690,10,70,20);
        add(l6);
        
        
           JLabel l7=new JLabel("Statusi");
        l7.setBounds(830,10,70,20);
        add(l7);
        
        
          JLabel l8=new JLabel("Deposita");
        l8.setBounds(950,10,70,20);
        add(l8);
  
        
        b1=new JButton("Shiko");
        b1.setBounds(400,400,120,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Kthehu");
        b2.setBounds(550,400,120,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
      
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(180,170,1050,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
            try{
                conn c =new conn();
                String str="select * from klient";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                
               
            }
        }else if(ae.getSource()==b2){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        
            
        }
    }
    public static void main(String[]args){
        new KlientInfo().setVisible(true);
        
    }
}

    

