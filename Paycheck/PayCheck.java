/* class PayCheck */
public class PayCheck {
	private String employeeName = null;
	private double numberOfHours = 0.0;
	
	/* default constructor */
	public PayCheck() {
		
	}
	/* overloaded constructor */
	public PayCheck(String employeeName, double numberOfHours) {
		this.employeeName = employeeName;
		this.numberOfHours = numberOfHours;
	}
	
	/* mutator for employeeName */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	/* accessor for employeeName */
	public String getEmployeeName() {
		return employeeName;
	}
	
	/* mutator for numberOfHours */
	public void setNumberOfHours(double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	
	/* accessor for numberOfHours */
	public double getNumberOfHours() {
		return numberOfHours;
	}
	
	/* method to calculate the salary per week without overtime */
	public double salaryPerWeek() {
		final double HOURLY_WAGE = 9.25; // company hourly wage
		double salaryPerWeek = numberOfHours * HOURLY_WAGE;
		return salaryPerWeek;
	}
	
	/* Method to calculate overtime hours */
	public double overtimeHours() {
		final int maximumHours = 40;
		return numberOfHours - maximumHours;
		// return overtimeHours;
	}
	
	/* Method to calculate overtime salary */
	public double overtimeSalary() {
		final double OVERTIME_HOURLY_WAGE = 13.875;
		double overtimeSalary = (overtimeHours() * OVERTIME_HOURLY_WAGE);
		return overtimeSalary;
	}
	
	/* Method to calculate total salary per week including overtime */
	public double totalSalaryPerWeek() {
		double totalSalaryPerWeek = salaryPerWeek() + overtimeSalary();
		return totalSalaryPerWeek;
	}
	
}
