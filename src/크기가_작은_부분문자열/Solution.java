package 크기가_작은_부분문자열;

class Solution {
    public int solution(String t, String p) {
        int n = t.length(), m = p.length(), answer = 0;
        long k = Long.parseLong(p);
        for(int i = 0; i<=n-m; i++){
            long l = Long.parseLong(t.substring(i, i+m));
            answer = k>=l?answer+1:answer;
        }
        return answer;
    }
}