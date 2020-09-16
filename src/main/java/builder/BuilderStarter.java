package builder;
// WZORZEC KREACYJNY
//wzorzec ten jest stosowany gdy klasa ma ponad 4 pola, aby konstruktor wygladal schludnie oraz aby inne developer w latwy sposob rozumialk kod
//mozemy stosowac wzorzec builder, ktory to poprzez utworzenie klasy wewnetrzej builder pozwala w latwy sposob tworzyc żądane obiekty
//w konstuktorze najlepiej umiescic pola ktore sa wymagane, a kolejne pola poprzez metody z return .this czyli zwracaja
//instancje klasy na ktorej aktualnie pracuje pozwalaja na czytelne dodawanie parametrow do instacji klasy zewnetrzej w tym wypadku klasy Goal.
public class BuilderStarter {
    public static void main(String[] args) {

        Goal goal = new Goal.Builder()
                .name("Run the marathon")
                .description("My goal")
                .achieved()
                .build();
        System.out.println(goal.toString());
    }
}
