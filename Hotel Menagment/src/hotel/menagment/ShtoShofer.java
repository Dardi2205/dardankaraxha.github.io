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
public class ShtoShofer extends JFrame implements ActionListener{
    
    
    JTextField t1,t2,t3,t4,t5;
    JComboBox j1,j2;
    JButton b1,b2;
    ShtoShofer(){
        JLabel titulli=new JLabel("Shto Shoferin");
        titulli.setFont(new Font("Tahoma",Font.BOLD,18));
        titulli.setBounds(150,10,150,30);
        add(titulli);
        
        JLabel emri=new JLabel("Emri");
        emri.setFont(new Font("Tahoma",Font.PLAIN,16));
        emri.setBounds(60,70,100,30);
        add(emri);
        
        t1=new JTextField();
        t1.setBounds(200,70,150,30);
        add(t1);
         JLabel mosha=new JLabel("Mosha");
        mosha.setFont(new Font("Tahoma",Font.PLAIN,16));
        mosha.setBounds(60,110,100,30);
        add(mosha);
        t2=new JTextField();
        t2.setBounds(200,110,150,30);
        add(t2);
         JLabel gjinia=new JLabel("Gjinia");
        gjinia.setFont(new Font("Tahoma",Font.PLAIN,16));
        gjinia.setBounds(60,150,100,30);
        add(gjinia);
        
        j1=new JComboBox(new String[]{"Mashkull","Femer"});
        j1.setBounds(200,150,150,30);
        j1.setBackground(Color.WHITE);
        add(j1);
        
         JLabel kompania=new JLabel("Kompania");
        kompania.setFont(new Font("Tahoma",Font.PLAIN,16));
        kompania.setBounds(60,190,100,30);
        add(kompania);
        t3=new JTextField();
        t3.setBounds(200,190,150,30);
        add(t3);
         JLabel brendi=new JLabel("Tipi i Makines");
        brendi.setFont(new Font("Tahoma",Font.PLAIN,16));
        brendi.setBounds(60,230,100,30);
        add(brendi);
        t4=new JTextField();
        t4.setBounds(200,230,150,30);
        add(t4);
        
         JLabel dispozicion=new JLabel("Disopozicioni");
        dispozicion.setFont(new Font("Tahoma",Font.PLAIN,16));
        dispozicion.setBounds(60,270,100,30);
        add(dispozicion);
        
        j2=new JComboBox(new String[]{"I Lire","I Nxene"});
        j2.setBounds(200,270,150,30);
        j2.setBackground(Color.WHITE);
        add(j2);
         JLabel lokacioni=new JLabel("Lokacioni");
        lokacioni.setFont(new Font("Tahoma",Font.PLAIN,16));
        lokacioni.setBounds(60,310,100,30);
        add(lokacioni);
        
        t5=new JTextField();
        t5.setBounds(200,310,150,30);
        add(t5);
        
        b1=new JButton("Shto");
        b1.setBounds(80,365,100,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("Hiqe");
        b2.setBounds(220,365,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/makina.jpeg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(370,20,500,400);
        add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(240,170,900,450);
        setVisible(true);
    }
    
    
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
            String emri=t1.getText();
            String mosha=t2.getText();
            String gjinia=(String)j1.getSelectedItem();
            String kompania=t3.getText();
            String brendi=t4.getText();
            String dispozicion=(String)j2.getSelectedItem();
            String lokacioni=t5.getText();
            
             conn c=new conn();
        try{
            String str="insert into shoferi values('"+emri+"','"+mosha+"','"+gjinia+"','"+kompania+"','"+brendi+"','"+dispozicion+"','"+lokacioni+"')";
            c.s.executeUpdate(str);
            
            JOptionPane.showMessageDialog(null,"Shoferi  eshte shtuar");
            this.setVisible(false);
        }catch(Exception e)
        {
            System.out.println(e);
        }
            
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }

    public static void main(String[]args){
        new ShtoShofer().setVisible(true);
    }
}
