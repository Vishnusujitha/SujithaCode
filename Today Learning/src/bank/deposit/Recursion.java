package bank.deposit;

public class Recursion {
	public static void main(String[] args) {
		Recursion r = new Recursion();
		// int result = r.add(987654);
		// System.out.println(result);
		// int fact = r.factorial(6);
		// System.out.println(fact);
		// int rev = r.reverse(98765);
		// int no=9;
		// int no2=no*no;
		// int sum = r.neon(no2);
		// System.out.println(sum);
		// if(no==sum) {
		// System.out.println("The number is neon number");
		// }
		// else {
		// System.out.println("Not neon number");
		// }
		// int no1=100,no2=40;
		// int small=no1<no2?no1:no2;
		// int gcd=r.findGCD(no1,no2,small);
		// System.out.println(gcd);
		// int no1 = 3, no2 = 2;
		// int mul = no1 * no2;
		// int lcm = 0;
		// int result = r.findLCM(no1, no2, mul, lcm);
		// System.out.println(result);
		// r.decimalToBinary(6);
		// int pow=r.findPower(5,4);
		// System.out.println(pow);
		// r.reverseString("VISHNU SUJITHA");
		// int no = 0, no1 = 1, temp = 0;
		// int fib = r.fibonacciSeries(6, no, no1, temp);
		int ar[] = { 10, 20, 30, 40, 50 };
		int key = 20;
		int last = ar.length - 1;
		int result = binarySearch(ar, 0, last, key);
		if (result == 0) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element found in index " + result);
		}
	}

	private static int binarySearch(int[] ar, int first, int last, int key) {
		// TODO Auto-generated method stub
		if (last >= first) {
			int mid = (first + last) / 2;
			if (ar[mid] == key) {
				return mid;
			}
			if (ar[mid] > key) {
				return binarySearch(ar, first, mid - 1, key);
			} else {
				return binarySearch(ar, mid + 1, last, key);
			}
		}
		return 0;
	}

	private int fibonacciSeries(int count, int no, int no1, int temp) {
		// TODO Auto-generated method stub
		if (count <= 0) {
			return count;
		} else {
			System.out.print(no + " ");
			temp = no + no1;
			no = no1;
			no1 = temp;
		}
		return fibonacciSeries(count - 1, no, no1, temp);
	}

	public int findPower(int no, int p) {
		if (p == 1)
			return no;
		else if (p == 0)
			return 1;
		else {
			// 5,2
			int no2 = findPower(no, p / 2);
			int res = no2 * no2; // 625
			if (p % 2 != 0)
				return res * no;
			else
				return res; // 625
		}
	}

	private void reverseString(String s) {
		// TODO Auto-generated method stub
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	private void decimalToBinary(int no) {
		// TODO Auto-generated method stub
		String binary = "";
		while (no > 0) {
			int rem = no % 2;
			binary = rem + binary;
			no = no / 2;
		}
		System.out.println(binary);
	}

	private int findLCM(int no1, int no2, int mul, int lcm) {
		// TODO Auto-generated method stub
		if ((mul % no1 == 0) && (mul % no2 == 0)) {
			lcm = mul;
		}
		mul--;
		if (mul > 1) {
			return findLCM(no1, no2, mul, lcm);
		}
		return lcm;
	}

	private int findGCD(int no1, int no2, int small) {
		// TODO Auto-generated method stub
		if ((no1 % small == 0) && (no2 % small == 0)) {
			return small;
		}
		small--;
		return findGCD(no1, no2, small);
	}

	private int neon(int no2) {
		// TODO Auto-generated method stub
		if (no2 != 0) {
			return no2 % 10 + neon(no2 / 10);
		} else
			return 0;
	}

	private int factorial(int no) {
		// TODO Auto-generated method stub
		if (no > 0) {
			return no * factorial(no - 1);
		} else
			return 1;
	}

	private int reverse(int no) {
		if (no == 0) {
			return no;
		} else if (no > 0) {
			System.out.print(no % 10);
			reverse(no / 10);
		}
		return no;
	}

	private int add(int no) {
		// TODO Auto-generated method stub
		int total = 0;
		while (no > 0) {
			int rem = no % 10;
			total = total + rem;
			no = no / 10;
		}
		if (total > 9) {
			return add(total);
		}
		return total;
	}
}
