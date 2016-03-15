/**
 * LeetCode 283
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        for(;j<nums.length;j++){

            int num = nums[j];
            if(num!=0){
                if(i != j){
                    nums[i] = nums[j];
                    nums[j] = 0;

                }
                i++;
            }
        }
    }

    /**
     * 时间复杂度O(n2)
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        for(int j=0;j<nums.length;j++){
            int num = nums[j];
            if(num==0){
                for(int i=j;i<nums.length;i++){
                    int num2 = nums[i];
                    if(num2 != 0){
                        nums[j]=num2;
                        nums[i]=0;
                        break;
                    }
                }
            }
        }
    }
}
