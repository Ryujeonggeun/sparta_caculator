import java.util.ArrayList;
import java.util.Scanner;


public class ArithmeticCalculator implements Calculator {
Scanner sc = new Scanner(System.in);


    private int num1;
    private int num2;



    private char saChic;

    private ArrayList<Integer> arrayList;
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    //생성자 호출시 초기화
    ArithmeticCalculator() {
        this.arrayList = new ArrayList<>();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();

    }



    //  ArrayList 의 Getter, Setter 메서드
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    // number  Getter, Setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }



    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    // 사칙 겟셋
    public char getSaChic() {
        return saChic;
    }

    public void setSaChic(char saChic) {
        this.saChic = saChic;
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
    public double cal () {
        int result = 0;
        String msg = "";
        switch (saChic) {
            case '+':
                result = addOperator.operate(num1,num2);
                break;

            case '-':
                result = subtractOperator.operate(num1,num2);
                break;

            case '*':
                result = multiplyOperator.operate(num1,num2);
                break;

            case '/':
                //분모가 0이면 안됨
                if (num2== 0) {
                    msg = "분모는 0이 될 수 없습니다.";
                    break;
                }
                result = divideOperator.operate(num1, num2);
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
