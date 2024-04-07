package entity;

public class Address {
    private String doorno;
    private String street;
    private String state;
    private String country;
    private int pincode;
	public Address(String doorno, String street, String state, String country, int pincode) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
    
    
    

}
