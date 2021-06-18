package bank.deposit;
import java.util.Scanner;
public class OreNumber {
	 public static void main(String args[]){
	        System.out.print("Enter the number: ");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int f = 0;
	        double mean = 0.0;
	        for(int i = 1; i <= num; i++){
	            if(num % i == 0){
	                f++;
	                mean += 1.0 / i;
	            }
	        }
	        mean = f / mean;
	        if(mean == (int)mean)
	            System.out.println(num + " is an Ore Number.");
	        else
	            System.out.println(num + " is NOT an Ore Number.");
	    }
}
