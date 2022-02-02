package app;

class mainClass {

  public static void main(String[] args) {
    GUI main = new GUI();
    main.dispose();
  }

  public static String prime(int n) {
    int m = n, c = 0, i = 1;
    do {
      if (m % i == 0) c++;
      i++;
    } while (i <= m);
    return (c == 2 ? "Prime" : "Not Prime") + "\n";
  }

  public static String Automorphic(int n) {
    int sq = n * n, k = 0, m = n;
    while (m != 0) {
      k++;
      m /= 10;
    }
    int r = sq % (int) Math.pow(10, k);
    return (r == n ? "Automorphic" : "Not Automorphic") + "\n";
  }

  public static String Palindrome(int n) {
    int m = n, r = 0;
    while (m != 0) {
      int d = m % 10;
      r = r * 10 + d;
      m /= 10;
    }
    return (r == n ? "Palindrome" : "Not palindrome") + "\n";
  }

  public static String EvenDigit(int n) {
    int m = n, c = 0;
    while (m != 0) {
      int d = m % 10;
      if (d % 2 == 0) {
        c++;
      }
      m /= 10;
    }
    return "Number of even digits = " + c + "\n";
  }

  public static String OddDigit(int n) {
    int m = n, c = 0;
    while (m != 0) {
      int d = m % 10;
      if (d % 2 == 1) {
        c++;
      }
      m /= 10;
    }
    return "No of Odd digits =" + c + "\n";
  }

  public static String SumOfEvenDigits(int n) {
    int m = n, s = 0;
    while (m != 0) {
      int d = m % 10;
      if (d % 2 == 0) s = s + d;
      m /= 10;
    }
    return "Sum of Even digits = " + s + "\n";
  }

  public static String SumOfOddDigits(int n) {
    int m = n, s = 0;
    while (m != 0) {
      int d = m % 10;
      if (d % 2 == 1) s = s + d;
      m /= 10;
    }
    return "Sum of odd digits =" + s + "\n";
  }

  public static String SumOfDigits(int n) {
    int m = n, s = 0;
    while (m != 0) {
      int d = m % 10;

      s = s + d;
      m /= 10;
    }
    return "Sum of digits = " + s + "\n";
  }

  public static String SpyNumber(int n) {
    int m = n, s = 0, p = 1;
    while (m != 0) {
      int d = m % 10;
      s += d;
      p *= d;
      m /= 10;
    }
    return (s == p ? "Spy Number" : "Not Spy Number") + "\n";
  }

  public static String Niven(int n) {
    int m = n, s = 0;
    while (m != 0) {
      int d = m % 10;
      s += d;
      m /= 10;
    }
    return (n % s == 0 ? "Niven number" : "Not Niven Number") + "\n";
  }

  public static String Neon(int n) {
    int m = n * n, s = 0;
    while (m != 0) {
      int d = m % 10;
      s += d;
      m /= 10;
    }
    return (s == n ? "Neon number" : "Not Neon Number") + "\n";
  }

  public static String Buzz(int n) {
    return (
      ((n % 7 == 0) || (n % 10 == 7) ? "Buzz Number" : "Not A Buzz Number") +
      "\n"
    );
  }

  public static String pronic(int n) {
    int f = 0;
    for (int i = 1; i <= n; i++) {
      if (i * (i + 1) == n) {
        f = 1;
        break;
      }
    }
    return (f == 1 ? "Pronic" : "Not Pronic") + "\n";
  }

  public static String Special(int n) {
    int m = n, s = 0;
    while (m != 0) {
      int d = m % 10;
      int f = 1;
      for (int i = 1; i <= d; i++) {
        f *= i;
      }
      s += f;
      m /= 10;
    }
    return (s == n ? "Special" : "Not Special") + "\n";
  }
}
