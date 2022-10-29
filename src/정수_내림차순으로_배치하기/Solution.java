package 정수_내림차순으로_배치하기;

import java.util.*;

class Solution {
    public long solution(long n) {
        int cnt = 0;
        long m = n, re = 0;
        while(m != 0){
            cnt++;
            m/=10;
        }
        long[] arr = new long[cnt--];
        while(n != 0){
            arr[cnt--] = n%10;
            n/=10;
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0; i--)
            re = re*10+arr[i];

        return re;
    }
}