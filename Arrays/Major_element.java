/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
 */
public class Major_element{
    public static int majorityElement(int nums[]) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1,1,1};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
