package decorator;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dought");
        System.out.println("Adding Mozarella");
    }
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozarella";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.5;
    }
}
