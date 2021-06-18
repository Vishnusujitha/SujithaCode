package bank.deposit;
public class CreditCardValidation {
	public static void main(String[] args) {
		long cno =4440967484181607L;
		long result = sumeven(cno) + sumodd(cno);
		System.out.println(result);
		if (isValid(result)) {
			System.out.println("The length of the card is " + getSize(cno));
			System.out.println("Card is valid");
		} else {
			System.out.println("The length of the card is " + getSize(cno));
			System.out.println("Card is invalid");
		}
	}
	private static int sumodd(long cno) {
		int sum = 0;
		int rem;
		cno = cno / 10;
		for (int i = getSize(cno) - 1; i >= 0; i=i-2) {
			rem = (int) (cno % 10);
			sum = sum + getDigit(rem);
			cno = cno / 100;
		}
		System.out.println(sum);
		return sum;
	}
	private static int sumeven(long cno) {
		int sum = 0;
		int rem;
		cno = cno % 10;
		for (int i = getSize(cno) - 2; i >= 0; i=i-2) {
			rem = (int) (cno % 10);
			sum = sum + getDigit(rem * 2);
			cno = cno / 100;
		}
		return sum;
	}
	private static int getDigit(int cno) {
		if (cno <= 9) {
			return cno;
		} else if (cno > 9) {
			return (cno % 10 + cno / 10);
		}
		return cno;
	}
	private static boolean isValid(long result) {
		if (result % 10 == 0) {
			return true;
		}
		return false;
	}
	private static int getSize(long cno) {
		int length = 0;
		while (cno >= 10) {
			cno = cno / 10;
			length++;
		}
		return length;
	}
}
