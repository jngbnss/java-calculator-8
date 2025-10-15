package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        Cal cal = new Cal(input);
        int result = cal.getRet();
        System.out.println("결과 : " + result);
    }
}
//예: "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
