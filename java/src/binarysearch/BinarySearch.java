package binarysearch;

/**
 * https://leetcode.com/problems/binary-search/
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch {

    private int search(int[] nums, int target, int start ,int end) {
        if (start > end ){
            return -1;
        }
        int mid = (start + end)/2;
        if (nums[mid] == target) {
            return mid;
        } else if ( nums[mid] > target) {
            return search(nums, target, start, mid-1);
        } else {
            return search(nums, target, mid+1, end);
        }
    }
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }

    public static void main(String[] args) {
        int []nums = new int[]{-1,0,3,5,9,12};
        int target = 2;
        System.out.println(new BinarySearch().search(nums, target));

    }
}
