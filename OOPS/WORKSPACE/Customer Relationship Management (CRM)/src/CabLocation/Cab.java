package CabLocation;

public class Cab {
	private String driver_name;
	private long driver_no;
	private  String cab_name;
	private String cab_number;
	Location pickup;
	Location drop;
	public Cab(String driver_name, long driver_no, String cab_name, String cab_number,String longitude, String lattitude, String direction) {
		super();
		this.driver_name = driver_name;
		this.driver_no = driver_no;
		this.cab_name = cab_name;
		this.cab_number = cab_number;
		this.pickup = new Location(longitude,lattitude,direction);
		this.drop = new Location(longitude,  lattitude, direction);
		
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public long getDriver_no() {
		return driver_no;
	}
	public void setDriver_no(long driver_no) {
		this.driver_no = driver_no;
	}
	public String getCab_name() {
		return cab_name;
	}
	public void setCab_name(String cab_name) {
		this.cab_name = cab_name;
	}
	public String getCab_number() {
		return cab_number;
	}
	public void setCab_number(String cab_number) {
		this.cab_number = cab_number;
	}
	public Location getPickup() {
		return pickup;
	}
	public void setPickup(Location pickup) {
		this.pickup = pickup;
	}
	public Location getDrop() {
		return drop;
	}
	public void setDrop(Location drop) {
		this.drop = drop;
	}
	
	
	
	
	
	
	
	
	

}

