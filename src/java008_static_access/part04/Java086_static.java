package java008_static_access.part04;

//javac -d . Java086_args.java
//java java008_static_access.part04.Java086_args hello world 2022

public class Java086_static {
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		for(String data : args) {
			System.out.println(data);
		}
		
	}//main() end

}//class end
