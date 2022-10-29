package x만큼_간격이_있는_n개의_숫자;

class Solution {
    public long[] solution(int x, int n) {
        int i = 1;
        long[] answer = new long[n];
        answer[0] = (long)x;
        for(; i<n; i++)
            answer[i] = (long)(answer[i-1]+x);
        return answer;
    }
}