package ncs.test06;

public class Calculator {
	public double getSum(int data) {
		int sum = 0;
		if (data >= 2 && data <= 5)
			return (double)(sum += data);
		else
			return 0.0;
	}
}
