package week5.clone;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class Woman extends Person{

    private Child child;

    public Woman(String name, int age) {
        super(name, age);
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "child=" + child +
                '}' + super.toString();
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Woman clone = (Woman) super.clone();
        clone.setChild((Child) child.clone());
        return clone;
    }
}
