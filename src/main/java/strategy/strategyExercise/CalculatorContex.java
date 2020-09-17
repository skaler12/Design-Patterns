package strategy.strategyExercise;

public class CalculatorContex {
    private CalculateStrategy calculateStrategy;

    public void set(CalculateStrategy calculateStrategy){
        this.calculateStrategy=calculateStrategy;
    }
    public void print(int a , int b,String operator ){
        int result = calculateStrategy.calculate(a,b,operator);
        System.out.println(result);
    }
}
