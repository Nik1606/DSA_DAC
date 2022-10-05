
public class Account {

	private String name;
	private int acno=12345;
	private String actype;
	private float abal;

	public Account()
	{
		name="ABCD";
		actype="saving";
		abal=0.00f;
		acno++;
	}
	
	public Account(String name,String actype, float abal)
	{
		this.name=name;
		this.actype=actype;
		this.abal=abal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getActype() {
		return actype;
	}

	public void setActype(String actype) {
		this.actype = actype;
	}

	public float getAbal() {
		return abal;
	}

	public void setAbal(float abal) {
		this.abal = abal;
	}
	
	
}
