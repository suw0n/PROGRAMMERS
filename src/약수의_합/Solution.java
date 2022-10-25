package 약수의_합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++)
            answer = n%i==0?answer+i:answer;
        return answer;
    }
}