class Solution {
    public int divisorSubstrings(int num, int k) {
        String nums = String.valueOf(num);
        int count = 0;
            for(int j=0;j<=nums.length()-k;j++){
             String sb = nums.substring(j,j+k);
             int res = Integer.parseInt(sb);
            if(res!=0 && num%res==0){
              count++;
              }
            }
        return count;
    }
}