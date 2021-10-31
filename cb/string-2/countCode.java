public class countCode{
  
  public int countCode(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-3; i++) {
    String letters = str.substring(i,i+2);
    String letters2 = str.substring(i+3,i+4);
    if (letters.equals("co") && letters2.equals("e")) {
      counter++;
    }
  }
  return counter;
}

  
  public static void main(String args[]) {
    system.out.println(countCode("aaacodebbb"));
    system.out.println(countCode("codexxdoce"));
    system.out.println(countCode("cozexxcope"));
  }
}
