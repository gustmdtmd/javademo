package ncs_start;

public class Calculator {

	public double getSum(int data) {
		double sum = 0.0;
		if (data < 2 || data > 5)
			try {
				throw new InvalidException("입력 값에 오류가 있습니다.");
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}

		for (int i = 1; i <= data; i++)
			sum += i;
		return sum;

	}
}
