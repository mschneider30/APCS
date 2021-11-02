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
    String b= Integer.toString(a);
    if (b.length() < 4) {
      return b;
    }
    String extract = b.substring(0,3);
    String remnants = b.substring(3,b.length());
    int remnantsI = Integer.parseInt(remnants);
    return (commafyR(remnantsI) + "," + extract);
  }
  public static void main(String[] args) {
    System.out.println(commafyF(10000000));
    System.out.println(commafyF(10000000));
    
    System.out.println(commafyF(100000));
    System.out.println(commafyF(100000));
    
    System.out.println(commafyF(10));
    System.out.println(commafyF(10));
  }
}
