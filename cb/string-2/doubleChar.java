
public class doubleChar {
  public String doubleChar(String str) {
  int i=0;
  String s;
  s = "";
  while (i < str.length()) {
    s+=str.substring(i,i+1);
    s+=str.substring(i,i+1);
    i++;
  }
  return s;
}
public static void main(String args[]) {
  System.out.println(doubleChar("The"));
  System.out.println(doubleChar("AAbb"));
  System.out.println(doubleChar("Hi-There"));
}
}
