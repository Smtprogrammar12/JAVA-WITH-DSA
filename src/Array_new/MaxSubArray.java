package Array_new;

public class MaxSubArray {
    public  static  void maxsubarray(int nums[]){
        int currentsum =0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            currentsum += nums[i];
            if (currentsum < nums[i]) {
                currentsum = nums[i];
            }
            max = Math.max(max, currentsum);

        }
        System.out.print("Max number int element ;- " + max);
    }
    public static void main(String[] args) {
        int nums[] = {5,4,-1,7,8};
        maxsubarray(nums);
    }
}
