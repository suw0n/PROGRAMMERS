package 올바른_괄호;

import java.util.*;

class Solution {
    boolean solution(String s) {
        int n = s.length();
        boolean answer = true;
        Stack<Character> sk = new Stack<>();
        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='(')
                sk.push(s.charAt(i));
            else
            if(sk.empty() || sk.pop()=='('&&s.charAt(i)!=')')
                return false;
            answer = sk.empty()?true:false;
        }

        return answer;
    }
}