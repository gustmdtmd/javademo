package java006_class.part03;

public class Java068_class {

	public static void main(String[] args) {
		Rect re = new Rect();
		re.width=5;
		re.height=3;
		re.color="레드";
		
		re.display();
		
		System.out.println("=========");
		
		Rect rc = new Rect();
		rc.width=7;
		rc.height=4;
		rc.color="블루";
		
		rc.display();
		

	}//main() end

}//class end
