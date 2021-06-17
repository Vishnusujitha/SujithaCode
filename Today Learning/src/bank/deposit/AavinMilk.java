package bank.deposit;

import java.util.Scanner;
public class AavinMilk 
 {
	public static void main(String[] args)
	{
	double loss,profit;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the price of one litre milk");
	double cost_price=sc.nextDouble();
	System.out.println("Please enter the discount");
	double discount=sc.nextDouble();
	double selling_price=cost_price-discount;
    System.out.println("Selling price is "+selling_price);
    loss=selling_price-cost_price;
    profit=cost_price-selling_price;
    if(selling_price-cost_price>0) 
     {
    	System.out.println("Loss is "+loss);
    	double loss_percentage=(loss/selling_price)*100;
    	System.out.println("Loss % is "+loss_percentage);
     }
     else if (selling_price-cost_price<0)
      {
       System.out.println("Profit is "+profit); 
       double profit_percentage=(profit/cost_price)*100;
       System.out.println("Profit % is "+profit_percentage);
      }
     else
      {
    	System.out.println("No discount");
      }
	}
}
