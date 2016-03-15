import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
