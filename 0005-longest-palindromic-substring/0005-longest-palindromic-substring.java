class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        String str = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
             str=s.substring(i,j+1);
            if(ispalin(str) && str.length()>longest.length())
            longest = str;
            }
        }
        return longest;
    }
        private boolean ispalin(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
            return true;
    }
}