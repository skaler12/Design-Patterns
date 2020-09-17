package fasade;
//Wzorzec STRUKTURALNY
// chodzi tutaj o to aby uproscic interefejs dla użytkownika oraz ograniczyc użytkownikowi z zewnatrz dostępu do pewnych metod
//tworzymy klase posrednia DeliveryBoxFasade, gdzie w konstruktorze tworzymy instacje klas ktore chcemy ukryc oraz
//wykorzystujemy te instancje juz tylko w klacie pickUp, ktora jest publiczna i dostepna dla usera
//dpdatkowo zmieniamy dostep z public na default w klasach deliverybox i deliveryboxsystem oraz ich polach ,
//tak by nie byly dostepne dla usera z zewnetrzenj klasy w innej paczce .
public class FasadeStarter {
    public static void main(String[] args) {
        DeliveryBoxFasade deliveryBox = new DeliveryBoxFasade();
        deliveryBox.pickupPackage();
    }
}
