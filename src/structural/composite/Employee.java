package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    public String surname;
    public double salary;
    public List<Employee> subordinates;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }

}
