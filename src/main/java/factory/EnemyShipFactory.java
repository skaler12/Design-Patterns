package factory;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;
        if(newShip.equals("U")){
            return new UfoEnemyShip();
        }
        else if(newShip.equals("R")){
                return new RocketEnemyShip();
        }
        else if (newShip.equals("B")){
                return new BigUfoEnemyShip();
        }
        else {
            return null;
        }
    }
}
