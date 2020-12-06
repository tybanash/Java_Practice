/* class RunStudentRegistration */
public class RunStudentRegistration {
	public static void main(String[] args) {
		StudentRegistration student1 = new StudentRegistration();
		
		/* setter methods */
		student1.setFirstName("Nadege");
		student1.setLastName("Awah");
		student1.setProgrammingExperience("Beginner");
		
		/* getter methods */
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getProgrammingExperience());
		
		System.out.println(); //creates an empty line
		System.out.println(student1.printRegistrationForm()); //prints form
		
		System.out.println(); //creates an empty line
		StudentRegistration student2 = new StudentRegistration("John", "Doe", "Advance");
		System.out.println(student2.printRegistrationForm()); //prints form
	}

}
