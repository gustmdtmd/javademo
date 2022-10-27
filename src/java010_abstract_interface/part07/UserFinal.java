package java010_abstract_interface.part07;

public class UserFinal extends FinalTest{
	public UserFinal() {
	
	}
	
	//Cannot override the final method from FinalTest
	//void process() {}
	
	@Override
	void display() {
		super.display();
		System.out.println("취업하자");
	}
}
