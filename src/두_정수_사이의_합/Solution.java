package 두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        long answer = 0;
        for(int i = a; i<=b; i++)
            answer += (long)i;
        return answer;
    }
}