package decorator;

public class PlainPizza implements pizza{

    @Override
    public String getDescription() {
        return "thin doughts";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
