package Lab;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class prac12insert extends JFrame implements ActionListener {

    JButton b1;
    JTextField t1, t2;
    JLabel l1, l2;

    prac12insert() {
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        l1 = new JLabel("id");
        l2 = new JLabel("name");
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

        b1 = new JButton("Insert");
        b1.setBounds(20, 120, 100, 30);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e1) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "");
            PreparedStatement pst = con.prepareStatement("insert into javadb values (?,?)");
            pst.setInt(1, Integer.parseInt(t1.getText()));
            pst.setString(2, t2.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Query Executed :)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Query Not Executed :(");
        }
    }

    public static void main(String[] args) {
        new prac12insert();
    }
}