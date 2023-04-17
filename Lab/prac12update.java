package Lab;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class prac12update extends JFrame implements ActionListener {

    JButton b1;
    JTextField t1, t2;
    JLabel l1, l2;

    prac12update() {
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        l1 = new JLabel("En_Roll");
        l2 = new JLabel("Name");
        l1.setBounds(20, 20, 100, 25);
        l2.setBounds(20, 50, 100, 25);
        add(l1);
        add(l2);

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t1.setBounds(130, 20, 150, 25);
        t2.setBounds(130, 50, 150, 25);
        add(t1);
        add(t2);

        b1 = new JButton("Update");
        b1.setBounds(20, 120, 100, 30);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e1) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate(
                    "update `student` set `id`='" + t1.getText() + "',`studentname`='" + t2.getText()
                            + "' WHERE `id`=4;");
            JOptionPane.showMessageDialog(null, "Query Executed :)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Query Not Executed :(");
        }
    }

    public static void main(String[] args) {
        new prac12update();
    }
}