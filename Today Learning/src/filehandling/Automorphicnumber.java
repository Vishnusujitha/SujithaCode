package filehandling;

import java.util.Scanner;

public class Automorphicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the number");
    int no=sc.nextInt();
    int sq=no*no;
    System.out.println("The square of number is "+sq);
    int temp=no;
    int count=0;
    while(no>0) {
    	no=no/10;
    	count++;
    }
    int lastdigit=(int) (sq%(Math.pow(10, count)));
    if(temp==lastdigit) {
    	System.out.println("The number is automorphic");
    }
    else {
    	System.out.println("The number is not automorphic");
    }
	}

}
