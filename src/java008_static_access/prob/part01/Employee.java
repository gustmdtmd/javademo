package java008_static_access.prob.part01;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * +setEmployee(name:String, dept:String, pay:int, score:double):void
 * +toString():String 
 */
public class Employee {
	private String name; // 사원이름
	private String dept; // 근무부서
	private int pay; // 받는급여
	private double score; // 입사점수
	

	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	
	
	public String toString() {
		return String.format("이름은 %s이고 %s에 근무하여 급여는 %d원 입사성적은 %.2f입니다.\n"
				, name, dept, pay, score);
	}
}
















