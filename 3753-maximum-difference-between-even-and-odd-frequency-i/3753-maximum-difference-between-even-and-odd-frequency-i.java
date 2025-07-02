class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0) continue;
            if(freq[i]%2 == 0) even=Math.min(even,freq[i]);
            else odd=Math.max(odd,freq[i]);
        }
        return odd-even;
    }
}