package QuestionEleven;

//best time to buy and sell stock
public class solution {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7,6,4,3,1};
        int val = answer(arr2);
        System.out.println("val " + val);
    }

    static int answer(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (profit < arr[i] - min) {
                profit = arr[i] - min;
            }
        }
        return profit;
    }
}
