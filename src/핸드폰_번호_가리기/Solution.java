package 핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        int n = phone_number.length();
        String ans = "";
        for(int i = 0; i<n; i++){
            if(i<n-4)
                ans += "*";
            else
                ans += phone_number.charAt(i);
        }

        return ans;
    }
}