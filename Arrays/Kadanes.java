/*
 * Given an integer array nums, 
 * find the subarray with the largest sum, and return its sum.
 */

public class Kadanes {
    public static int kadane(int nums[],int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,-1,-2};
        int n = nums.length;
        int result = kadane(nums, n);
        System.out.println(result);
    }
}
