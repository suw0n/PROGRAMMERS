package 평균_구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = arr.length-1; i>=0; i--)
            answer+=arr[i];
        return answer/arr.length;
    }
}