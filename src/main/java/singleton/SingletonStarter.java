package singleton;
//WZORZEC ANTYWZORZEC KREACYJNY 
//Singleton to po prostu zainicjalizowanie instancji danej klasy dokladnie 1 raz, zawsze odwolujemy si do tej samej instancji
//tworzymy pole ,ktore to jest stworzeniem nowej instancji klasy oraz prywatny konstruktor
//opcjonalnie tworzymi publiczne metode getInstancje, ktora zwraca wspomniana jedyną instancje klasy .
//Rozważmy aplikację prowadzącą dla celów diagnostycznych dziennik zdarzeń. Poszczególne komponenty dodają wpis do dziennika, przekazując mu jego treść, natomiast dziennik określa, gdzie faktycznie zostanie on zapisany.
//
//Każdy komponent może uzyskać w dowolnym momencie dostęp do dziennika, zatem musi on być dostępny globalnie.
//To dziennik decyduje o tym, gdzie wpis zostanie faktycznie zapisany. Komponent musi jedynie przekazać jego treść. Oznacza to istnienie pojedynczej instancji dziennika.
//Z dziennika mogą również korzystać komponenty wielokrotnego użytku, zatem nie powinny one być zależne od mechanizmów udostępniania zasobów specyficznych dla danej aplikacji.
//Możemy to zapewnić, implementując w dzienniku wzorzec singleton tak, aby mógł on we własnym zakresie zarządzać dostępem do siebie samego
public class SingletonStarter {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
