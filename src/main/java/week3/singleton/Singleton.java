package week3.singleton;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public Singleton getInstance(){
        return instance;
    }

}
