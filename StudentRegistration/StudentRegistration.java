/* Class StudentRegistration for a Java bootcamp */
public class StudentRegistration {
	private String firstName = null;
	private String lastName = null;
	private String programmingExperience = null;
	
	/* default constructor */
	public StudentRegistration () {
	
	}
	
	/* overloaded constructor */
	public StudentRegistration (String firstName, String lastName, String programmingExperience ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.programmingExperience = programmingExperience;
	}
	
	/* mutator for firstName */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/* accessor for firstName */
	public String getFirstName() {
		return firstName;
	}
	
	/* mutator for lastName */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* accessor for lastName */
	public String getLastName() {
		return lastName;
	}
	
	/* mutator for  programmingExperience */
	public void setProgrammingExperience(String programmingExperience) {
		this.programmingExperience = programmingExperience;
	}
	
	/* accessor for programmingExperience */
	public String getProgrammingExperience() {
		return programmingExperience;
	}
	
	/* method to print registration form */
	public String printRegistrationForm() {
		//String registrationForm = null;
		return "First Name: " + firstName +  "\nLast Name: "
		+ lastName + "\nProgramming Experience: " + programmingExperience;
	}

}