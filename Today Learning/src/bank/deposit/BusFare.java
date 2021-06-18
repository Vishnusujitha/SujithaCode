package bank.deposit;

import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.*;

public class BusFare {
	public static void main(String[] args) {
		Calendar bus = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int date = bus.get(Calendar.DATE);
		System.out.println("Current date is " + date);
		int d = bus.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("No of days in the month is " + d);
		int m = bus.get(Calendar.MONTH) + 1;
		System.out.println("Current month is " + m);
		int year = bus.get(Calendar.YEAR);
		System.out.println("Current year is " + year);
		String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		LocalDate l = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(l.getDayOfWeek());
		float town_bus, private_bus;
		System.out.println("Town bus fair");
		town_bus = sc.nextInt();
		System.out.println("Private bus fair");
		private_bus = sc.nextInt();
		float total_fare = (town_bus * 2) + (private_bus * 2);
		System.out.println("Total fair is " + total_fare);
		float total_fare_free = private_bus * 2;
		System.out.println("If town bus is free total fare of one day is " + total_fare_free);
		String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		float total_fare_month = 0, total_fare_normal_days = 0;
		int[] count = new int[day.length];
		int j = 0;
		for (int i = 0; i < day.length; i++) {
			count[i] = 4;
		}
		for (int i = 0; i < 7; i++) {
			if (l.equals(day[i])) {
				j = i;
				break;
			}
		}
		int inc = d - 28;
		for (int i = j; i < j + inc; i++) {
			if (i > 6)
				count[i % 7] = 5;
			else
				count[i] = 5;
		}
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i] + " " + count[i]);
		}
		for (int i = 0; i < day.length; i++) {
			if (day[i] == "Monday" || day[i] == "Tuesday" || day[i] == "Wednesday" || day[i] == "Thursday"
					|| day[i] == "Friday") {
				total_fare_month = (count[i] * total_fare_free) + total_fare_month;
				total_fare_normal_days = (count[i] * total_fare) + total_fare_normal_days;
			}
		}
		System.out.println("Please enter direct private bus fare");
		float only_private_bus_fare = sc.nextInt();
		float private_bus_four_days = 8 * only_private_bus_fare;
		System.out.println("If getting direct bus for 4 days " + private_bus_four_days);
		float total_bus_fare = private_bus_four_days + total_fare_month;
		System.out.println("Total fare of month is " + total_bus_fare);
		System.out.println("Bus fare for one month if town bus is free " + total_fare_month);
		System.out.println("Bus fare for one month without free is " + total_fare_normal_days);
		float profit = total_fare_normal_days - total_bus_fare;
		System.out.println("Profit for one month is " + profit);
		float profit_percentage = (profit / total_fare_normal_days) * 100;
		System.out.println("Profit percentage for one month is " + profit_percentage);
	}
}