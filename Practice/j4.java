package Practice;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;

public class j4 extends JFrame implements ActionListener {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/selfp";

    static final String USER = "root";
    static final String PASS = "";

    JFrame jf;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JButton btnans, btnshow;
    ButtonGroup bg;
    TextArea ta;

    public j4() {

        jf = new JFrame();

        lbl1 = new JLabel("First Name: ");
        lbl1.setBounds(100, 100, 70, 40);

        lbl2 = new JLabel("Last Name: ");
        lbl2.setBounds(100, 130, 70, 40);

        lbl3 = new JLabel("Age: ");
        lbl3.setBounds(100, 160, 70, 40);

        lbl4 = new JLabel("City: ");
        lbl4.setBounds(100, 190, 70, 40);

        lbl5 = new JLabel("Address: ");
        lbl5.setBounds(100, 220, 70, 40);

        txt1 = new JTextField(6);
        txt1.setBounds(170, 100, 110, 30);

        txt2 = new JTextField(6);
        txt2.setBounds(170, 130, 110, 30);

        txt3 = new JTextField(6);
        txt3.setBounds(170, 160, 55, 30);

        txt4 = new JTextField(6);
        txt4.setBounds(170, 190, 85, 30);

        txt5 = new JTextField(6);
        txt5.setBounds(170, 220, 150, 50);

        btnans = new JButton("Submit");
        btnans.setBounds(50, 240, 250, 50);

        btnshow = new JButton("Show");
        btnans.setBounds(150, 300, 70, 40);

        ta = new TextArea(10, 50);

        // bg = new ButtonGroup();

        jf.add(lbl1);
        jf.add(txt1);
        jf.add(lbl2);
        jf.add(txt2);
        jf.add(lbl3);
        jf.add(txt3);
        jf.add(lbl4);
        jf.add(txt4);
        jf.add(btnans);
        jf.add(btnshow);
        jf.add(ta);

        btnans.addActionListener(this);
        btnshow.addActionListener(this);

        jf.setSize(700, 500);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);

    }

    public static void main(String[] args) {

        new j4();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnans) {
            Connection conn = null;
            Statement stmt = null;
            int n;
            String t;

            try {

                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                PreparedStatement pst = conn.prepareStatement("insert into prom values(?,?,?,?)");

                String f = txt1.getText();
                String s = txt2.getText();
                int a = Integer.parseInt(txt3.getText() + "");
                String c = txt4.getText();

                pst.setString(1, f);
                pst.setString(2, s);
                pst.setInt(3, a);
                pst.setString(4, c);

                pst.executeUpdate();

                System.out.println("Records inserted successfully...");
            } catch (Exception se) {
                se.printStackTrace();
            }
            System.out.println("Goodbye!!");

        } 
        else if (e.getSource() == btnshow) {
            Connection conn = null;
            Statement stmt = null;
            int n;
            String t;

            try {

                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                Statement s = conn.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM `prom`");
                String disp="";
                while (rs.next()) {
                    String display = (rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + "\n");
                    disp += display;
                }
                ta.setText(disp);
                System.out.println("Records inserted successfully...");
            } catch (Exception se) {
                se.printStackTrace();
            }
            System.out.println("Goodbye!!");

        }
    }
}