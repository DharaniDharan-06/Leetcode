class Solution {
    public int minOperations(int[] nums) {
        int start=0;
        int end=2;
        int count=0;
        while(end<nums.length)
        {
            if(nums[start]==1)
            {
                start++;
                end++;
            }
            else
            {
                count++;
                nums[start]=nums[start]^1;
                nums[start+1]=nums[start+1]^1;
                nums[end]=nums[end]^1;
                start++;
                end++;
            }
        }
        if(nums[nums.length-1]==0 || nums[nums.length-2]==0) return -1;
        return count;
    }
}