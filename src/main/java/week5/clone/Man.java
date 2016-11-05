package week5.clone;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class Man extends Person{

    private Woman wife;

    public Man(String name, int age) {
        super(name, age);
    }

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Man{");
        sb.append("wife=").append(wife);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Man clone() throws CloneNotSupportedException {
        Man man = (Man)super.clone();
        man.setWife((Woman) wife.clone());
        return man;
    }
}
