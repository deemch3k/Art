package scr.week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Employee {

    String name;
    String surname;

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void work(){
        System.out.println("I'm employee, and I'm working");
    }

}
