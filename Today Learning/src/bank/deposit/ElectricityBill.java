package bank.deposit;
import java.util.Scanner;
public class ElectricityBill {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Please enter previous month reading");
int reading1=sc.nextInt();
System.out.println("Please enter current month reading");
int reading2=sc.nextInt();
int consumption_unit=reading2-reading1;
System.out.println("Total unit for this month is "+consumption_unit);
double price=0;
System.out.println("Please enter last month consumption unit");
int last_consumption_unit=sc.nextInt();
System.out.println("Please enter May 2019 consumption unit");
int may_consumption_unit=sc.nextInt();
int total_unit=consumption_unit-100;
int total_unit1=last_consumption_unit-100;
int total_unit2=may_consumption_unit-100;
if(consumption_unit<last_consumption_unit&&consumption_unit<may_consumption_unit)
{
if(consumption_unit<=100)
{
System.out.println("Your unit is less than 100 no amount need to pay");
}
if(consumption_unit>100 && consumption_unit<=200)
{
price=1.5*total_unit;
System.out.println("The amount pay for "+total_unit+" units is "+price);
}
if(consumption_unit>200 && consumption_unit<=500)
{
if(consumption_unit>100 && consumption_unit<=200)
{	
price=2*total_unit;
}
if(consumption_unit>200 && consumption_unit<=500)
{
price=(100*2)+3*(total_unit-100);
System.out.println("The amount pay for "+total_unit+" units is "+price);
}
}
if(consumption_unit>101 && consumption_unit>500)
{
if(consumption_unit>100 && consumption_unit<=200)
{	
price=3.5*total_unit;
}
if(consumption_unit>201 && consumption_unit<=500)
{
price=4.6*total_unit;
}
if(consumption_unit>500)
{
price=(3.5*100)+(4.6*300)+6.6*(total_unit-400);
System.out.println("The amount pay for "+total_unit+" units is "+price);
}
}
System.out.println("Your current month reading is lower you can pay this month unit");	
}
else if(last_consumption_unit<consumption_unit&&last_consumption_unit<may_consumption_unit)
{
if(last_consumption_unit<=100)
{
System.out.println("Your unit is less than 100 no amount need to pay");
}
if(last_consumption_unit>100 && last_consumption_unit<=200)
{
price=1.5*total_unit1;
System.out.println("The amount pay for "+total_unit1+" units is "+price);
}
if(last_consumption_unit>200 && last_consumption_unit<=500)
{
if(last_consumption_unit>100 && last_consumption_unit<=200)
{	
price=2*total_unit1;
}
if(last_consumption_unit>200 && last_consumption_unit<=500)
{
price=(100*2)+3*(total_unit1-100);
System.out.println("The amount pay for "+total_unit+" units is "+price);
}
}
if(last_consumption_unit>101 && last_consumption_unit>500)
{
if(last_consumption_unit>100 && last_consumption_unit<=200)
{	
price=3.5*total_unit1;
}
if(last_consumption_unit>201 && last_consumption_unit<=500)
{
price=4.6*total_unit1;
}
if(last_consumption_unit>500)
{
price=(3.5*100)+(4.6*300)+6.6*(total_unit1-400);
System.out.println("The amount pay for "+total_unit1+" units is "+price);
}
}	
System.out.println("Your last month reading is lower you can pay last month unit");
}
else
{
//for 1 to 100 units
if(may_consumption_unit<=100)
{
System.out.println("Your unit is less than 100 no amount need to pay");
}
if(may_consumption_unit>100 && may_consumption_unit<=200)
{
price=1.5*total_unit2;
System.out.println("The amount pay for "+total_unit2+" units is "+price);
}
if(may_consumption_unit>200 && may_consumption_unit<=500)
{
if(may_consumption_unit>100 && may_consumption_unit<=200)
{	
price=2*total_unit2;
}
if(may_consumption_unit>200 && may_consumption_unit<=500)
{
price=(100*2)+3*(total_unit2-100);
System.out.println("The amount pay for "+total_unit2+" units is "+price);
}
}
if(may_consumption_unit>101 && may_consumption_unit>500)
{
if(may_consumption_unit>100 && may_consumption_unit<=200)
{	
price=3.5*total_unit2;
}
if(may_consumption_unit>201 && may_consumption_unit<=500)
{
price=4.6*total_unit2;
}
if(may_consumption_unit>500)
{
price=(3.5*100)+(4.6*300)+6.6*(total_unit2-400);
System.out.println("The amount pay for "+total_unit2+" units is "+price);
}
}
System.out.println("Your last year May reading is lower you can pay May 2021 unit");
}
}
}