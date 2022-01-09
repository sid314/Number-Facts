package app;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.*;
//import app.mainClass;

public class GUI extends JFrame implements ActionListener{
    JFrame frame;
    JButton button;
    JPanel panel;
    JLabel inputLabel;
    JTextField inputtf;
    JTextField outputtf;
    JLabel outputLabel;
    JTextArea output;
    String res = "";
    public  GUI(){
        //frame
        frame = new JFrame("Number Properties");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //button
        button = new JButton("Submit");
        //panel
        panel = new JPanel(); 
        //label
        inputLabel = new JLabel("Enter a number");
        
        //text field
        inputtf = new JTextField(10); // characters accepted
        
        //text area
        output = new JTextArea();

       // Components Added using Flow Layout
       
        panel.add(inputLabel); 
        panel.add(inputtf);
        panel.add(button);
        panel.add(output);
        //allignment
        frame.getContentPane().add(BorderLayout.CENTER, panel);
   
        frame.setVisible(true);

      
        
        
        button.addActionListener(this);
    }
    @Override
    
        public void actionPerformed(ActionEvent e) {
            int n=Integer.parseInt(inputtf.getText());
    
             res = res + mainClass.prime(n)+ mainClass.SumOfEvenDigits(n)+mainClass.SumOfDigits(n)+mainClass.SumOfOddDigits(n)+mainClass.Automorphic(n)+ mainClass.Palindrome(n)+mainClass.EvenDigit(n)+mainClass.OddDigit(n);
             output.append(res);
              
        
    }
    
  
}
