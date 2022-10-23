package 문자열을_정수로_바꾸기;

class Solution {
    public int solution(String s) {
        int i = s.charAt(0)=='+'||s.charAt(0)=='-'?1:0, answer = 0;
        for(; i<s.length(); i++)
            answer = answer*10+(s.charAt(i)-'0');
        return s.charAt(0) == '-' ? answer*-1:answer;
    }
}