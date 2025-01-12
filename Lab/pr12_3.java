package Lab;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

/**
 *
 * @author arpit
 */
public class pr12_3 extends JFrame 
{
    JLabel lblName, lblSem,lblRollno;
    JTextField tfName, tfSem,tfRollno;
    JButton btnInsert,btnDelete,btnUpdate;

    pr12_3()
    {
        lblRollno=new JLabel("Roll No: ");
        lblName=new JLabel("Name: ");
        lblSem=new JLabel("Sem: ");
        lblRollno.setBounds(20, 20, 100, 25);
        lblName.setBounds(20, 50, 100, 25);
        lblSem.setBounds(20, 80, 100, 25);

        tfRollno=new JTextField(20);
        tfName=new JTextField(20);
        tfSem=new JTextField(20);
        tfRollno.setBounds(130, 20, 150, 25);
        tfName.setBounds(130, 50, 150, 25);
        tfSem.setBounds(130, 80, 150, 25);

        btnInsert=new JButton("INSERT");
        btnDelete=new JButton("DELETE");
        btnUpdate=new JButton("UPDATE");
        btnDelete.setBounds(260, 120, 100, 30);
        btnInsert.setBounds(20, 120, 100, 30);
        btnUpdate.setBounds(140, 120, 100, 30);

        setLayout(null);

        add(lblRollno);
        add(tfRollno);
        add(lblName);
        add(tfName);
        add(lblSem); 
        add(tfSem);
        add(btnInsert);
        add(btnUpdate);
        add(btnDelete);
        setSize(600,400);
        setVisible(true);
        
        btnInsert.addActionListener(new ActionListener()
        {
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    performQuery("Insert into Student(id,name) values('"+tfSem.getText()+"',"+tfName.getText()+")");
                }
                catch(Exception e1){}
            }
        });

        btnDelete.addActionListener(new ActionListener()
        {
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    performQuery("delete from Student where Rollno="+tfRollno.getText());
                }
                catch(Exception e1){}
            }
        });

        btnUpdate.addActionListener(new ActionListener()
        {
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performQuery("update Student set Name='"+tfName.getText()+"', Sem="+tfSem.getText()+" where Rollno="+tfRollno.getText());
            }
        });
    }
    
    public void performQuery(String query)
    {
        Connection con=null;
        Statement st=null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Query Executed :)");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Query Not Executed :(");
        }
    }
    public static void main(String[] args) {
        new pr12_3();
    }
}