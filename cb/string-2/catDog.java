public class catDog{
  
  public static boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  for (int i = 0;i < str.length()-2;i+=1) {
    String letters = str.substring(i,i+3);
    if (letters.equals("cat")) {
      cat++;
    } else if (letters.equals("dog")) {
      dog++;
    }
  }
  if (dog == cat) {
    return true;
  } else {
    return false;
  }
}
  
  public static void main(String args[]) {
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
  }
}
