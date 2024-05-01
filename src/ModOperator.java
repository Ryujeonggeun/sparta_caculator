public class ModOperator implements  Opertator{
    public int operate(int num1, int num2) {
        return OperatorType.Mod.calculate(num1,num2);
    }
}
