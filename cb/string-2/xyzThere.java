public class {
  
  public boolean xyzThere(String str) {
  for (int i = 0;i < str.length()-2;i++) {
    String Letters = str.substring(i,i+3);
    if (Letters.equals("xyz")) {
      if (i==0) {
        return true;
      } else if (!(str.substring(i-1,i).equals("."))){
        return true;
      }
    }
  }
  return false;
}

  
  public static void main(String args[]) {
    system.out.println(xyzThere("abcxyz"));
    system.out.println(xyzThere("abc.xyz"));
    system.out.println(xyzThere("xyz.abc"));
  }
}
