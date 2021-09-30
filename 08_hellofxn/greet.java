/* 
Thusly:
void greet(string) goes not work. You need static to void greet. TYou also need to specify variable types.
*/

public class Greet {
	static void greet(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		greet("My My, what a surprise");

		System.out.println();

		alternateGreet();
	}
}
