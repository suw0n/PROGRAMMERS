package 두_개_뽑아서_더하기;

import java.util.*;

class Solution {

    public int[] solution(int[] numbers) {
        int n = numbers.length;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int m = numbers[i]+numbers[j];
                if(!l.contains(m))
                    l.add(m);
            }
        }
        int[] answer = new int[l.size()];
        for(int i = l.size()-1; i>=0; i--)
            answer[i] = l.get(i);
        Arrays.sort(answer);
        return answer;
    }

}