import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        //배열 생성
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //count(결과값의 개수) 변수 생성
        int count = 0;
        int result = 0;

        // 반복문 사용

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 :");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char sachic = sc.next().charAt(0);


        // 사칙연산 메소드
        calculator.calculate(num1, num2,sachic);
        arr = calculator.getArrayList();

            count++;

        // 리무브 메서드
        calculator.removeResult();





            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.next();

            // exit 를 입력받으면 반복 종료
            if (repeat.equals("exit")) {
                break;

            }



        }
        System.out.println("계산을 종료합니다");
    }
}