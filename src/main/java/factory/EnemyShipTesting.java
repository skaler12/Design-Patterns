package factory;

import java.util.Scanner;
// Wzorzec Kreacyjny FACTORY
//chodzi o to by stworzyc 1 klase sterujaca zamiast do kazdego nowego statku pisac funkcjonalnosci do wyboru jaki to statek
//w klasie Enemshipfactory secydujemy jaki to statek ma byc
//jak nawet teraz dodamy nowy typ statku to wystarczy ze uwzglednimy ten typ w wyborze w EnemyShipFactory
public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type Ship U/R/B");

        if(scanner.hasNextLine()){
            String typeOfShip = scanner.nextLine();
            enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
        }
        if(enemyShip !=null){
            doStuffEnemy(enemyShip);
        }
        else{
            System.out.println("Enter U,R or B next time!");
        }
    }

    private static void doStuffEnemy(EnemyShip ufoShip) {
        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.enemyShipShoot();
    }
}
