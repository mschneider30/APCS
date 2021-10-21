public class Stats {

    public static int mean(int a, int b) {
      return ((a + b) / 2);

  }
 
    public static double mean(double a, double b) {
        return ((a + b) / 2.0);
  }

    public static int max(int a, int b) {
        if (a == b) {
            return a;
        }   else if (a > b) {
            return a;
        }   else{
            return b;
        }
  }
 
    public static double max(double a, double b) {
          if (a == b) {
            return a;
        }   else if (a > b) {
            return a;
        }   else{
            return b;
        }
  }
   
    public static int geoMean(int a, int b) {
        return ((int) Math.sqrt(a * b));
  }

    public static double geoMean(double a, double b) {
        return Math.sqrt(a * b);
  }
   
    public static int max(int a, int b, int c) {
        return (Math.max(a, Math.max(b, c)));
  }
 
    public static double max(double a, double b, double c) {
        return (Math.max(a, Math.max(b, c)));
  }
