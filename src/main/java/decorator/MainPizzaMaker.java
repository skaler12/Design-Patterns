package decorator;
//  DECORATOR - wzorzec strukturalny
//w tym wzorcu chodzi o to by łatwo utrzymac kod i obsłużyc tzw. szachownice
//pizz moze byc wiele , tak samo jak kombinacji skladnikw
//interfejs pizza przymjmuje metody get description i get cost , ktore zwracaja opic pizzy i cene dla uzytkownika
//nastepnie plain pizza implementuje ten interfejs i nadaje cene i opis dla podstawowej pizzy
//teraz NAJWAZNIJSZE !!!
//interfejs piza implementuje ABSTRAKCYJNA metoda ToppingDecorator ktora w konstruktprze odwoluje sie do obiektu interfejsu pizza
//nastepnie toppingPizza przyjmuje klasy - skladniki, mozzarella i tomato souce, ktore w konstruktorze oswoluja sie do pizza i nadpisuja metody
//getDescription oraz getCost.
//nazstepnie wklasie MainPizzaMaker pokazuje jak dziala ten wzorzec n pzykladzie
public class MainPizzaMaker {
    public static void main(String[] args) {
        pizza basicPizza = new TomattoSouce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients " + basicPizza.getDescription());
        System.out.println("Price " + basicPizza.getCost());
    }
}
