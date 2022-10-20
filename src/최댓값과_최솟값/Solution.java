package 최댓값과_최솟값;

import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        int n, min = 999999999, max = -999999999;
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            n = Integer.parseInt(st.nextToken());
            min = min>n?n:min;
            max = max<n?n:max;
        }
        String answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}