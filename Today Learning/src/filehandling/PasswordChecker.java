package filehandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the password");
		String password = sc.next();
		String[] regex = { "[*A-Z]", "[*a-z]", "[^//s]", "[*0-9]", "[*.!@#$&(){}]" };
		boolean found = true;
		for (int i = 0; i < regex.length; i++) {
			Pattern p = Pattern.compile(regex[i]);
			Matcher m = p.matcher(password);
			boolean s = m.find();
			if (password.length() >= 8) {
				System.out.println(s);
				if (s == found) {
					System.out.println("Proceed");
				} else {
					System.out.println(i +" th condition fails Please check password constraint");
				}
			}
		}
		if (password.length() < 8) {
			System.out.println("Password should be atleast 8 letters");
		}
	}
}
