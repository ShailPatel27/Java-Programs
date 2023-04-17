package Lab;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class pr13 extends Frame implements ItemListener
{
    Choice c;
    Label l1;

    pr13()
    {
        c = new Choice();
        c.add("laptop");
        c.add("mouse");
        c.add("phone");
        c.add("keyboard");
        add(c);
        c.setBounds(50, 50, 100, 100);

        c.addItemListener(this); 
        l1 = new Label();
        l1.setBounds(50, 100, 300, 20);
        add(l1);

        setLayout(null);
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args)
    {
        new pr13();
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Connection conn = null;
        Statement stmt = null;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "");
            stmt = conn.createStatement();
        
            String selected = c.getSelectedItem();

            ResultSet rs = stmt.executeQuery("SELECT price FROM `product` WHERE name = '" + selected + "'");
            while(rs.next())
            {
                l1.setText("Price of "+ selected +" is: " + rs.getInt(1));
            }
            // String disp = (r.getInt(1)) + "";
            // l1.setText(c.getSelectedItem());
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}