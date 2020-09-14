package observer;
//   OBSERVER - wzorzez behawioralny
//w tym wzorcu chodzi o to by zasubskrybowa informacje dla obiektów - które chca dostawac info o wystopeniu jakiejs czynnosci
//User implementuje interfejs MailObserver , który to ma metodę newsletter
//nastepnie klasa blog tworzy liste MailObserver, i za pomocą metody subscribe dodaje nowe osoby do tej listy
//nastepnie w metodzie Start Work wypisuje za pomoca petli info z metody newsletter dla userów którzy zasubskrybowali bloga
//Chodzi o poinformaowanie przez metode newsletter tylko tych userów którzy maja subskrypcje !
public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.subscribe(new User("Przemysław"));
        blog.subscribe(new User("Adam"));
        blog.startWork();
    }
}
