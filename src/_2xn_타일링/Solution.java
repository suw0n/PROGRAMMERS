package _2xn_타일링;

class Solution {
    static int[] dp = new int[60000];
    public int f(int a){
        if(a<2)
            return a;
        else if(dp[a] != 0)
            return dp[a]%1000000007;
        return dp[a] = (f(a-1)+f(a-2))%1000000007;
    }
    public int solution(int n) {
        return f(n+1);
    }
}