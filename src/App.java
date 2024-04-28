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
            // 간접 접근을 통해 필드에 접근하여 수정하기(Setter 메서드)
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove 입력시 삭제) ");
            String remove = sc.next();
            if (remove.equals("remove")) {
                arr.remove(0);
            }

            //간접 접근을 통해 필드에 접근하여 가져오기 (Getter 메서드)
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                for (Integer num : arr) {
                    System.out.println(num);
                }
            }

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