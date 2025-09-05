class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int pair1 = nums[0]*nums[1];
        int pair2 = nums[nums.length-1]*nums[nums.length-2];
        return Math.abs(pair1-pair2);
    }
}