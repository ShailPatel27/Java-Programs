package Practice;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class j2 extends Frame implements ActionListener
{
    TextField row;
    Button btn;
    Label l1;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    j2()
    {
        row = new TextField();
        btn = new Button("Delete");
        l1 = new Label("Enter ID to delete");

        add(l1);
        add(row);
        add(btn);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);

        btn.addActionListener(this);
    }

    public static void main(String[] args)
    {
        new j2();     
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Connection conn = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting records into table...");

            PreparedStatement pst=conn.prepareStatement("delete from studinfo where id=?");

            int i = Integer.parseInt(row.getText() + "");

            pst.setInt(1, i);
            pst.executeUpdate();

            System.out.println("Records deleted successfully...");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Goodbye!!");
    }
}
