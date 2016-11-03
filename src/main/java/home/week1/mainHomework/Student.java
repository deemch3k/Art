package home.week1.mainHomework;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Student implements Comparable<Student>{

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

    @Override
    public int compareTo(Student o) {
        return surname.compareTo(o.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.awg, awg) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(awg);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(name,surname,awg);
    }
}