package QuestionTwelve;
//Q. Rotate the matrix

// bruite force approch
public class methodOne {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution(input);
    }

    static void solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[j][col - 1 - i] = arr[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(temp[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}
