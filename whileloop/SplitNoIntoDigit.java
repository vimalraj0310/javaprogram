package whileloop;

public class SplitNoIntoDigit {

	public static void main(String[] args) {
		int number = 2023;
		int n = 0;
		while (number != 0) {
			n = number % 10;
			System.out.println(n);
			number = number / 10;
		}

	}

}
