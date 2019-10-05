package CodingInterviewBook.ArraysAndString;

import java.util.ArrayList;
import java.util.List;

/*Given a set of distinct integers, nums, return all possible subsets (the power set).
* https://www.youtube.com/watch?v=LdtQAYdYLcE*/
public class SubsetsArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.subsets(nums);
        System.out.print("[],"); //empty
        for (List<Integer> l : list) {
            for (int i : l) {
                System.out.print("[" + i + "],");
            }
            System.out.println("");
        }
    }

    private static class Solution {

        private List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            generateSubsets(0, subsets, new ArrayList<Integer>(), nums);
            return subsets;
        }

        private void generateSubsets(int index, List<List<Integer>> subsets, List<Integer> current, int[] nums) {
            subsets.add(new ArrayList<>(current));

            for (int i = index; i < nums.length; i++) {
                current.add(nums[i]);
                generateSubsets(i + 1, subsets, current, nums);
                current.remove(current.size() - 1);
            }
        }
    }
}
