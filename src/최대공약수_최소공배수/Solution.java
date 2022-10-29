package 최대공약수_최소공배수;

class Solution {

    static int f(int a, int b){
        if(b==0)
            return a;
        return f(b, a%b);
    }

    public int[] solution(int n, int m) {
        int a = f(n, m);
        return new int[]{a, n/a*m};
    }
}