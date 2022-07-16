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
import java.awt.event.*;

public class ShtoDhoma extends JFrame implements ActionListener{
JTextField t1,t2;
JComboBox j1,j2,j3;
JButton b1,b2;
    ShtoDhoma() {
        JLabel l1 = new JLabel("Shto dhoma");
        l1.setFont(new Font("Tahoma", Font.BOLD, 18));
        l1.setBounds(200, 20, 150, 20);

        add(l1);

        JLabel room = new JLabel("Numri i dhomes");
        room.setFont(new Font("Tahoma", Font.PLAIN, 16));
        room.setBounds(60, 80, 150, 30);
        add(room);

        
        t1=new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);
        
        
        
        
           JLabel available = new JLabel("Dispozicion");
        available.setFont(new Font("Tahoma", Font.PLAIN, 16));
        available.setBounds(60, 140, 120, 30);

        add(available);
        
        j1=new JComboBox(new String[]{"Dispozicion","JoDispozicion"});
        j1.setBounds(200,140,150,30);
        j1.setBackground(Color.WHITE);
        add(j1);
        
          JLabel sta = new JLabel("Statusi i pastertise");
        sta.setFont(new Font("Tahoma", Font.PLAIN, 16));
        sta.setBounds(60, 200, 150, 30);

        add(sta);
        
        j2=new JComboBox(new String[]{"Paster","PaPaster"});
        j2.setBounds(200,200,150,30);
          j2.setBackground(Color.WHITE);
        add(j2);
         JLabel qmimi = new JLabel("Qmimi");
        qmimi.setFont(new Font("Tahoma", Font.PLAIN, 16));
        qmimi.setBounds(60, 260, 120, 30);

        add(qmimi);
        
        t2=new JTextField();
        t2.setBounds(200,260,150,30);
        add(t2);
        
        
            JLabel tipi = new JLabel("Tipi i shtratit");
        tipi.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tipi.setBounds(60, 320, 120, 30);

        add(tipi);
        
        j3=new JComboBox(new String[]{"Shtrat 1-she","Shtrat 2-she"});
        j3.setBounds(200,320,150,30);
          j3.setBackground(Color.WHITE);
        add(j3);
        
        
        b1=new JButton("Shto");
        b1.setBounds(100,395,100,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
          b2=new JButton("Hiqe");
        b2.setBounds(250,395,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/bed.jpeg"));
       JLabel i5=new JLabel(i1);
       i5.setBounds(400,30,450,350);
       add(i5);
       
       
       
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(240, 170, 880, 490);
        setLayout(null);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1){
        String dhoma=t1.getText();
        String dispozicion=(String)j1.getSelectedItem();
        String statusi=(String)j2.getSelectedItem();
        String qmimi=t2.getText();
        String tipi=(String)j3.getSelectedItem();
        
        conn c=new conn();
        try{
            String str="insert into dhoma values('"+dhoma+"','"+dispozicion+"','"+statusi+"','"+qmimi+"','"+tipi+"')";
            c.s.executeUpdate(str);
            
            JOptionPane.showMessageDialog(null,"Dhoma e re eshte shtuar");
            this.setVisible(false);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
}else if(ae.getSource()==b2){
    this.setVisible(false);
}
} 
    public static void main(String[] args) {
        new ShtoDhoma().setVisible(true);
    }
}
