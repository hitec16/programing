package CodingInterviewBook.ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,3,4,2};
       int[] arr = twoSum(nums,4);

    }
    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        String s = "";
        s.charAt()
        Character.isLetterOrDigit();
        StringBuilder builder = new StringBuilder();
        builder.toString()
    }
}
