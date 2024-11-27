package Lab;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class pr12 extends JFrame implements ActionListener
{
    JTextField tb1, tb2;
    JLabel l1, l2, l3;
    JButton insert, update, delete;
    pr12()
    {
        l1 = new JLabel("ID");
        tb1 = new JTextField();
        l2 = new JLabel("Name");
        tb2 = new JTextField();
        insert = new JButton("Insert");
        update = new JButton("update");
        delete = new JButton("delete");
        l3 = new JLabel("");

        add(l1);
        add(tb1);
        add(l2);
        add(tb2);
        add(insert);
        add(update);
        add(delete);
        add(l3);

        l1.setBounds(300, 50, 50, 20);
        tb1.setBounds(350, 50, 100, 20);

        l2.setBounds(300, 80, 50, 20);
        tb2.setBounds(350, 80, 100, 20);

        insert.setBounds(250, 130, 80, 20);
        update.setBounds(350, 130, 80, 20);
        delete.setBounds(450, 130, 80, 20);

        l3.setBounds(350, 180, 100, 20);

        setSize(800, 800);
        setLayout(null);
        setVisible(true);

        insert.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
    }
    public static void main(String[] args) 
    {
        new pr12();   
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Connection conn = null;
        Statement stmt = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "");
            stmt = conn.createStatement();
            String sql = "";
            
            if(e.getSource() == insert)
            {
                sql = "insert into javadb values('" + tb1.getText() + "','" + tb2.getText() + "')";
            }
            else if(e.getSource() == update)
            {
                sql = "update javadb set name = '" + tb2.getText() + "' where id = '" + tb1.getText() + "'";
            }
            else if(e.getSource() == delete)
            {
                sql = "delete from javadb where id = '" + tb1.getText() + "'";
            }
            stmt.executeUpdate(sql);

            l3.setText("Query executed");
            Thread.sleep(1000);
            l3.setText("");
            
        }
        catch(Exception ex)
        {
            l3.setText("Error: " + ex.getMessage());
        }
    }
}