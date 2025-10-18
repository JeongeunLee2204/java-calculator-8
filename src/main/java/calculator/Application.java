package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String s = Console.readLine();

        if (s == null || s.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }

        String d = "[,:]";
        if (s.startsWith("//")) {
            int n = s.indexOf("\n");
            d = s.substring(2, n);
            s = s.substring(n + 1);
        }

        String[] arr = s.split(d);
        int sum = 0;
        for (String x : arr) sum += Integer.parseInt(x);
        System.out.println("결과 : " + sum);
    }
}
