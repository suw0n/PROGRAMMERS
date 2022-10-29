package 제일_작은_수_제거하기;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length<2)
            return new int[]{-1};
        int n = arr.length, minn = 0;
        for(int i = n-1; i>0; i--)
            if(arr[minn]>arr[i])
                minn = i;
        int[] re = new int[arr.length-1];
        for(int i = 0, j = 0; i<n; i++)
            if(minn != i)
                re[j++] = arr[i];
        return re;
    }
}