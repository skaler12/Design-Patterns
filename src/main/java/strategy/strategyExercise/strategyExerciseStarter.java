package strategy.strategyExercise;

public class strategyExerciseStarter {
    private static final int a = 10;
    private static final int b = 2;
    private static final String operation = "";
    public static void main(String[] args) {
        CalculatorContex calculatorContex = new CalculatorContex();
        calculatorContex.set(new Add());
        calculatorContex.print(a,b,operation);

        calculatorContex.set(new Substract());
        calculatorContex.print(a,b,operation);

        calculatorContex.set(new Multiply());
        calculatorContex.print(a,b,operation);

        calculatorContex.set(new Divide());
        calculatorContex.print(a,b,operation);
    }
}
