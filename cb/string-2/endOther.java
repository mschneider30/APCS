public class endOther{
  
  public static boolean endOther(String a, String b) {
  if (a.length() > b.length()) {
  String Letters2 = a.substring(a.length()-b.length(),a.length());
  Letters2 = Letters2.toLowerCase();
  if (Letters2.equals(b.toLowerCase())) {
    return true;
  }
  }
  else {
  String Letters = b.substring(b.length()-a.length(),b.length());
  Letters = Letters.toLowerCase();
  if (Letters.equals(a.toLowerCase())) {
    return true;
  }
  }
  return false;
}
  
  public static void main(String args[]) {
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc","abXabc"));
  }
}
