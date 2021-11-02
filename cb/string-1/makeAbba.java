public class makeAbba{
  public static String makeAbba(String a, String b) {
  String greeting = a+b+b+a;
  return greeting;
}
  public static void main(String[] args) {
    System.out.println(makeAbba("hi", "Bye"));
    System.out.println(makeAbba("Yo", "Alice"));
    System.out.println(makeAbba("What", "Up"));
  }
}
