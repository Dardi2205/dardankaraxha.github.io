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
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


import net.proteanit.sql.*;
public class InfoPuntor extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    InfoPuntor(){
        
        t1=new JTable();
        t1.setBounds(0,40,1050,350);
        add(t1);
        
        JLabel l1=new JLabel("Emri");
        l1.setBounds(50,10,70,20);
        add(l1);
        
           JLabel l2=new JLabel("Mosha");
        l2.setBounds(200,10,70,20);
        add(l2);
        
           JLabel l3=new JLabel("Gjinia");
        l3.setBounds(350,10,70,20);
        add(l3);
        
        
           JLabel l4=new JLabel("Departamenti");
        l4.setBounds(500,10,70,20);
        add(l4);
        
           JLabel l5=new JLabel("Rroga");
        l5.setBounds(650,10,70,20);
        add(l5);
        
        
           JLabel l6=new JLabel("Numri");
        l6.setBounds(800,10,70,20);
        add(l6);
        
        
           JLabel l7=new JLabel("Email");
        l7.setBounds(950,10,70,20);
        add(l7);
        
        
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
                String str="select * from puntoret";
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
        new InfoPuntor().setVisible(true);
        
    }
}
