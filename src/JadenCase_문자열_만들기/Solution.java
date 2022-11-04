package JadenCase_문자열_만들기;

import java.util.*;

class Solution {

    public String solution(String s) {
        String re = "";
        int n = s.length();
        s = s.toLowerCase();
        re += s.charAt(0)>96?(char)(s.charAt(0)-32):s.charAt(0);
        for(int i = 1; i<n; i++){
            if(s.charAt(i)>96 && ' '==s.charAt(i-1))
                re += (char)(s.charAt(i)-32);
            else
                re += s.charAt(i);
        }
        return re;
    }

}