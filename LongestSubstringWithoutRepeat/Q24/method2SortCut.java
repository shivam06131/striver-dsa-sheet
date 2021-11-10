package LongestSubstringWithoutRepeat.Q24;

import java.util.HashMap;

public class method2SortCut {
    public static void main(String[] args) {
       // int val = solution("abcaabcdba");
       // int val2 = solution("bbbbb");
        int val3 = solution("pwwkew");
        System.out.println(val3);
    }
    static int solution(String s){
        int left = 0;
        int right = 0;
        int length = 0;
        HashMap<Character , Integer> hash = new HashMap<>();

        while(right < s.length()){
            if(hash.containsKey(s.charAt(right))){
                left = Math.max(left  , hash.get(s.charAt(right)) + 1);
            }
            hash.put(s.charAt(right) , right);
            length = Math.max(right - left + 1 , length);
            right++;
        }

        return length;
    }

}
