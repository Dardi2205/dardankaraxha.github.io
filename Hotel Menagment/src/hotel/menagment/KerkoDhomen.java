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
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class KerkoDhomen extends JFrame implements ActionListener{
    
    JComboBox c1;
    JCheckBox c2;
    JButton b1,b2;
    JTable t1;
    KerkoDhomen(){
        
        
        JLabel l1=new JLabel("Kerko per dhome");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(300,30,200,30);
        add(l1);
        
        
        JLabel l2=new JLabel("Tipi i shtrati dhomes");
        l2.setBounds(50,100,120,20);
        add(l2);
        
        c1=new JComboBox(new String[]{"Shtrat 1-she","Shtrat 2-she"});
        c1.setBounds(170,100,150,25);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2=new JCheckBox("Vetem te disponueshme");
        c2.setBounds(550,100,150,25);
        add(c2);
        
        t1=new JTable();
        t1.setBounds(0,200,800,300);
        add(t1);
        
         b1=new JButton("Kerko");
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
         
         
         JLabel l11=new JLabel("Nr.Dhomes");
         l11.setBounds(40,165,100,20);
         add(l11);
         
        
              JLabel l12=new JLabel("Disponueshmeria");
         l12.setBounds(180,165,100,20);
         add(l12);
         
              JLabel l13=new JLabel("Pastertia");
         l13.setBounds(350,165,100,20);
         add(l13);
         
              JLabel l14=new JLabel("Pagesa");
         l14.setBounds(500,165,100,20);
         add(l14);
         
              JLabel l15=new JLabel("Tipi i Shtratit");
         l15.setBounds(656,165,100,20);
         add(l15);
getContentPane().setBackground(Color.WHITE);         
         
        setLayout(null);
        setBounds(300,145,800,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                String str="select * from dhoma where tipi_shtratit='"+c1.getSelectedItem()+"'";
                String str2="select * from dhoma where dispozicion='Dispozicion'AND tipi_shtratit='"+c1.getSelectedItem()+"'"; 
                conn c=new conn();
                ResultSet rs;
                
                if(c2.isSelected()){
                     rs=c.s.executeQuery(str2);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                }else{
                     rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                }
            }catch(Exception e ){
            System.out.println(e);
            }
            
            
        }else if(ae.getSource()==b2){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[]args){
        new KerkoDhomen().setVisible(true);
    }
}
