package QuestionEight;

import java.util.ArrayList;
import java.util.List;

public class by_own {
    public static void main(String[] args) {
        List<List<Integer>> val = solution(5);
        System.out.println(val);
    }

    static List<List<Integer>> solution(int number_of_rows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current_row, previous_row = null;
        for (int i = 0; i < number_of_rows; i++) {
            current_row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    current_row.add(1);
                } else {
                    current_row.add(previous_row.get(j - 1) + previous_row.get(j));
                }
            }
            System.out.println("current_row " + current_row);
            previous_row = current_row;
            result.add(current_row);
        }
        return result;
    }
}
