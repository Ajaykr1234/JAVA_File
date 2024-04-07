package appusers;

public class Address {
	 private int  houseno;
	 private String streetname;
	 private String areaname;
	 private String city;
	 private String state;
	 private int pincode;
	public Address(int houseno, String streetname, String areaname, String city, String state, int pincode) {
		
		this.houseno = houseno;
		this.streetname = streetname;
		this.areaname = areaname;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	 
	 
	 
	
	 

	 
	 
	

}
