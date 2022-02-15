// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs
 public class GroupSum {
   public boolean groupSum(int start, int[] nums, int target) {
     if (start >= nums.length) {
       return target == 0;
     }
     if(groupSum(start + 1, nums, target - nums[start])) {
       return true;
     }
     if(groupSum(start + 1, nums, target )) {
       return true;
     }
     return false;

   }
  public static void main(String[] args) {
   System.out.println(groupSum(0, [2,4,8], 10));
   System.out.println(groupSum(0, [2,4,8], 14));
   System.out.println(groupSum(0, [2,4,8], 9));
  }
 }
