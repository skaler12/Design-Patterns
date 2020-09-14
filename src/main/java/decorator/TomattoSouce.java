package decorator;

public class TomattoSouce extends ToppingDecorator{
    public TomattoSouce(pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Souce");
        System.out.println("Adding Tomato Souce");
    }
    public String getDescription() {
        return tempPizza.getDescription() + ", TomatoSouce";
    }

    public double getCost() {
        return tempPizza.getCost() + 2.0;
    }
}
