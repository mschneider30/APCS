public class Rational {
  private int numerator;
  private int denominator;

  public Rational (){
    numerator = 0;
    denominator = 1;
  }
  public Rational (int a, int b) {
    numerator=a;
    denominator=b;
  }

  public String toString() {
    return ("(" + numerator + ", " + denominator + ")");
  }
  public float floatValue () {
    return (float)numerator/(float)denominator;
  }
  public void multiply (Rational r) {
    this.numerator=this.numerator*r.numerator;
    this.denominator=this.denominator*r.denominator;
  }
  public void divide (Rational r) {
    this.numerator=this.numerator*r.denominator;
    this.denominator=this.denominator*r.numerator;
  }
  public static void main(String[] args) {
    Rational r1 = new Rational();
    Rational r2 = new Rational(1,2);
    Rational r3 = new Rational(1,3);

    System.out.println(r1.toString());
    System.out.println(r2.toString());
    System.out.println(r3.toString());

    System.out.println(r1.floatValue());
    System.out.println(r2.floatValue());
    System.out.println(r3.floatValue());

    r2.multiply(r3);
    System.out.println(r2.toString());

    r3.divide(r2);
    System.out.println(r3.toString());
  }
}
