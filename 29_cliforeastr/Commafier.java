public class Commafier {
  public static String commafyF(int a) {
    String answer="";
    String [] newStuff = Integer.toString(a);
    int n = 0;
    for (String s : newStuff) {
      n+=1;
      if (n % 3 == 0) {
        answer = "," + s + answer;
      } else {
        answer = s + answer;
      }
   }
   return answer;
  }
  public static void main(String[] args) {
    System.out.println(commafyF(10000000));
  }
}
