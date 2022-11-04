package 약수의_개수와_덧셈;

class Solution {

    static int f(int n) {
        int re = 0;
        for(int i = 1; i<=n; i++)
            if(n%i==0)
                re++;
        return re;
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int n = f(i);
            if(n%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
}