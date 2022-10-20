package 콜라츠의_추측;

class Solution {
    public int solution(int num) {
        int ans = 0;
        long n = (long)num;
        while(n != 1){
            if(n%2==0)
                n/=2;
            else
                n = n*3+1;
            ans++;
            if(n != 1 && ans>500){
                ans = -1;
                break;
            }
        }

        return ans;
    }
}