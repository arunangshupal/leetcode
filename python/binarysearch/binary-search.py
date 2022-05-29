from typing import List

'''
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
'''


class BinarySearch:
    def _search(self, nums: List[int], target: int, start: int, end: int) -> int:
        if start > end:
            return -1
        mid = ((start + end) / 2).__int__()
        if nums[mid] == target:
            return mid
        elif nums[mid] > target:
            return self._search(nums, target, start, mid-1)
        else:
            return self._search(nums, target, mid+1, end)

    def search(self, nums: List[int], target: int) -> int:
        return self._search(nums, target, 0, len(nums) - 1)


if __name__ == '__main__':
    print(BinarySearch().search([-1, 0, 3, 5, 9, 12], 102))
