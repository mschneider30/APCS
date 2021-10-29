/*
Max Schneider
APCS
HW27 -- For the love of Strings/Rof.java/tetsed recursion skills
2021-10-28
1.5
Disco:
Recursion can't call variables outside the function due to static rules
For loops >>>>>>> recursion (See time in header)
QCCs:
Is their a more clean way to recursion?
Can you circumvent the static non-static debate.

*/
public class Rof {
    public static String fenceF(int posts) {
          String fence = "|";
          for (int i = 1;i < posts; i++) {
               fence+="--|";
          }
          return fence;
          
    }
    public static String reverseF(String s) {
            if (s=="") {
                    return("Please enter non-empty string");
            }
            int sLength = s.length();
            String reversed = "";
            for(int i = 0; i < sLength; i++) {
                    int index = sLength - i;
                    String newLetter = s.substring(index-1,index);
                    reversed+=newLetter;
            }
            return reversed;
    }
    
    public static String reverseR(String s) {
        if (s=="") {
                    return("Please enter non-empty string");
            }
        int len = s.length();

        if (len == 1) { return s; }

        return s.substring(len - 1, len) + reverseR(s.substring(0, len - 1));
    }
    
    public static void main(String[] args) {
        System.out.println("Fence Testing: Should return 1 post then 2 posts then 3 posts");
        System.out.println(fenceF(1));
        System.out.println(fenceF(2));
        System.out.println(fenceF(3));
        
        System.out.println("ReverseF testing: Should return 'desserts' then 'tnasevyutS' then an error message asking for a non-empty string");
        System.out.println(reverseF("stressed"));
        System.out.println(reverseF("Stuyvesant"));
        System.out.println(reverseF(""));
        
        System.out.println("ReverseR testing: Should return 'desserts' then 'tnasevyutS' then an error message asking for a non-empty string");
        System.out.println(reverseR("stressed"));
        System.out.println(reverseR("Stuyvesant"));
        System.out.println(reverseR(""));
        
        
    }
}
