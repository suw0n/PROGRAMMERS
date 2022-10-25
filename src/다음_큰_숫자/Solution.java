package 다음_큰_숫자;

class Solution {

    static int f(int a){
        int cnt = 0;
        while(true){
            if(a%2==1)
                cnt++;
            a/=2;
            if(a%2==0&&a/2==0)
                break;
        }
        return cnt;
    }

    public int solution(int n) {
        int cnt = f(n);
        for(int i = n+1; ; i++)
            if(cnt==f(i))
                return i;
    }
}