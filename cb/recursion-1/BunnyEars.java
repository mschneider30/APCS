public class BunnyEars {
  public int bunnyEars(int bunnies) {
    if (bunnies < 1) {
      return 0;
    }
    return 2 + bunnyEars(bunnies-1);
  }
  public static void main(String[] args) {
    System.out.println(bunnyEars(0));
    System.out.println(bunnyEars(1));
    System.out.println(bunnyEars(2));

  }

}
