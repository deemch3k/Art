package scr.week1.day2;

import java.util.Arrays;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Manager extends Employee{

    int salary;
    Employee[] employees;
    private int employeeCount;

    public Manager(String name, String surname){
        super(name,surname);
    }

    public Manager(String name, String surname, int salary, int employeeSize) {
        super(name,surname);
        this.salary = salary;
        employees = new Employee[employeeSize];
    }

    @Override
    public void work(){
        System.out.println("I'm manager, and I'm working");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", employees=").append(Arrays.toString(employees));
        sb.append('}');
        return sb.toString();
    }

    public boolean addEmployee(Employee employee){
        if(employeeCount==employees.length)return false;
        employees[employeeCount] = employee;
        employeeCount++;
        return true;
    }


    private void printInstance(Employee employee){
        if(employee instanceof Coder){
            System.out.println("Coder");
            Coder coder = (Coder)employee;
            coder.code();
        } else {
            System.out.println("Not Coder");
        }
        if(employee instanceof Manager){
            System.out.println("Manager");
        } else {
            System.out.println("Not Manager");
        }
        if(employee instanceof Employee){
            System.out.println("Employee");
        }else {
            System.out.println("Not Employee");
        }
    }


    public void startWorkingDay(){
        for (int i = 0; i < employeeCount; i++) {
            printInstance(employees[i]);
            employees[i].work();
        }
    }
}
