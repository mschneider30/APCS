public class helloName{
  public static String helloName(String name) {
  String greeting = "Hello " + name +"!";
  return greeting;
  }
  public static void main(String[] args) {
    System.out.println(helloName("Bob"));
    System.out.println(helloName("Alice"));
    System.out.println(helloName("X"));
  }
}
