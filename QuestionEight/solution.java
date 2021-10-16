package QuestionEight;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        List<List<Integer>> val = pascleTraingleSolution(5);
        System.out.println(val);
        //val.toArray();
        //   for (int i =0;i<5;i++){
        //     for (int j = 0;j<=i;j++){
        //         System.out.println(val.get(i ,j));
        //    }
        // }
    }

    static List<List<Integer>> pascleTraingleSolution(int number_of_rows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> Current_Row, previous = null;
        for (int i = 0; i < number_of_rows; i++) {
            Current_Row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    Current_Row.add(1);
                } else {
                    Current_Row.add(previous.get(j - 1) + previous.get(j));
                }
            }
            previous = Current_Row;
            result.add(Current_Row);
        }
        return result;
    }
}
