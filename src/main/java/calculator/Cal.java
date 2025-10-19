package calculator;

public class Cal {
    private int ret;
    private int temp;
    private String input;

    public Cal(String input) {
        this.input = input;

        String numbers = input;

        for (char c : numbers.toCharArray()) { // 문자열은 바로 character로 순회 못함
            if (c == ',' || c == ':') {
                ret += temp;
                temp = 0;
            } else if (Character.isDigit(c)) {
                temp = temp * 10 + (c - '0'); // 여러 자리 숫자도 처리 가능
            }
        }
        ret += temp;
    }

    public int getRet() {
        return ret;
    }// 이게 필요한가?
}