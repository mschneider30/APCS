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
	while (bob.equalsCtr < 10) {
		bob.flip();
		steve.flip();
		if (bob.upFace == steve.upFace) {
			bob.equalsCtr+=1;
		}
	}
	System.out.println(bob.flipCtr + " flips before reaching 10 matches");
	  
	Coin birth = new coin();
	Coin birth2 = new coin();
	while (birth.equalsCtr > 65536 && birth.equalsCtr % 2005 == 0) {
		birth.flip();
		birth2.flip();
		if (birth.upFace == birth2.upFace) {
			birth.equalsCtr++;
		} 
	}
	System.out.println(birth.flipCtr + " flips before reaching 10 matches");
      /*===================BOTTOM======================*/

  }//end main()

}//end class
