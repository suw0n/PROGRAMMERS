package 없는_숫자_더하기;

class Solution {

    public int solution(int[] numbers) {
        int re = 0;
        int[] arr = new int[10];
        for(int i = numbers.length-1; i>=0; --i)
            ++arr[numbers[i]];
        for(int i = 1; i<10; ++i)
            re = arr[i]<1?re+i:re;
        return re;
    }
}