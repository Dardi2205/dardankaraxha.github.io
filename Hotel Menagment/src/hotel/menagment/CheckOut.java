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
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class CheckOut extends JFrame implements ActionListener{
    
    
    Choice c1;
    JTextField t1;
    JButton b1,b2,b3;
    CheckOut(){
        
        
        JLabel l1=new JLabel("Pagesa");
        l1.setBounds(100,20,100,30);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
         JLabel l2=new JLabel("Kid");
        l2.setBounds(30,80,100,30);
        add(l2);
        
        
        c1=new Choice();
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from klient");
            while(rs.next()){
                c1.add(rs.getString("numri"));
            }
        }catch(Exception e ){}
        
        c1.setBounds(200,80,150,30);
        add(c1);
         JLabel l3=new JLabel("Nr_Dhomes");
        l3.setBounds(30,130,100,30);
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(200,130,150,30);
        add(t1);
        
        b1=new JButton("Pagesa");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50,200,100,30);
        b1.addActionListener(this);
        add(b1);
        
          b2=new JButton("Kthehu");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(170,200,100,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/tick.png"));
        Image i2=i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        b3=new JButton(i3);
        b3.setBounds(360,80,20,20);
        b3.addActionListener(this);
        add(b3);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/checku.jpeg"));
        Image i5=i4.getImage().getScaledInstance(400, 250,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l4=new JLabel(i6);
        l4.setBounds(390,0,400,250);
        add(l4);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(250,200,800,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
            String kid=c1.getSelectedItem();
            String dhoma=t1.getText();
            String str="delete from klient where numri='"+kid+"'";
            String str2="update dhoma set dispozicion='Dispozicion',statusi='Paster' where nr_dhomes ='"+dhoma+"'";
            conn c =new conn();
            try{
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null,"Pagesa eshte ne rregull");
                new Recepsioni().setVisible(true);
                this.setVisible(false);
            }catch(Exception e ){}
        }else if(ae.getSource()==b2){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b3){
            conn c=new conn();
            String kid=c1.getSelectedItem();
            try{
                ResultSet rs=c.s.executeQuery("select * from klient where numri='"+kid+"'");
                while(rs.next()){
                    t1.setText(rs.getString("dhoma"));
                }
            }catch(Exception e){}
        }
    }
    public static void main(String[]args){
        new CheckOut().setVisible(true);
    }
    
}
