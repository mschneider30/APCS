public class Commafier {
  public static String commafyF(int a) {
    String answer="";
    String simple = Integer.toString(a);
    char[] newStuff = simple.toCharArray();
    int n = 0;
    for (char s : newStuff) {
      n+=1;
      if (n % 3 == 0) {
        answer = answer + "," + s;
      } else {
        answer += s;
      }
   }
   return answer;
  }
  public static String commafyR (int a) {
    a= Integer.toString(a);
    if (a.length() < 4) {
      return a;
    }
    String extract = a.substring(0,3);
    String remnants = a.substring(3,a.length());
    return (commfyR(remnants) + "," +extract)
  }
  public static void main(String[] args) {
    System.out.println(commafyF(10000000));
    System.out.println(commafyF(10000000));
  }
}
