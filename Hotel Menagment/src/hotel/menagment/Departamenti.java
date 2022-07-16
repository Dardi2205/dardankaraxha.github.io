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
public class Departamenti extends JFrame implements ActionListener{
    
  
    JButton b1,b2;
    JTable t1;
    Departamenti(){
        
        
      
        
    
        
       
        
        t1=new JTable();
        t1.setBounds(0,50,600,350);
        add(t1);
        
         b1=new JButton("Shiko");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(150,400,100,30);
         b1.addActionListener(this);
         add(b1);
         
         b2=new JButton("Kthehu");
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.setBounds(350,400,100,30);
         b2.addActionListener(this);
         add(b2);
         
         
         JLabel l11=new JLabel("Departamenti");
         l11.setBounds(150,15,100,20);
         add(l11);
         
        
              JLabel l12=new JLabel("Buxheti");
         l12.setBounds(355,15,100,20);
         add(l12);
         
getContentPane().setBackground(Color.WHITE);         
         
        setLayout(null);
        setBounds(400,165,600,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                String str="select * from departamenti";
                
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
        new Departamenti().setVisible(true);
    }
}
