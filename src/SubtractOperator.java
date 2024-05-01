public class SubtractOperator implements  Opertator{

    public int operate(int num1, int num2) {
        return OperatorType.MINUS.calculate(num1,num2);
    }
}
