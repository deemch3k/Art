package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public abstract class Artist {

    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void act();

}
