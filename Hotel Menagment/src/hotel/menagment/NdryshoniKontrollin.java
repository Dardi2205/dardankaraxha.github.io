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
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class NdryshoniKontrollin extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    Choice c1;
    JTextField t1,t2,t3,t4,t5;
    NdryshoniKontrollin(){
        JLabel l1=new JLabel("Kontrolloni detajet");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(80,30,200,30);
        add(l1);
        
        JLabel l2=new JLabel("Kid");
        l2.setBounds(30,80,100,20);
        add(l2);
        
        c1=new Choice();
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from klient");
           while(rs.next()){
            c1.add(rs.getString("numri"));
           }
        }catch(Exception e){}
    c1.setBounds(200,80,150,30);
    add(c1);
        
         JLabel l3=new JLabel("Nr.Dhomes");
        l3.setBounds(30,120,100,20);
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(200,120,150,30);
        add(t1);
        
         JLabel l4=new JLabel("Emri");
        l4.setBounds(30,160,100,20);
        add(l4);
        
          t2=new JTextField();
        t2.setBounds(200,160,150,30);
        add(t2);
        
         JLabel l5=new JLabel("regjistrimi");
        l5.setBounds(30,200,100,20);
        add(l5);
        
          t3=new JTextField();
        t3.setBounds(200,200,150,30);
        add(t3);
        
         JLabel l6=new JLabel("Shuma e Paguar");
        l6.setBounds(30,240,100,20);
        add(l6);
        
          t4=new JTextField();
        t4.setBounds(200,240,150,30);
        add(t4);
        
         JLabel l7=new JLabel("Shuma ne Pritje");
        l7.setBounds(30,280,100,20);
        add(l7);
        
          t5=new JTextField();
        t5.setBounds(200,280,150,30);
        add(t5);
        
        
        
        b1=new JButton("Kontrollo");
        b1.setBounds(30,350,100,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
          b2=new JButton("Ndrysho");
        b2.setBounds(170,350,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
          b3=new JButton("Kthehu");
        b3.setBounds(310,350,100,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/check.png"));
        JLabel l9=new JLabel(i1);
        l9.setBounds(400,50,500,300);
        add(l9);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(250,200,950,520);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
            try{
                String dhoma=null;
                String deposita=null;
                int shumapaguar;
                String qmimi=null;
                conn c=new conn();
                String kid=c1.getSelectedItem();
                String str="select * from klient where numri='"+kid+"'";
                ResultSet rs=c.s.executeQuery(str);
                while(rs.next()){
                    t1.setText(rs.getString("dhoma"));
                    t2.setText(rs.getString("emri"));
                    t3.setText(rs.getString("statusi"));
                    t4.setText(rs.getString("deposita"));
                    dhoma=rs.getString("dhoma");
                    deposita=rs.getString("deposita");
                }
                ResultSet rs2=c.s.executeQuery("select * from dhoma where nr_dhomes='"+dhoma+"'");
                while(rs2.next()){
                   qmimi =rs2.getString("qmimi");
                   shumapaguar=Integer.parseInt(qmimi) - Integer.parseInt(deposita);
                   t5.setText(Integer.toString(shumapaguar));
                }
            }catch(Exception e){}
            
        }else if(ae.getSource()==b2){
            
            try{
                conn c=new conn();
                
               
                String deposita=t4.getText();
                String kid=c1.getSelectedItem();
                String dhoma=t1.getText();
                String str="update klient set deposita='"+deposita+"',dhoma='"+dhoma+"' where kid='"+kid+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Statusi i kontrollit eshte ndryshuar");
                new Recepsioni().setVisible(true);
                this.setVisible(false);
            }catch(Exception e ){}
            
        }else if(ae.getSource()==b3){
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
        
    }
    public static void main(String[]args){
        new NdryshoniKontrollin().setVisible(true);
    }
}
