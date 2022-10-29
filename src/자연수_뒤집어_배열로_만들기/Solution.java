package 자연수_뒤집어_배열로_만들기;

class Solution {
    public int[] solution(long n) {
        int i = 0;
        long m = n;
        while(n != 0){
            n/=10;
            i++;
        }
        int[] answer = new int[i];
        for(int j = 0; j<i; j++){
            answer[j] = (int)(m%10);
            m/=10;
        }

        return answer;
    }
}