package Practice_17.Task_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", 20.0, 160);
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        // Обновляем представление
        employeeController.updateView();
    }
}
