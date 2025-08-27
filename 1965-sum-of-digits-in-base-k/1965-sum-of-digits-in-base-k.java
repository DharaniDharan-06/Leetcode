class Solution {
    public int sumBase(int n, int k) {
        String num = Integer.toString(n,k);
        int digit = Integer.parseInt(num);
        int sum = 0;
        while(digit!=0){
            int rem = digit%10;
            sum+=rem;
            digit/=10;
        }
        return sum;
    }
}