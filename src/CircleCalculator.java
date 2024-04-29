import java.util.ArrayList;
import java.util.Scanner;

public class CircleCalculator implements Calculator {



    private double radius;
    Scanner sc = new Scanner(System.in);
    //상수 선언
    private static final double PI = 3.14;
    //배열 생성
    private ArrayList<Double> circleList;

    //배열 초기화
    CircleCalculator() {
        this.circleList = new ArrayList<>();
    }
    // Getter, Setter 메서드
    public ArrayList<Double> getCircleList() {
        return circleList;
    }

    public void setCircleList(ArrayList<Double> circleList) {
        this.circleList = circleList;
    }
    // 반지름 겟셋
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // 원넓이 계산 + 리스트 추가
    @Override
    public double cal() {
        double result =  radius * radius * PI;
        System.out.println("결과: " + result);
        circleList.add(result);
        return result;
    }


    //
    public void removeCircleResult() {
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove 입력시 삭제) ");
        String remove = sc.next();
        if (remove.equals("remove")) {
            circleList.remove(0);
        }
    }
    public void circleInquiry() {
        System.out.println("저장된 원의 넓이");
        for (Double num : circleList) {
            System.out.println(num);

        }
    }


}
