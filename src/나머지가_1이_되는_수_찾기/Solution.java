package 나머지가_1이_되는_수_찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i<n; i++)
            if(n%i==1)
                return i;
        return n-1;
    }
}