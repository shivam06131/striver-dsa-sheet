package Question16;
import java.util.*;

//majority elements 1/3 times
//method one :- using Boyer more voting algorithm


public class method2 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        majorityElement(arr);
    }
    static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int count1 = 0;
        int count2 = 0;
        int val1 = -1;
        int val2 = -1;
        for(int ele : nums){
            if(ele == val1){
                count1++;
            }else if(ele == val2){
                count2++;
            }else if(count1 == 0){
                val1 = ele;
                count1++;
            }else if(count2 == 0){
                val2 = ele;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int countOne = 0;
        int countTwo =0;
        for(int ele : nums){
            if(val1 ==ele){
                countOne++;
            }else if(val2 == ele){
                countTwo++;
            }
        }
        int oneThird =nums.length / 3;
        if(countOne > oneThird){
            list.add(val1);
        }
        if(countTwo > oneThird){
            list.add(val2);
        }
        return list;
    }
}
