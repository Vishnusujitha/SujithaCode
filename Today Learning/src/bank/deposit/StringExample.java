package bank.deposit;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string name");
		String V = sc.next();
		/*
		 * for (int i = 0; i < V.length(); i++) { System.out.print(V.charAt(i) + " "); }
		 */
		System.out.println();
		System.out.println("Please enter no of people");
		int N = sc.nextInt();
		System.out.println("Please enter the text");
		String[] Bi = new String[N];
		for (int i = 0; i < N; i++) {
			Bi[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			if (V.contains(Bi[i])) {
				System.out.println("POSITIVE");
			} else {
				System.out.println("NEGATIVE");
			}

		}
	}
}
