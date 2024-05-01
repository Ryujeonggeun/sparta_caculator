public class DivideOperator implements  Opertator{
    public int operate(int num1, int num2) {
        return OperatorType.DIVIDE.calculate(num1,num2);
    }
}
