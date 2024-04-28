import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
            this.arrayList = arrayList;
    }

    public void calculate(int num1, int num2, char saChic) throws OurException {
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

    }


}



