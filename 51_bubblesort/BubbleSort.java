public class BubbleSort {
  public static void bubbleSort(int[] a) {
    while (x < a.length && y != 0) {
      int y = 0;
      for (int x = a.length-1; x > 0; x --) {
        if (a[x] < a[x-1]) {
          int dummy = a[x];
          a[x] = a[x-1];
          a[x-1] = dummy;
          y+=1;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] p = {7,1,5,12,3};
    bubbleSort(p);
    System.out.println(p);
  }
}
