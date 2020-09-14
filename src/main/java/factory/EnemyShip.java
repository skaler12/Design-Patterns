package factory;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }
    public void followHeroShip(){
        System.out.println(getName() + " is following hero");
    }
    public void displayEnemyShip(){
        System.out.println(getName() + " is one the screen");
    }
    public void enemyShipShoot(){
        System.out.println(getName() + " attack and does " + getAmtDamage());
    }
}
