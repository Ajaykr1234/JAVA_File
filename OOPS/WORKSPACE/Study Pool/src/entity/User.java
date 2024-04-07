package entity;

public class User {
	
	private String uStream;
	
	private Details del;

	public User(String uStream, Details del) {
		super();
		this.uStream = uStream;
		this.del = del;
	}

	public String getuStream() {
		return uStream;
	}

	public void setuStream(String uStream) {
		this.uStream = uStream;
	}

	public Details getDel() {
		return del;
	}

	public void setDel(Details del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "User [uStream=" + uStream + ", del=" + del + "]";
	}
	
	
	
	
	
	

}
