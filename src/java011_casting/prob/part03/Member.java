package java011_casting.prob.part03;

public class Member {
	String name;
	String dept;
	String grade;

	public Member(String name, String dept, String grade) {
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	
	//급여
	public int pay() {
		return 0;
	}
	
	public String toString() {
		return String.format("%s %s %s\n", name, dept, grade);
	}
}
