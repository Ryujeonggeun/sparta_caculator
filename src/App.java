import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 생성
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //count(결과값의 개수) 변수 생성
        int count = 0;

        // 반복문 사용
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 :");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char sachic = sc.next().charAt(0);


        int result = 0;

        switch (sachic) {
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
                if (num2 == 0) {
                    System.out.println("분모는 0이 될 수 없습니다.");
                    break;
                }
                 result = num1 / num2;
                break;

            default:
                System.out.println("알맞은 사칙연산이 아닙니다");
                 break;//count가 올라가지 않도록 break 해준다
        }

        System.out.println("결과: " + result );

            arr.add(result);

            count++;

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove 입력시 삭제) ");
            String remove = sc.next();
            if (remove.equals("remove")) {
                arr.remove(0);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.next();
            System.out.println(arr.toString());
            // exit 를 입력받으면 반복 종료
            if (repeat.equals("exit")) {
                break;

            }



        }
        System.out.println("계산을 종료합니다");
    }
}