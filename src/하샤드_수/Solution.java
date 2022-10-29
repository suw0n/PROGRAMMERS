package 하샤드_수;

class Solution {
    public boolean solution(int x) {
        int n = 0, y = x;
        while(y != 0){
            n+=y%10;
            y/=10;
        }

        return x%n==0?true:false;
    }
}