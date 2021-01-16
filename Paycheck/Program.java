
public class Program {
	public static void main(String[] args) {
		UserInput user = new UserInput();
		String name;
		double workHours;
		double salary;
		double overtimeSalary;
		PayCheck employee1 = new PayCheck();

		Output.printLine("Enter employee name");
		name = UserInput.inputEmployeeName();
		employee1.setEmployeeName(name);
		Output.printLine(employee1.getEmployeeName());
		Output.printLine("Enter number of hours worked");
		workHours = UserInput.inputNumberOfHours();
		employee1.setNumberOfHours(workHours);
		Output.printDouble(employee1.getNumberOfHours());
		
		if (workHours < 40.0) {
			Output.printLine("Total salary is");
			salary = employee1.salaryPerWeek();
			Output.printDouble(salary);
		}else {
			overtimeSalary = employee1.overtimeSalary();
			Output.printLine("Overtime salary is:");
			Output.printDouble(overtimeSalary);
			Output.printLine("Total salary is");
			salary = employee1.totalSalaryPerWeek();
			Output.printDouble(salary);
		}
			
		
		
	}

}
