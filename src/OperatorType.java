import java.util.function.BiFunction;

public enum OperatorType {

        PLUS("+", (a, b) -> (a + b)),
        MINUS("-", (a, b) -> (a - b)),
        MULTIPLY("*", (a, b) -> (a * b)),
        DIVIDE("/", (a, b) -> (a / b)),
        Mod("%", (a,b) -> (a % b));




        private  String name;
        private BiFunction<Integer, Integer, Integer> biFunction;

    OperatorType(String name, BiFunction<Integer, Integer, Integer> biFunction) {
            this.name = name;
            this.biFunction = biFunction;
        }

        public Integer calculate(int a, int b) {
            return this.biFunction.apply(a,b);
        }
    }

