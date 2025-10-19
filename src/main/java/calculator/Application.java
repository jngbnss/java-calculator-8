package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

    }
}
//예: "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
// @formatter:off
/**
 * test case
 * 번호	입력(String)	예상 출력(int) 또는 예외 메시지
 * 1	""	                    0
 * 2	"1,2"	                3
 * 3	"1,2,3"	                6
 * 4	"1,2:3"	                6
 * 5	"7"	                    7
 * 6	"4,5,6,7"	            22
 * 7	"//;\n1;2;3"	        6
 * 8	"//#\n10#20#30"	        60
 * 9    "//#\n10#20#30,1"	    61
 * 10	"1,a,3"	                예외 발생: 잘못된 값을 입력하셨습니다.
 * 11	"//\n1,2"	            예외 발생: 잘못된 값을 입력하셨습니다.
 */
// @formatter:on
