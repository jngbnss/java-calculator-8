package calculator;

public class Cal {
    private int ret;
    private int temp;
    private String input;

    public Cal(String input) {
        this.input = input;

        //커스텀 구분자 있는지 확인
        char customDelimiter = 0;//0이면 기본 구분자 사용
        String numbers = input;

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\\n");
            if (newlineIndex == -1) { // 인덱스 위치가 없거나 2번째인 경우 3번째에 개행이 시작되어야함
                throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");
                // test input = //\n1,2 or //;;\n1,2
            }
            customDelimiter = input.charAt(2); //와 \n 사이의 문자
            numbers = input.substring(newlineIndex + 2); //숫자 부분만 남기기 1말고 2로받기
        }

        for (char c : numbers.toCharArray()) { // 문자열은 바로 character로 순회 못함
            if (c == ',' || c == ':' || (customDelimiter != 0 && c == customDelimiter)) {
                ret += temp;
                temp = 0;
            } else if (Character.isDigit(c)) {
                //temp = Integer.parseInt(c);
                //temp = c - '0';
                temp = temp * 10 + (c - '0'); // 여러 자리 숫자도 처리 가능
            } else {
                throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");
            }
        }
//        if (temp != 0) {
//            ret += temp;
//        }
        ret += temp;
    }

//    private int calcul(String input){
//        for (Character c : input.toCharArray()) { // 문자열은 바로 character로 순회 못함
//            if(c==','||c==':'){
//                ret+=temp;
//                temp=0;
//            }else{
//                //temp = Integer.parseInt(c);
//                temp = c-'0';
//            }
//        }
//        return ret;
//    }

    public int getRet() {
        return ret;
    }// 이게 필요한가?
}
