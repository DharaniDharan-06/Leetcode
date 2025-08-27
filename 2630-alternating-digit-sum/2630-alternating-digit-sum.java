class Solution {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int osum = 0;
        int esum = 0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            int nn = ch-'0';
            if(i%2==0){
                esum+=nn;
            }
            else{
                osum+=nn;
            }
        }
        return esum-osum;
    }
}