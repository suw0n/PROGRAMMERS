package 나누어_떨어지는_숫자_배열;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]%divisor==0){
                l.add(arr[i]);
                cnt++;
            }
        }
        if(cnt==0)
            return new int[]{-1};
        int[] re = new int[l.size()];
        Collections.sort(l);
        for(int i = 0, j = l.size(); i<j; i++)
            re[i] = l.get(i);
        return re;
    }
}