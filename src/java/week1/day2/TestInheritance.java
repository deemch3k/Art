package scr.week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class TestInheritance {

    public static void main(String[] args) {
        Employee employee = new Employee("Jack", "Smith");
        System.out.println(employee);

        Manager manager = new Manager("John", "Smith", 2500, 15);

        System.out.println(manager);

        employee.work();

        Coder jun = new Junior("Jimmy", "Cooper", "Java");
        Coder middle = new Middle("Josh", "Silver", "Python");
        Coder senior = new Senior("Kevin", "Gold", "C++");

        manager.addEmployee(jun);
        manager.addEmployee(middle);
        manager.addEmployee(senior);

        System.out.println(jun.getClass().getName());
    }

}
