/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.menagment;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author LED COM
 */
public class HotelMenagment extends JFrame implements ActionListener{

    HotelMenagment(){
      
      //  setSize(1000,400);
        
       // setLocation(300,300);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/hot.jpeg"));
       JLabel l1=new JLabel(i1);
       l1.setBounds(0,0,1026,505);
       add(l1);
       
       JLabel l2=new JLabel("Sistem i Menagjimit te Hotelit");
       l2.setBounds(20,370,1000,70);
       l2.setForeground(Color.white);
       l2.setFont(new Font("serif",Font.PLAIN,60));
       l1.add(l2);
       
       JLabel l3=new JLabel("Dardan Resort");
       l3.setBounds(350,20,1000,70);
       l3.setForeground(Color.RED);
       l3.setFont(new Font("Arial",Font.PLAIN,50));
       l1.add(l3);
       
       JButton b1=new JButton("Next");
       b1.setBackground(Color.WHITE);
       b1.setForeground(Color.BLACK);
       b1.setBounds(830,400,120,50);
       b1.addActionListener(this);
       l1.add(b1);
       
          setLayout(null);
           setBounds(150,100,1026,505);
       setVisible(true);
       
       while(true){
           l2.setVisible(true);
           try{
               Thread.sleep(500);
           }catch(Exception e){
               
                }
               l2.setVisible(false);
             try{
           Thread.sleep(500);
             }catch(Exception e){
                 
            
           }
           
           
       }
       
    
    }
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }
    
    
    public static void main(String[] args) {
        new HotelMenagment();
        
    }


    }
    

