package in.co.rays.Advancejava;

public class MarksheetBean {
	private int Id;
	private int Roll_no;
	private String Fname;
	private String Lname;
	private int physics;
	private int chemistry;
	private int maths;
	public int getId() {
		return Id;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getFname() {
		return Fname;
	}
	public void setFName(String Fname) {
		Fname = Fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public void setId(int id) {
		this.Id = id;
	}
	
}
