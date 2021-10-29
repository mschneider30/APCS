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
            int sLength = s.length();
            if (s=="") {
                    return("Please enter non-empty string");
            }
            String reversed = "";
            if (reversed.length() == sLength) {
                    return(reversed);
            }
            reversed+=s.substring(sLength-1,sLength);
            return(reverseR(s.substring(1,sLength), reversed));
    }
    public static String reverseR(String s, String reversed) {
            int sLength = s.length();
            if (s=="") {
                    return("Please enter non-empty string");
            }
            if (reversed.length() == sLength) {
                    return(reversed);
            }
            reversed+=s.substring(sLength-1,sLength);
            return(reverseR(s.substring(1,sLength), reversed));
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
