
public class BuilderPattern {

	public static void main(String[] args) {
		
		Person person = new PersonBuilder().setNewFirstName("Ravi").setNewIsFemale(false).createPerson();
		System.out.println(person);

	}

}
