package bank.deposit;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling{
	public static void main(String[] args) throws Exception {
		//ExceptionHandling exc = new ExceptionHandling();
		//exc.divide();
		PasswordException pe = new PasswordException(); 
	    try {
	    pe.checkPwd("abcdef");
	    }
	    catch(PasswordException p)
	    {
	      p.printStackTrace();
	      System.out.println("check pwd length");
	    }
	}
	private void divide(){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter number1 ");
			int no1 = sc.nextInt();
			System.out.println("Enter number2 ");
			int no2 = sc.nextInt();
			System.out.println(no1 / no2);
			throw new ArithmeticException("Please check numbers");
		}
		catch(ArithmeticException ae) {
			throw ae;
		}
		}
}
