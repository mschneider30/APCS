/*
DM Sliders - Max, StillDavid
APCS
HW 14 -- Customize Your Creation/BigSib.java/changed BigSib.java file
2021 10 08
*/

/*
Disco: I discovered how to use a constructor. This led to many problems stemming from not knowing how to take the print statement out of the setHelloMsg method. However, I figured it out by creating a seperate method and returning the full sentence there. 
QCC: I don't know how to to use setHelloMsg without an if statement.
*/


public class Greet {
	public static void main( String[] args ) {
 		String greeting;
 		BigSib richard = new BigSib("Word up");
 		BigSib grizz = new BigSib("Hey ya");
 		BigSib dotCom = new BigSib("Sup");
 		BigSib tracy = new BigSib("Salutations");
 		greeting = richard.greet("freshman");
 		System.out.println(greeting);
 		greeting = tracy.greet("Dr. Spaceman");
 		System.out.println(greeting);
 		greeting = grizz.greet("Kong Fooey");
 		System.out.println(greeting);
 		greeting = dotCom.greet("mom");
 		System.out.println(greeting);
	}
}
