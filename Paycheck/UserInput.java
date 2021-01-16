import java.util.Scanner;

public class UserInput {
	public static final Scanner input = new Scanner(System.in); 
	
	public static String inputEmployeeName() {
		String employeeName = input.nextLine();
		return employeeName;
	}
	
	public static double inputNumberOfHours() {
		double numberOfHours = input.nextDouble();
		input.nextLine();
		return numberOfHours;
	}

}
