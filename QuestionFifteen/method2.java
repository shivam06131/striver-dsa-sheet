package QuestionFifteen;

public class method2 {
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int val =solution(arr);
        System.out.println(val);
    }

    static int solution(int[] array) {
        int count = 0;
        int element = 0;
        for (int x : array) {
            if (count == 0) {
                element = x;
            }
            if (x == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
