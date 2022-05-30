package binarysearch;


/**
 * https://leetcode.com/problems/search-insert-position/
 * 35. Search Insert Position
 * Easy
 *
 * 7954
 *
 * 415
 *
 * Add to List
 *
 * Share
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {

    private int searchInsert(int[] nums, int target, int start ,int end) {

        int mid = (start + end)/2;
        //System.out.println(start+ " " + mid + " " + end);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target && nums[mid+1] >= target) {
            return mid + 1;
        } else if ( nums[mid] < target && nums[mid+1] < target)  {

            return searchInsert(nums, target,mid, end);
        } else {
            return searchInsert(nums, target,start, mid);
        }
    }
    public int searchInsert(int[] nums, int target) {
        if ( target <= nums[0]){
            return 0;
        } else if ( target > nums[nums.length-1]){
            return nums.length;
        } else {
            return searchInsert(nums, target, 0, nums.length - 1);
        }
    }
    public static void main(String[] args) {
        int []nums = new int[]{-1,0,3,5,9,12};
        int target = -13;
        System.out.println(new SearchInsertPosition().searchInsert(nums, target));
    }
}
