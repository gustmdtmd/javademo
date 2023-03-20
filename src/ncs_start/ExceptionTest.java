package ncs_start;

import java.util.Scanner;

import ncs_answ.test06.Calculator;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("data : ");
		int data = sc.nextInt();
		
		double sum = Calculator.getSum(data);
		
		System.out.println("결과값 : " + sum);

	}

}
