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
        String res =  c==2?"Prime":"Not Prime";
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
           String res = r==n?"Automorphic":"Not Automorphic";
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
    public static String SpyNumber(int n){
      int m=n, s= 0, p=1;
      while(m!=0){
          int d = m%10;
          s+=d;
          p*=d;
          m/=10;
      }
      String res = s==p?"Spy Number":"Not Spy Number";
      res = res +"\n";
      return res;
    }
    public static String Niven(int n){
    int m = n, s= 0;
    while (m!=0) {
        int d = m%10;
        s+=d;
        m/=10;
    }
    String res = n%s==0?"Niven number":"Not Niven Number";
    res = res +"\n";
    return res;
    }
    public static String Neon(int n){
        int m = n*n,s=0;
        while (m!=0) {
            int d = m%10;
            s +=d;
            m/=10;
        }
        String res = s==n?"Neon number":"Not Neon Number";
        res = res+"\n";
        return res;
    }
    public static String Buzz (int n){
        String res = (n%7==0)||(n%10==7)?"Buzz Number":"Not A Buzz Number";
        res = res+"\n";
        return res;
    }
    public static String pronic(int n){
        int f = 0;
        for (int i =1;i<=n;i++){
         if(i*(i+1)==n){
             f=1;
             break;
         }
        }
        String res = f==1?"Pronic":"Not Pronic";
        res = res +"\n";
        return res;
    }
    public static String Special(int n){
        int m=n,s = 0;
       while (m!=0) {
           int d = m%10;
           int f=1;
           for (int i = 1; i<=d;i++) {
               f*=i;
           }
           s+=f;
           m/=10;
       }
       String res = s==n?"Special":"Not Special";
       res = res+"\n";
       return res;
    }
 }
   
    