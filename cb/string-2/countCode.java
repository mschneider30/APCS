public class countCode{
  
  public static int countCode(String str) {
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
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxdoce"));
    System.out.println(countCode("cozexxcope"));
  }
}
