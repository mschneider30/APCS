public class midThree {
  public int[] midThree(int[] nums) {
    int[] fresh = new int[3];
    fresh[0]=nums[(nums.length-1)/2 -1];
    fresh[1]=nums[(nums.length-1)/2 ];
    fresh[2]=nums[(nums.length-1)/2 +1];
    return fresh;
  }
}
