/**
 * LeetCode 238
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Solve it without division and in O(n).
 *
 * For example, given [1,2,3,4], return [24,12,8,6].
 *
 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[res.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--) {
            res[i] = res[i+1] * nums[i+1];
        }

        int left = 1;
        for(int i=0; i<nums.length; i++) {
            res[i] *= left;
            left *= nums[i];
        }
        return res;
    }

    /**
     * 相比{@link #productExceptSelf}代码不够清晰
     * @param nums
     * @return
     */
    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int left =1;
        int right =1;
        int[] lefts = new int[nums.length];
        int[] rights = new int[nums.length];
        for(int i =0,j=nums.length-1; i<nums.length&&j>=0;i++,j--){
            if(i!=0){
                left *= nums[i-1];
            }
            lefts[i] = left;
            if(j!=nums.length-1){
                right *= nums[j+1];
            }
            rights[j] = right;
        }

        for(int i=0;i<nums.length;i++){
            result[i] = lefts[i] * rights[i];
        }
        return result;
    }
}
