/*
DM Sliders - Max, StillDavid
APCS
HW 14 -- Customize Your Creation/BigSib.java/changed BigSib.java file
2021 10 08
*/

/*
Disco: I discovered how to use a constructor with and without inputs. I also discovered 20+ ways not to use constructors from unsuccessfully trying to diversify the messages in overcon.
QCC: How do you invoke the name of an object?
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
