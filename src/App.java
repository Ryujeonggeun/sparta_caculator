import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       CircleCalculator circleCalculator = new CircleCalculator();
       ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        //사칙연산 OR 원의 넓이 선택
        System.out.println("사칙연산 / 원의넓이 선택 ");
        String choice = sc.nextLine();

        //원 넓이 계산
        if (choice.equals("원의넓이")) {
            while (true) {

                System.out.print("반지름을 입력하세요");
                int radius = sc.nextInt();
                circleCalculator.setRadius(radius);
                circleCalculator.cal();
                circleCalculator.removeCircleResult();
                circleCalculator.circleInquiry();
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String repeat = sc.next();
                // exit 를 입력받으면 반복 종료
                if (repeat.equals("exit")) {
                    break;
                }
            }
        }

        // 사칙연산 계산
        if (choice.equals("사칙연산")) {
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 :");
            int num1 = sc.nextInt();
            arithmeticCalculator.setNum1(num1);
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            arithmeticCalculator.setNum2(num2);
            System.out.print("사칙연산 기호를 입력하세요: ");
            char sachic = sc.next().charAt(0);
            arithmeticCalculator.setSaChic(sachic);
            // 사칙연산 메소드
            arithmeticCalculator.cal();

            // 리무브 메서드
            arithmeticCalculator.removeResult();
            //inquiry 메서드
            arithmeticCalculator.inquiry();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.next();
            // exit 를 입력받으면 반복 종료
            if (repeat.equals("exit")) {
                break;
            }
            count++;
        }
        }



        System.out.println("계산을 종료합니다");
    }
}