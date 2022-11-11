package 문자열_다루기_기본;

class Solution {

    public boolean solution(String s) {
        int n = s.length();
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c<'0'||c>'9')
                return false;
        }
        return (n==4||n==6)?true:false;
    }
}