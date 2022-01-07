import java.util.*;
public class app2 
{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=1;
           do {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int m=Math.abs(n),c=0;
            while (m!=0) {
                int d = m%100;
                if (d==69) {
                    c=1;
                    break;
                }
               m/=10; 
            }
            System.out.println(c==1?"Nice":"Not Nice");
            System.out.println("Enter 1 to run again");
             op = sc.nextInt();
            } while (op==1);
            sc.close();  }}
