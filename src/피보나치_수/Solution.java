package 피보나치_수;

class Solution {
    static int dp[] = new int[100010];
    public int solution(int n) {
        if(n<2)
            return n;
        else if(dp[n] != 0)
            return dp[n]%1234567;
        return dp[n] = (solution(n-1)+solution(n-2))%1234567;
    }
}