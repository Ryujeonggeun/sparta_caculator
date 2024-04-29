import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    private ArrayList<Integer> arrayList;

    //생성자 호출시 초기화
    ArithmeticCalculator() {
        this.arrayList = new ArrayList<>();
    }



    //  ArrayList 의 Getter, Setter 메서드
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }



    // arrayList 조회 삭제 메서드
    public void removeResult() {
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove 입력시 삭제) ");
        String remove = sc.next();
        if (remove.equals("remove")) {
            arrayList.remove(0);
        }
    }
    public void inquiry() {
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
        String inquiry = sc.next();
        if (inquiry.equals("inquiry")) {
            for (Integer num : arrayList) {
                System.out.println(num);
            }
        }
    }
    @Override
    public int arithmeticCalculator(int num1, int num2, char saChic) {
        int result = 0;
        String msg = "";
        switch (saChic) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                //분모가 0이면 안됨
                if (num2== 0) {
                    msg = "분모는 0이 될 수 없습니다.";
                    break;
                }
                result = num1 / num2;
                break;

            default:
                msg = "알맞은 사칙연산이 아닙니다";
                break;//count가 올라가지 않도록 break 해준다
        }

        try {
            if (msg.isEmpty()) {
                System.out.println("결과: " + result);
            } else {
                throw new OurException(msg);
            }
        } catch (OurException e) {
            System.out.println(e.getMessage());
        }
        arrayList.add(result);

        return result;

    }

}
