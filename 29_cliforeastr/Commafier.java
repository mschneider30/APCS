public class Commafier {
  public static String commafyF(int a) {
    String answer="";
    String simple = Integer.toString(a);
    char[] newStuff = simple.toCharArray();
    int n = 0;
    int factor = a % 3;
    for (char s : newStuff) {
      n+=1;
      if (n % 3 == factor  && n != simple.length()) {
        answer = answer + s + ",";
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
    String remnants = b.substring(0,3);
    String extract = b.substring(3,b.length());
    int remnantsI = Integer.parseInt(remnants);
    return (commafyR(remnantsI) + "," + extract);
  }
  public static void main(String[] args) {
    System.out.println(commafyF(0));
    System.out.println(commafyR(0));
    
    System.out.println(commafyF(01));
    System.out.println(commafyR(01));
    
    System.out.println(commafyF(012));
    System.out.println(commafyR(012));
    
    System.out.println(commafyF(0123));
    System.out.println(commafyR(0123));
    
    System.out.println(commafyF(01234));
    System.out.println(commafyR(01234));
    
    System.out.println(commafyF(012345));
    System.out.println(commafyR(012345));
    
    System.out.println(commafyF(0123456));
    System.out.println(commafyR(0123456));
    
    System.out.println(commafyF(01234567));
    System.out.println(commafyR(01234567));
  }
}
