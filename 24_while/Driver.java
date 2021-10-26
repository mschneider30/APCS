/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {
  public static void main( String[] args ) {
      Coin first = new Coin("First coin");
	while (first.headsCtr < 10) {
		first.flip();
	}
	System.out.println(first);
	

	Coin bob = new Coin("Bob Coin");
	Coin steve = new Coin("Steve Coin");
	d=0;
	while (d < 10) {
		bob.flip();
		steve.flip();
		if (bob.upFace == steve.upFace) {
			d+=1;
		}
	}
	System.out.println(bob.flipCtr + "s before reaching 10 matches");
      /*===================BOTTOM======================*/

  }//end main()

}//end class
