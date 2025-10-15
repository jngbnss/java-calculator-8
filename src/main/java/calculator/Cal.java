package calculator;

public class Cal {
    private int ret;
    private int temp;
    private String input;

    public Cal(String input) {
        this.input = input;
        for (Character c : input.toCharArray()) { // 문자열은 바로 character로 순회 못함
            if(c==','||c==':'){
                ret+=temp;
                temp=0;
            }else if(Character.isDigit(c)){
                //temp = Integer.parseInt(c);
                temp = c-'0';
            }else{
                throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");
            }
        }
        if(temp!=0) ret+=temp;
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
    }
}
