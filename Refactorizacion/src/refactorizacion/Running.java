package refactorizacion;

public class Running {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		Employee employee1 = new Employee("John Doe", 5);
		Employee employee2 = new Employee("Jane Smith", 1);
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.printEmployees();
	}

}
