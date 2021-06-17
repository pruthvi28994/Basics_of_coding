package java_Aggregation;

public class Department {
	private int dId;
	private String dName;
	private String dLocation;
	public Department() {
	}
	public Department(int dId, String dName, String dLocation) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dLocation = dLocation;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdLocation() {
		return dLocation;
	}
	public void setdLocation(String dLocation) {
		this.dLocation = dLocation;
	}
	public void print() {
		System.out.println("Department Information");
		System.out.println("ID "+dId);
		System.out.println("Dept Name "+dName);
		System.out.println("Dept Location "+dLocation);
	}
}
