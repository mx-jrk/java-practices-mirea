package Practice_3.Task_2;

import java.util.List;

public class Report {
    private final List<Employee> employees;

    public Report(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void printEmployees(){
        for (Employee employee : employees){
            System.out.print("Сотрудник: " + employee.getFullName());
            System.out.printf("%50s%.2f\n", "Зарплата: ", Double.valueOf(employee.getSalary()));

        }
    }
}
