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
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener {
    
    JMenuBar mb;
    JMenu n1,n2;
    JMenuItem i1,i2,i3,i4;
    Dashboard(){
        mb=new JMenuBar();
        add(mb);
        
        n1=new JMenu("Menagjimi i Hotelit");
        n1.setForeground(Color.RED);
           mb.add(n1);
           n2=new JMenu("ADMIN");
           n2.setForeground(Color.BLUE);
           mb.add(n2);
           i1=new JMenuItem("Recepcioni");
           i1.addActionListener(this);
           n1.add(i1);
           i2=new JMenuItem("Shto Puntoret");
           i2.addActionListener(this);
           n2.add(i2);
           i3=new JMenuItem("Shto Dhomat");
           i3.addActionListener(this);
           n2.add(i3);
           i4=new JMenuItem("Shto Shoferat");
           i4.addActionListener(this);
           n2.add(i4);
           
           mb.setBounds(0,0,1380,30);
           
           ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/dubai.jpeg"));
           Image i2=i1.getImage().getScaledInstance(1400,710,Image.SCALE_DEFAULT);
           ImageIcon i3=new ImageIcon(i2);
           
           JLabel l1=new JLabel(i3);
           l1.setBounds(0,0,1400,710);
           add(l1);
           
        
           JLabel l2=new JLabel("Dardan Resort,Mir se Vini");
           l2.setBounds(450,50,900,50);
           l2.setForeground(Color.WHITE);
           l2.setFont(new Font("Tahoma",Font.PLAIN,40));
           l1.add(l2);
           
          
           
       
           
       
    
     
    
           setLayout(null);
           setBounds(-10,20,1400,700);
           setVisible(true);
           
           
           
          
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Recepcioni")){
            new Recepsioni().setVisible(true);
        }else if(ae.getActionCommand().equals("Shto Puntoret")){
            new ShtPuntor().setVisible(true);
        }else if(ae.getActionCommand().equals("Shto Dhomat")){
            new ShtoDhoma().setVisible(true);
        }else if(ae.getActionCommand().equals("Shto Shoferat")){
            new ShtoShofer().setVisible(true);
        }
    }
    public static void main(String[]args){
        new HotelMenagment().setVisible(true);
    }
}
