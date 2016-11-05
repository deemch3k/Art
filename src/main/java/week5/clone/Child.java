package week5.clone;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
