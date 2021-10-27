/*
Swag Trio: Max Schneider, Jason Yang, Michael Kamela
APCS
HW26 -- GCD Three Ways/Stats.java/Created 3 methods for determining GCD
2021-10-27
.4
*/

public class Stats {
  public static int gcd( int a , int b) {
      int c = 0;
      int answer = d;
      while (c <= a) {
        if (a%c==0 && b%c==0) {
          d=c;
          }
        c++;
        }
      return d;
  }
  public static int gdcER (int a , int b) {
      if (a==b) {
        return a;
      }
      else if (a>b) {
        return gdcER(a-b,b);
      } else {
        return gdcER(a,b-a);
  }
  public static int gdcEW (int a, int b) {
      while (a!=b) {
        if (a > B) {
          a-=b;
        } else {
          b-=a;
        }
      }
      return a
      
