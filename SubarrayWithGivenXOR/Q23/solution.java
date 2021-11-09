package SubarrayWithGivenXOR.Q23;

//Problem Description
//
//Given an array of integers A and an integer B.
//
//Find the total number of subarrays having bitwise XOR of all elements equals to B.

// Input :- A = [4, 2, 2, 6, 4]
//          k = 6

//Output :- 4

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int val = solution(arr , 6);
        System.out.println(val);
    }

    static int solution(int[] arr, int k) {
        int count = 0;
        int xor = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            if (xor == k) {
                count++;
            }
            if (hash.containsKey(xor)) {
                hash.put(xor, hash.get(xor) + 1);
            } else {
                hash.put(xor, 1);
            }
            int y = xor ^ k;
            if (hash.containsKey(y)) {
                count += hash.get(y);
            }
        }
        return count;
    }
}
