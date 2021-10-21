package QuestionThirteen;
//Q. search in 2D matrix

//solution :- check every last column and if last column in greater than target then do a binary search on that row
public class methodOne {
    public static void main(String args[]) {
        int[][] array = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] arrayTwo = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] arrThree = {{1}};
        System.out.println(solution(arrThree, 1));

    }

    static boolean solution(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        boolean found = false;
        int i = 0;
        int index = -1;
        while (!found && i<row) {
            if (arr[i][col - 1] >= target) {
                found = true;
                index = i;
            }
            i++;
        }
        if (index < 0) {
            return false;
        }
        if(arr[index][col-1]==target){
            return true;
        }
        int low = 0, high = col;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[index][mid] == target) {
                return true;
            }
            if (target > arr[index][mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
