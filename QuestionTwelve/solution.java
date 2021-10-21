package QuestionTwelve;
//Q. Rotate Matrix

//Method 2 --> stepONe ==> transpose the marix
//             stepTwo ==> reverse all rows

public class solution {
    public static void main(String args[]) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        solution(input);
    }

    static void solution(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        int mid = col / 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < mid; j++) {
                int temp = array[i][col - 1 - j];
                array[i][col - 1 - j] = array[i][j];
                array[i][j] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" | " + array[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}
