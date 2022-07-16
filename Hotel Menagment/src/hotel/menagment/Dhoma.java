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
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class Dhoma extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    Dhoma() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/menagment/icons/bed.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(600, 540, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i1);
        icon.setBounds(490, -20, 700, 550);
        add(icon);

        JLabel l1 = new JLabel("Nr_Dhomes");
        l1.setBounds(10, 10, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Dispozicioni");
        l2.setBounds(110, 10, 100, 20);
        add(l2);

        JLabel l3 = new JLabel("Pastertia");
        l3.setBounds(210, 10, 100, 20);
        add(l3);

        JLabel l4 = new JLabel("Qmimi");
        l4.setBounds(310, 10, 100, 20);
        add(l4);

        JLabel l5 = new JLabel("Tipi Shtratit");
        l5.setBounds(410, 10, 100, 20);
        add(l5);

        t1 = new JTable();
        t1.setBounds(0, 40, 500, 400);
        add(t1);

        b1 = new JButton("Shiko");
        b1.setBounds(100, 460, 120, 30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Kthehu");
        b2.setBounds(260, 460, 120, 30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(200, 160, 1000, 550);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            try {
                conn c = new conn();
                String str = "select * from dhoma";
                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {

            }

        } else if (ae.getSource() == b2) {
            new Recepsioni().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dhoma().setVisible(true);
    }
}
