package PracAss2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pr10 extends JFrame implements ActionListener 
{
   JLabel numLabel, resultLabel;
   JTextField numField, resultField;
   JButton factButton, primeButton;

   public pr10() 
   {
      Font font = new Font("Segoe UI Semibold", Font.BOLD, 20);
      
      setTitle("pr10 Shail");
      setLayout(new GridLayout(3, 2));
      
      numLabel = new JLabel("Enter a number:");
      numField = new JTextField(10);
      factButton = new JButton("Get Factorial");
      primeButton = new JButton("Check Prime");
      resultLabel = new JLabel("Result:");
      resultField = new JTextField(10); 
      
      add(numLabel);
      add(numField);
      add(factButton);
      add(primeButton);
      add(resultLabel);
      add(resultField);
      
      factButton.addActionListener(this);
      primeButton.addActionListener(this);
      
      setSize(300, 150);
      setVisible(true);
      setFont(font);
   }
   public void actionPerformed(ActionEvent e) 
   {
      int num = Integer.parseInt(numField.getText());
      if(e.getSource() == factButton) 
      {
         int fact = factorial(num);
         resultField.setText(Integer.toString(fact));
      } 
      else if (e.getSource() == primeButton) 
      {
        boolean isPrime = checkPrime(num);
        resultField.setText(Boolean.toString(isPrime));
      }
   }
   int factorial(int n) 
   {
      if (n == 0) 
      {
        return 1;
      } 
      else 
      {
        return n * factorial(n - 1);
      }
   }
   boolean checkPrime(int n) 
   {
      if (n <= 1) 
      {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) 
      {
        if (n % i == 0) 
        {
           return false;
        }
      }
      return true;
   }
   public static void main(String[] args) 
   {
      new pr10();
   }
}