package java008_static_access.prob.part04;

/*
-name:String
-kor:int
-mat:int
-eng:int
+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter
+toString():String
+getTotal():int                 <---- kor+eng+mat 를 리턴
+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
+getGrade():char              <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴
*/

public class Student {
	private String name; //이름
	private int kor; //국어
	private int mat; //수학
	private int eng; //영어
	
	public Student() {
		
	}

	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	
	public String toString() {
		return String.format("%s의 점수는 %d 이며, 평균은 %.1f이고 학점은 %c입니다.\n"
				, name, getTotal(), getAvg(), getGrade());
	}
	
	public int getTotal() {
		return kor+mat+eng;
	}
	
	public double getAvg() {
		return getTotal()/3;
	}
	
	public char getGrade() {
		
		int avg = ((int)getAvg())/10;
		
		switch(avg) {
		case 10:
		case 9: return 'A'; 
		case 8: return 'B'; 
		case 7: return 'C'; 
		case 6: return 'D'; 
		default: return 'F';
		}
	}
}
