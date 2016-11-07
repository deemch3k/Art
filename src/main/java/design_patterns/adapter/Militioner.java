package design_patterns.adapter;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Militioner {

    private String name;
    private String rank;

    public Militioner() {
    }

    public Militioner(String name) {

        this.name = name;
    }

    public Militioner(String name, String rank) {

        this.name = name;
        this.rank = rank;
    }

    public void takeBribes(){
        System.out.println("I am bad militiamen");
    }

    @Override
    public String toString() {
        return "Militioner{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
