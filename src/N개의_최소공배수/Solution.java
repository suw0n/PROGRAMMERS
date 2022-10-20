package N개의_최소공배수;

class Solution {
    public int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public int solution(int[] arr) {
        int n = arr[0];
        for(int i = 1; i<arr.length; i++)
            n = arr[i]*n/gcd(n, arr[i]);
        return n;
    }
}