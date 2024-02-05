import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee>childrenEmployees = new ArrayList<>();;
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addChild(Employee child){
		childrenEmployees.add(child);
	}

    public List<Employee> getChild() {
        return childrenEmployees;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    public void print(int depth) {
        System.out.printf(String.join("", Collections.nCopies(depth, "\t")));
        System.out.println(this);
        for (Employee child : childrenEmployees)
            child.print(depth+1);
    }
}