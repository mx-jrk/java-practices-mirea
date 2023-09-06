package Practice_3.Task_2;

public class Employee {
    private String fullName;

    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
