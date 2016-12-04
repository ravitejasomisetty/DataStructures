
public class Person
{
   private final String lastName;
   private final String firstName;
   private final String middleName;
   private final String salutation;
   private final String suffix;
   private final String streetAddress;
   private final String city;
   private final String state;
   private final boolean isFemale;
   private final boolean isEmployed;
   private final boolean isHomewOwner;

   public Person(
      final String newLastName,
      final String newFirstName,
      final String newMiddleName,
      final String newSalutation,
      final String newSuffix,
      final String newStreetAddress,
      final String newCity,
      final String newState,
      final boolean newIsFemale,
      final boolean newIsEmployed,
      final boolean newIsHomeOwner)
   {
      this.lastName = newLastName;
      this.firstName = newFirstName;
      this.middleName = newMiddleName;
      this.salutation = newSalutation;
      this.suffix = newSuffix;
      this.streetAddress = newStreetAddress;
      this.city = newCity;
      this.state = newState;
      this.isFemale = newIsFemale;
      this.isEmployed = newIsEmployed;
      this.isHomewOwner = newIsHomeOwner;
   }
   public String getName()
   {
      return this.lastName;
   }

   public String getAddress()
   {
      return this.streetAddress;
   }

   public boolean isFemale()
   {
      return this.isFemale;
   }
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Person [lastName=");
	builder.append(lastName);
	builder.append(", firstName=");
	builder.append(firstName);
	builder.append(", middleName=");
	builder.append(middleName);
	builder.append(", salutation=");
	builder.append(salutation);
	builder.append(", suffix=");
	builder.append(suffix);
	builder.append(", streetAddress=");
	builder.append(streetAddress);
	builder.append(", city=");
	builder.append(city);
	builder.append(", state=");
	builder.append(state);
	builder.append(", isFemale=");
	builder.append(isFemale);
	builder.append(", isEmployed=");
	builder.append(isEmployed);
	builder.append(", isHomewOwner=");
	builder.append(isHomewOwner);
	builder.append("]");
	return builder.toString();
}
}