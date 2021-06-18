package bank.deposit;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		mat.addition();
		mat.multiplication();
	}

	private void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no of rows");
		int r = sc.nextInt();
		System.out.println("Please enter no of columns");
		int c = sc.nextInt();
		int first[][] = new int[r][c];
		int second[][] = new int[r][c];
		int res[][] = new int[r][c];
		System.out.print("Please enter the elements in first matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				first[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.print("Please enter the elements in second matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				second[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = first[i][j] * second[i][j];
			}
		}
		System.out.println("Multiplication of matrix is ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no of rows");
		int r = sc.nextInt();
		System.out.println("Please enter no of columns");
		int c = sc.nextInt();
		int first[][] = new int[r][c];
		int second[][] = new int[r][c];
		int sum[][] = new int[r][c];
		System.out.print("Please enter the elements in first matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				first[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.print("Please enter the elements in second matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				second[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("Sum of matrix is ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
