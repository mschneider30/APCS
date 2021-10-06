/*
Max Schneider
APCS
HW 12 -- Where do BigSibs Come From?/BigSib.java/changed Greet.java file
2021 10 07
*/

/*
Disco: I discovered how to use a class as a blueprint for multiple instances. 
QCC: I am not sure how my code is putting together each line.
*/


public class Greet {
	public static void main( String[] args ) {
    		String greeting;

   		BigSib richard = new BigSib();

    		greeting = richard.greet("freshman");
    		System.out.println(greeting);
		
		
   		BigSib richard1 = new BigSib();
    		richard1.setHelloMsg("Salutations");

    		greeting = richard1.greet("Dr. Spaceman");
    		System.out.println(greeting);
		
		
   		BigSib richard2 = new BigSib();
    		richard2.setHelloMsg("Hey ya");

    		greeting = richard2.greet("Kong Fooey");
    		System.out.println(greeting);
		
		
   		BigSib richard3 = new BigSib();
    		richard3.setHelloMsg("Sup");

    		greeting = richard3.greet("mom");
    		System.out.println(greeting);
	}
}
