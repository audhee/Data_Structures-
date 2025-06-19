/*Given an array of integers A and an integer target, 
    return indices of the two numbers such that they add up to target.
*/
public class Two_sum {
    public static int[] two_sum(int A[],int target) {
        // Brute force solution with T.C : O(n^2)
        // S.C : O(1)
        int result[] = new int[2];
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i] + A[j] == target){
                    // checks whether the sum of weo elements is equal to target or not
                    result[0] = i;
                    result[1] = j;
                    return result;
                    // immediately returns the array if the answer found out
                }
            }
        }
        return new int[] {};
        // It returns a null array if the result array has not been found
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int target = 3;
        int result[] = two_sum(A, target);
        System.out.println("The indices of the array which is equal to the target is >>> ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}