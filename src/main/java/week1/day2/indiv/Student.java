package scr.week1.day2.indiv;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Student {

    private String name;
    private String surname;
    private double awg;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", awg=").append(awg);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAwg() {
        return awg;
    }

    public void setAwg(double awg) {
        this.awg = awg;
    }

    public Student(String name, String surname, double awg) {
        this.name = name;
        this.surname = surname;
        this.awg = awg;
    }
}
