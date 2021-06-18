package bank.deposit;

import java.time.LocalDate;
import java.time.Period;

public class AgeDifference {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1997, 10, 20);
		Period p = Period.between(birthday, today);
		System.out.println(p.getYears() + " Years");
		System.out.println(p.getMonths() + " Months");
		System.out.println(p.getDays() + " days");
	}
}
