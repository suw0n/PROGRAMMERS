package 서울에서_김서방_찾기;

class Solution {
    public String solution(String[] seoul) {
        for(int i = seoul.length-1; i>=0; i--)
            if(seoul[i].equals("Kim"))
                return "김서방은 " + i + "에 있다";
        return "0";
    }
}