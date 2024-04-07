package CabLocation;

public class Location {
	
	private String longitude;
	private String lattitude;
	private String direction;
	public Location(String longitude, String lattitude, String direction) {
		super();
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.direction = direction;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	
	
	
	 
	 
	 

}
