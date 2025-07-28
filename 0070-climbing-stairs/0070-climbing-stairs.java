class Solution {
    public int climbStairs(int n) {
        if(n <= 2)return n;
	    int a=1,b=2,count=0;
	    for (int i=3;i<=n;i++) {
	        count=a+b;
	        a=b;
	        b=count;
	    }
	    return count;
    }
}