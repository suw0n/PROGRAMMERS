package 같은_숫자는_싫어;

import java.util.*;

public class Solution {

    public int[] solution(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i = 1; i<n; i++)
            if(s.peek()!=arr[i])
                s.push(arr[i]);
        int[] answer = new int[s.size()];
        for(int i = answer.length-1; i>=0; i--)
            answer[i] = s.pop();
        return answer;
    }
}