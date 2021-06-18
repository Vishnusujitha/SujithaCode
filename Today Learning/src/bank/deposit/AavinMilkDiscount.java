package bank.deposit;

import java.util.Calendar;
import java.util.Scanner;
public class AavinMilkDiscount
{
public static void main(String[] args)
{	
Scanner sc=new Scanner(System.in);
Calendar amd=Calendar.getInstance();
int date=amd.get(Calendar.DATE);
System.out.println("Current date is "+date);
int d=amd.getActualMaximum(Calendar.DAY_OF_MONTH);
System.out.println("No of days in the month is "+d);
int month=amd.get(Calendar.MONTH)+1;
System.out.println("Current month is "+month);
int year=amd.get(Calendar.YEAR);
System.out.println("Current year is "+year);
System.out.println("Please enter the price of one litre milk");
double cost_price=sc.nextDouble();
System.out.println("Please enter the discount");
double discount=sc.nextDouble();
double selling_price=cost_price-discount;
System.out.println("Selling price is "+selling_price);
double  cost_price_month=cost_price*d;
double  selling_price_month=(cost_price*d)-(discount*d);
double  profit_month=cost_price_month-selling_price_month;
double  total_price=d*selling_price;
System.out.println("Toal price for month is "+total_price);		
if (selling_price_month-cost_price_month<0)
{
System.out.println("Profit for one month is "+profit_month); 
}
double profit_percentage=(profit_month/cost_price_month)*100;
System.out.println("Profit % is "+profit_percentage);
}
}