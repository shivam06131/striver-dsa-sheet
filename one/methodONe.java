package one;

public class methodONe {
    public static void main(String[] args) {
    int[] arr = {2,0,2,1,1,0};
    int[] val = solution(arr);
    for (int i=0;i<val.length;i++){
        System.out.print(val[i] + " | ");
    }
    }

    static int[] solution(int[] array) {
        int oneCount = 0;
        int zeroCount = 0;
        int twoCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
            if (array[i] == 1) {
                oneCount++;
            }
            if (array[i] == 2) {
                twoCount++;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            array[i] = 0;
        }
        for (int i = zeroCount; i < zeroCount + oneCount; i++) {
            array[i] = 1;
        }
        for (int i = oneCount + zeroCount; i < array.length; i++) {
            array[i] = 2;
        }
        return array;
    }
}
