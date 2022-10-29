package 정수_제곱근_판별;



class Solution {
    public long solution(long n) {
        long a = (long)(Math.sqrt(n));
        long b = (long)(Math.sqrt(n)+1);

        return n==a*a?b*b:-1;
    }
}