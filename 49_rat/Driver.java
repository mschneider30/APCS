public class Driver{
  public static void main(String[] args) {
    Rational test0 = new Rational(2, 3);
    Rational test1 = new Rational(2, 3);
    Rational test2 = new Rational(2, 3);
    String r = "hewbgaugrew";

    System.out.println(test0.equals(test1));
    System.out.println(test0.equals(test2));
    test0.compareTo(r);
  }
}
