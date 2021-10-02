public class Time {
  public static void main(String[] args) {
    int seconds = 30;
    int minutes = 48;
    int hours = 15;
    System.out.print("Number of seconds since midnight:");
    System.out.println(seconds + minutes * 60 + hours *60*60);
    System.out.print("Number of seconds until midnight:");
    System.out.println(60*60*24-seconds + minutes * 60 + hours *60*60);
    System.out.print("Percentage of day passed:"); 
    System.out.println((seconds + minutes * 60 + hours *60*60)/(60*60*24));
    }
    }
