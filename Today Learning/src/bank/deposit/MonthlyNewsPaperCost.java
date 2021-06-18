package bank.deposit;
import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.*;

public class MonthlyNewsPaperCost {
	public static void main(String[] args) {
		Calendar mnc = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int date = mnc.get(Calendar.DATE);
		System.out.println("Current date is " + date);
		int d = mnc.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("No of days in the month is " + d);
		int m = mnc.get(Calendar.MONTH) + 1;
		System.out.println("Current month is " + m);
		int year = mnc.get(Calendar.YEAR);
		System.out.println("Current year is " + year);
		String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		LocalDate l = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(l.getDayOfWeek());
		int[] count = new int[7];
		int j = 0;
		for (int i = 0; i < 7; i++) {
			count[i] = 4;
		}
		for (int i = 0; i < 7; i++) {
			if (l.equals(days[i])) {
				j = i;
				break;
			}
		}
		int inc = d - 28;
		int price = 0;
		for (int i = j; i < j + inc; i++) {
			if (i > 6)
				count[i % 7] = 5;
			else
				count[i] = 5;
		}
		for (int i = 0; i < 7; i++) {
			System.out.println(days[i] + " " + count[i]);
		}
		int i = 0;
		for (i = 0; i < 7; i++) {
			if (days[i] == "Monday" || days[i] == "Tuesday" || days[i] == "Wednesday" || days[i] == "Thursday"
					|| days[i] == "Friday") {
				price = (count[i] * 7) + price;
			}
			if (days[i] == "Saturday" || days[i] == "Sunday") {
				price = (count[i] * 8) + price;
			}
		}
		System.out.println("Amount pay for one month is " + price);
	}
}
