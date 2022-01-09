package app;
class mainClass {
 public static void main(String[] args){
    GUI main = new GUI();   
    main.dispose();
  }
   public static String prime(int n){
        int m=n,c=0,i=1;
        do{
            if(m%i==0)
            c++;
            i++;
        }while(i<=m);
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
           return res;}
 }
   
    