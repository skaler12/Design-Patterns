package decorator;

//to bardzo wazne by ta klasa byla abastrakcyjna, tak by nikt nie stworzyl implementaji tej klasy
//ta klasa jest posrednia i w swoim konstruktorze , tylko przypisuje obiekt interfejsu pizza do pola tempPizza
//obiekt ten jest uzywwany w klasach po niej dziedziczasych czyli skladnikach - mozarella i tomatosouce.
public abstract class ToppingDecorator implements pizza {


    protected  pizza tempPizza;

    public ToppingDecorator(pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
