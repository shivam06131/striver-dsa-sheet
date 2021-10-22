package QuestionFourteen;

public class solution {
    public static void main(String[] args) {

        System.out.println(solution(3, 10));
    }

    static double solution(double x, int n) {
        long nn = n;
        double answer = 1.0;
        if(n==0){
            return 1;
        }
        if (n < 0) {
            nn = nn * -1;
        }
        while (nn > 1) {
            if (nn % 2 == 1) {
                answer = answer * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) {
            answer =  answer * x;
            return 1 /answer;
        }
        return answer * x;
    }
}
