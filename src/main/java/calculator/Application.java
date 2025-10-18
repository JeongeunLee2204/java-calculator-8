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
            if (n == -1) throw new IllegalArgumentException("잘못된 구분자 형식");
            d = s.substring(2, n);
            s = s.substring(n + 1);
        }

        String[] arr = s.split(d);
        int sum = 0;
        for (String x : arr) {
            if (x.isEmpty()) continue;
            int v;
            try {
                v = Integer.parseInt(x);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아님: " + x);
            }
            if (v < 0) throw new IllegalArgumentException("음수 불가: " + x);
            sum += v;
        }

        System.out.println("결과 : " + sum);
    }
}
