package 문자열_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        int a = 0, b = 0;
        for(int i = s.length()-1; i>=0; i--){
            a = s.charAt(i)=='p'||s.charAt(i)=='P'?a+1:a;
            b = s.charAt(i)=='y'||s.charAt(i)=='Y'?b+1:b;
        }
        return a==b?true:false;
    }
}