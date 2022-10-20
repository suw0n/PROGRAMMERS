package 히히_어_나이스;

import java.util.*;

public class Main {

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = {};
            for(int z = 0; z<commands.length; z++) {
                int m = 0;
                int[] a = new int[commands[z][1]-commands[z][0]+1];
                for(int i = commands[z][0]-1; i<commands[z][1]; i++)
                    a[m++] = array[i];
                Arrays.sort(a);
                answer[z] = a[commands[z][2]-1];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] c = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(s1.solution(a, c));
        Stack<Character> s = new Stack<>();
    }

}