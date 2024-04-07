package entity;

public class Admin {

	private String aId;
	private int aEduExp;
	
	private Details del;

	public Admin(String aId, int aEduExp, Details del) {
		super();
		this.aId = aId;
		this.aEduExp = aEduExp;
		this.del = del;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public int getaEduExp() {
		return aEduExp;
	}

	public void setaEduExp(int aEduExp) {
		this.aEduExp = aEduExp;
	}

	public Details getDel() {
		return del;
	}

	public void setDel(Details del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aEduExp=" + aEduExp + ", del=" + del + "]";
	}
	
	
	
	
	

	
}
