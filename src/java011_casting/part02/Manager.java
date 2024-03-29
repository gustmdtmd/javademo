package java011_casting.part02;

public class Manager /* extends object */ {
	String name;
	String dept;
	String depth;
	
	public Manager() {
	
	}

	public Manager(String name, String dept, String depth) {
		this.name = name;
		this.dept = dept;
		this.depth = depth;
	}
	
	
	public String toString() {
		return String.format("name:%s dept:%s depth:%s", name, dept, depth);
	}
	
	public String display() {
		return String.format("%s님의 근무지역은 %s입니다.\n", name, "Seoul");
	}
}
