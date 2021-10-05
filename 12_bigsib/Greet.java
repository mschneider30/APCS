/*
Max Schneider
APCS
HW 12 -- On Elder Individuality And the Elimination of Radio Fuzz/BigSib.java/changed Greet.java file
2021 10 06
*/

public class Greet {
	public static void main( String[] args ) {
    		String greeting;

   		BigSib richard = new BigSib();
    		richard.setHelloMsg("Word up");

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
