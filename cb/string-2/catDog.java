public class catDog{
  
  public boolean catDog(String str) {
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
    system.out.println(catDog("catdog"));
    system.out.println(catDog("catcat"));
    system.out.println(catDog("1cat1cadodog");
  }
}
