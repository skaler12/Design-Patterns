package strategy.strategyExercise;

public class Substract implements CalculateStrategy {
    @Override
    public int calculate(int a, int b, String operator) {
        return a-b;
    }
}
