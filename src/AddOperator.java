public class AddOperator implements  Opertator{
    public int operate(int num1, int num2) {
        return OperatorType.PLUS.calculate(num1,num2);
    }
}
