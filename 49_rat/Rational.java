public class Rational implements Comparable{
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
    return ("(" + numerator + " / " + denominator + ")");
  }

  public void add (Rational r) {
    Rational dummy2 = new Rational(r.numerator,r.denominator);
    Rational dummy = new Rational(this.numerator,this.denominator);
    this.numerator*=r.denominator;
    this.denominator*=r.denominator;
    dummy2.numerator*=dummy.denominator;
    dummy2.denominator*=dummy.denominator;
    this.numerator+=dummy2.numerator;
  }


  public void subtract (Rational r) {
    Rational dummy2 = new Rational(r.numerator,r.denominator);
    Rational dummy = new Rational(this.numerator,this.denominator);
    this.numerator*=r.denominator;
    this.denominator*=r.denominator;
    dummy2.numerator*=dummy.denominator;
    dummy2.denominator*=dummy.denominator;
    this.numerator-=dummy2.numerator;
  }

  public int GCD () {
    int a = this.numerator;
    int b = this.denominator;
    int c = 1;
    int answer = 0;
    while (c <= a) {
      if (a%c==0 && b%c==0) {
        answer=c;
        }
      c++;
      }
    return answer;
  }

  public void reduce () {
    int divisor = this.GCD();
    this.numerator /= divisor;
    this.denominator /= divisor;
  }

  public int compareTo (Object r) {
    if (!( r instanceof Rational)) {
      throw new Error();
    }
    Rational dummy = new Rational(this.numerator, this.denominator);
    dummy.subtract((Rational)r);
    return dummy.numerator;
  }

  public boolean equals(Object r) {
    return (compareTo(r) == 0);
  }

}
