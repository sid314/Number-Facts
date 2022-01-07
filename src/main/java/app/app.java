package app;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class GUI implements ActionListener {
    JFrame frame;
    JButton button;
    JPanel panel;
    JLabel inputLabel;
    JTextField inputtf;
    JTextField outputtf;
    JLabel outputLabel;
    JTextArea output;
    String res = "";
    public static void main(String[] args){
    GUI app = new GUI();
  }
    public static String prime(int n){
        int m=n,c=0,i=1;
        do{
            if(m%i==0)
            c++;
            i++;
        }while(i<=m);
        System.out.println(c==2?"Prime":"not prime");
        String res =  c==2?"Prime":"not prime";
        res = res +"\n";
        return res;
    }
    public static String Automorphic(int n){
        int sq= n*n, k = 0, m=n;
           while(m!=0){
               k++;
               m/=10;
           }
           int r = sq%(int)Math.pow(10,k);
           String res = r==n?"automorphic":"not automorphic";
           res = res+"\n";
           return res;
    }
    public static String Palindrome(int n){
        int m= n,r=0;
        while(m!=0){
            int d= m%10;
            r= r*10+d;
            m/=10;
        }
        String res = r==n?"Palindrome":"Not palindrome";
        res = res+"\n";
           return res;
    }
    public static String EvenDigit(int n){
        int m =n, c= 0;
        while(m!=0){
            int d = m%10;
            if(d%2==0){
                c++;
               
            }
            m/=10;
        }
        String res = "Number of even digits = "+ c;
        res = res+"\n";
           return res;
    }
    public static String OddDigit(int n){
        int m =n, c= 0;
        while(m!=0){
            int d = m%10;
            if(d%2==1){
                c++;    
            }
            m/=10;
        }
        String res = "No of Odd digits ="+ c;
        res = res+"\n";
           return res;
    }
    public static String SumOfEvenDigits(int n){
        int m =n, s= 0;
        while(m!=0){
            int d = m%10;
            if(d%2==0)
            s=s+d;
            m/=10;
        }
        String res = "Sum of Even digits = "+ s;
        res = res+"\n";
           return res;
    }
    public static String SumOfOddDigits(int n){
        int m =n, s= 0;
        while(m!=0){
            int d = m%10;
            if(d%2==1)
            s=s+d;
            m/=10;
        }
        String res = "Sum of odd digits ="+ s;
        res = res+"\n";
           return res;

    }
    public static String SumOfDigits(int n){
        int m =n, s= 0;
        while(m!=0){
            int d = m%10;
            
            s=s+d;
            m/=10;
        }
        String res = "Sum of digits = "+ s;
        res = res+"\n";
           return res;

    }
 
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

         res = res + prime(n)+ SumOfEvenDigits(n)+SumOfDigits(n)+SumOfOddDigits(n)+Automorphic(n)+ Palindrome(n)+EvenDigit(n)+OddDigit(n);
         output.append(res);
          }
        }