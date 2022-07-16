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
import java.awt.event.*;

public class ShtPuntor extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JRadioButton r1,r2;
    JComboBox j1;
    JButton b1,b2;
    ShtPuntor(){
        JLabel emri=new JLabel("Emri");
        emri.setBounds(60,30,120,30);
        emri.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(emri);
        t1=new JTextField();
        t1.setBounds(200,30,150,30);
        add(t1);
         JLabel mosha=new JLabel("Mosha");
        mosha.setBounds(60,80,120,30);
        mosha.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(mosha);
        t2=new JTextField();
        t2.setBounds(200,80,150,30);
        add(t2);
          JLabel gjinia=new JLabel("Gjinia");
        gjinia.setBounds(60,130,120,30);
        gjinia.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(gjinia);
       r1=new JRadioButton("Mashkull");
       r1.setFont(new Font("Tahoma",Font.PLAIN,12));
       r1.setBounds(200,130,70,30);
       r1.setBackground(Color.WHITE);
       add(r1);
        r2=new JRadioButton("Femer");
       r2.setFont(new Font("Tahoma",Font.PLAIN,12));
       r2.setBounds(280,130,70,30);
       r2.setBackground(Color.WHITE);
       add(r2);
          JLabel puna=new JLabel("Puna");
        puna.setBounds(60,180,120,30);
        puna.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(puna);
        String str[]={"Menagjer","Recepsionist","Pastrus","Kuzhinier","Kamarier","Shofer"};
        j1=new JComboBox(str);
        j1.setBounds(200,180,150,30);
        j1.setBackground(Color.WHITE);
        add(j1);
        
           JLabel rroga=new JLabel("Rroga");
        rroga.setBounds(60,230,120,30);
        rroga.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(rroga);
        t3=new JTextField();
        t3.setBounds(200,230,150,30);
        add(t3);
        
         JLabel numri=new JLabel("Numri");
        numri.setBounds(60,280,120,30);
        numri.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(numri);
        t4=new JTextField();
        t4.setBounds(200,280,150,30);
        add(t4);
        
        
        
         JLabel email=new JLabel("Email");
        email.setBounds(60,330,120,30);
        email.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(email);
        t5=new JTextField();
        t5.setBounds(200,330,150,30);
        add(t5);
        
        b1=new JButton("Shto");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150,400,120,30);
        b1.addActionListener(this);
        add(b1);
        
          b2=new JButton("Hiqe");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350,400,120,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/puntor.png"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i1);
        l1.setBounds(380,80,500,300);
        add(l1);
        
        JLabel l2=new JLabel("Shto detajet e puntoreve");
        l2.setForeground(Color.BLUE);
        l2.setBounds(420,30,400,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(l2);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(300,170,800,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        String emri=t1.getText();
        String mosha=t2.getText();
        String rroga=t3.getText();
        String numri=t4.getText();
        String email=t5.getText();
        
        String gjinia = null;
        
        if(r1.isSelected())
        {
            gjinia="Mashkull";
        }else if
                (r2.isSelected())
                {
            gjinia="Femer";
        }
        String puna=(String) j1.getSelectedItem();
        conn c=new conn();
        String str="INSERT INTO hotel_db.puntoret VALUES('"+emri+"','"+mosha+"','"+gjinia+"','"+puna+"','"+rroga+"','"+numri+"','"+email+"')";
        try{
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Puntori i ri eshte shtuar");
            this.setVisible(false);
            
            
        
            
        }catch(Exception e){
            System.out.println(e);
        }
    }else if(ae.getSource()==b2){
        this.setVisible(false);
    }
    }
    
    public static void main(String[]args){
        new ShtPuntor().setVisible(true);
    }
    
}
