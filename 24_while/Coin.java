/*
Max Schneider and Paul Serbanescu
APCS
HW24 -- Get It While You Can/Coin.java/Used inctance variables and a driver file to simulate coin flips
2021-10-25
.6

Discos:
The importance of using or not and in conditionals when really meaning and
the importance of public instance variables
the importance of understanding code before trying it
The importance of incremental coding

QCCs:
Can you use recursion to make this better?
Is there a reason not ot make all the instance varrs public from the beginning?

Mods:
changed protection of instance variables
added equalsCtr variable
changed constructors to be more concise
changed reset, equals, and toString to make them better for the Driver.
 */

public class Coin {

  //attributes aka instance vars
  private double value;
  public String upFace;
  private String name;
  public int flipCtr;
  public int headsCtr;
  private int tailsCtr;
  private double bias;

  public int equalsCtr;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
	reset( "heads" , 0.5);
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
	this();
	name = s;
	assignValue(s);
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
	this(s);
	upFace=nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
	  return upFace;
  }

  public int getFlipCtr() {
	  return flipCtr;
  }

  public double getValue() {
	  return value;
  }

  public int getHeadsCtr() {
	  return headsCtr;
  }

  public int getTailsCtr() {
	  return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	if (s.equals("penny")) {
		value = 0.01;
	} else if (s.equals("nickel")) {
	 	value = 0.05;
	} else if (s.equals("dime")) {
	 	value = 0.10;
	} else if (s.equals("quarter")) {
	 	value = 0.25;
	} else if (s.equals("dollar")) {
	 	value = 1.00;
	} 
	 return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
   	upFace = s;
   	bias = d;
	flipCtr = 0;
	tailsCtr = 0;
	headsCtr = 0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    double a = Math.random();
    if (a > bias) {
      upFace = "tails";
      tailsCtr++;
    } else {
      upFace = "heads";
      headsCtr++;
    }
    flipCtr++;
    return upFace;
		
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    if (upFace == other.upFace) {
	    return true;
    } else {
	    return false;
	    }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return "" + name + " has flipped " + flipCtr + " times before reaching heads "+ headsCtr + " times";
  }

}//end class
