package phonebook;



public class Person {
	
protected String firstName;
protected String lastName;
protected String fullName;


public Person() {
	super();
	// TODO Auto-generated constructor stub
}


public Person(String firstName, String lastName, String fullName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.fullName = fullName;
}



public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getFullName() {
	return fullName;
}


public void setFullName(String fullName) {
	this.fullName = fullName;
}


@Override
public String toString() {
	return firstName + "," + lastName;
}











}
