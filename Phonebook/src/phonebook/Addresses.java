package phonebook;

public class Addresses  {
	protected long telephoneNumber;
	protected String streetAddress;
	protected String city;
	protected String state;
	protected String zipCode;
	
	public Addresses(long telephoneNumber,String streetAddress, String city, String state, String zipCode) {
		super();
		this.telephoneNumber = telephoneNumber;
		this.streetAddress= streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Addresses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return   telephoneNumber + ";" + streetAddress + "," + city + "," + state + "," +  zipCode;
	}
	
	

}
