package _2016년;

import java.time.LocalDate;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate Date = LocalDate.of(2016, a, b);
        String result = Date.getDayOfWeek().toString();
        switch (result) {
            case "MONDAY":
                result = "MON";
                break;
            case "TUESDAY":
                result = "TUE";
                break;
            case "WEDNESDAY":
                result = "WED";
                break;
            case "THURSDAY":
                result = "THU";
                break;
            case "FRIDAY":
                result = "FRI";
                break;
            case "SATURDAY":
                result = "SAT";
                break;
            case "SUNDAY":
                result = "SUN";
                break;
        }
        int[] c = new int[33];

        return result;
    }
}