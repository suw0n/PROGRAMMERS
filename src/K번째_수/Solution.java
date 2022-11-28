package K번째_수;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        for(int i = 0; i<n; i++){
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            for(int j = commands[i][0]-1, k = 0; j<commands[i][1];)
                arr[k++] = array[j++];
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}