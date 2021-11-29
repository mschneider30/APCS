public class foo {
int test = 100;
public static void alter (int g) {
g= g * 2;
}
public static void main (String[] args) {
foo tester = new foo();
System.out.print("Original: ");
System.out.println(tester.test);
tester.alter(tester.test);
System.out.print("After change: ");
System.out.println(tester.test);
}
}
