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

public class Recepsioni extends JFrame implements ActionListener {
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    
    Recepsioni(){
        b1=new JButton("Klienti i ri");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10,30,150,30);
        b1.addActionListener(this);
        add(b1);
        
        
           b2=new JButton("Dhoma");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(10,70,150,30);
        b2.addActionListener(this);
        add(b2);
           b3=new JButton("Departamenti");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(10,110,150,30);
        b3.addActionListener(this);
        add(b3);
           b4=new JButton("Infot per Puntor");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(10,150,150,30);
        b4.addActionListener(this);
        add(b4);
        
        
           b5=new JButton("Infot e Klienteve");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(10,190,150,30);
        b5.addActionListener(this);
        add(b5);
           b6=new JButton("Info e Menagjerit");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(10,230,150,30);
        b6.addActionListener(this);
        add(b6);
        
           b7=new JButton("Pagesa");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(10,270,150,30);
        b7.addActionListener(this);
        add(b7);
        
           b8=new JButton("Ndrysh.statu.kontr");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(10,310,150,30);
        b8.addActionListener(this);
        add(b8);
           b9=new JButton("Ndrysh.statu.dhomes");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(10,350,150,30);
        b9.addActionListener(this);
        add(b9);
        
           b10=new JButton("Merrni sherbimet");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(10,390,150,30);
        b10.addActionListener(this);
        add(b10);
           b11=new JButton("Kerkoni dhomen");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(10,430,150,30);
        b11.addActionListener(this);
        add(b11);
        
           b12=new JButton("Dalja");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBounds(10,470,150,30);
        b12.addActionListener(this);
        add(b12);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/recepsioni.jpeg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(200,10,500,500);
        add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(290,160,800,550);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           new AddKlientet().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource()==b2){
            new Dhoma().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==b3){
            new Departamenti().setVisible(true);
            this.setVisible(false);
        }
           else if(ae.getSource()==b4){
                new InfoPuntor().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b5){
           new KlientInfo().setVisible(true);
           this.setVisible(false);
           }
           else if(ae.getSource()==b6){
               new MenagjerInfo().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b7){
               new CheckOut().setVisible(true);
               this.setVisible(false);
    }
           else if(ae.getSource()==b8){
               new NdryshoniKontrollin().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b9){
               new NdryshoDhomen().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b10){
               new PickUp().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b11){
               new KerkoDhomen().setVisible(true);
               this.setVisible(false);
           }
           else if(ae.getSource()==b12){
               setVisible(false);
               
           }
        
    }
    public static void main(String[]args){
        new Recepsioni().setVisible(true);
    }
}
