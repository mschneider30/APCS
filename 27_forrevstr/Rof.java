public class Rof {
    public static String fenceF(int posts) {
          String fence = "|";
          for (int i = 1;i < posts; i++) {
               fence+="--|";
          return fence;
          }
    }
    public static void main(String[] args) {
        System.out.println(fenceF(1));
        System.out.println(fenceF(2));
        System.out.println(fenceF(3));
    }
}
