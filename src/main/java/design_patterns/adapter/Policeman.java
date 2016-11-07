package design_patterns.adapter;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Policeman {

    private String name;
    private String rank;

    public Policeman() {
    }

    public Policeman(String name) {

        this.name = name;
    }

    public Policeman(String name, String rank) {

        this.name = name;
        this.rank = rank;
    }

    public void serve(){
        System.out.println("I am good policeman");
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
