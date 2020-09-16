package singleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        //if jest opcjonalny , bo konstruktor i tak prywatny
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}