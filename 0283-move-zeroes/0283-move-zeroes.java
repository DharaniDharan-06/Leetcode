class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
              arr[pos]=nums[i];
              pos++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}