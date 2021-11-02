public class Commafier {
  public static String commafyF(int a) {
    String answer="";
    String simple = Integer.toString(a);
    char[] newStuff = simple.toCharArray();
    System.out.println(newStuff);
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
    
    System.out.println(commafyF(1));
    System.out.println(commafyR(1));
    
    System.out.println(commafyF(12));
    System.out.println(commafyR(12));
    
    System.out.println(commafyF(123));
    System.out.println(commafyR(123));
    
    System.out.println(commafyF(1234));
    System.out.println(commafyR(1234));
    
    System.out.println(commafyF(12345));
    System.out.println(commafyR(12345));
    
    System.out.println(commafyF(123456));
    System.out.println(commafyR(123456));
    
    System.out.println(commafyF(1234567));
    System.out.println(commafyR(1234567));
  }
}
