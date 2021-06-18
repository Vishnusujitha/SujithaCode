package bank.deposit;

import java.util.Scanner;

public class MyFirstJavaProgram {

  public static void main(String[] args) {
    
    MyFirstJavaProgram mf = new MyFirstJavaProgram(); 
  mf.fibonacciSeries();
  //mf.findNNumbers(); 
  //mf.findAdditionNNumbers(); 
  //Modularity
  //mf.findOddNosAddition(); 
  //mf.findEvenNosAddition(); 
  //mf.findtwoPowerNosAddition();  
  //mf.find(); 
  //mf.find2();  
  //mf.printReverse();
  //mf.printReverse2();
  //mf.printReverse3();
  //mf.printReverse4();
  //mf.reverseNo();
  //mf.additionOfDigits();
  //mf.findArmstrong(); 
  //mf.findNeon(); 
  //mf.findDivisors(); 
  //mf.findStrongNumber(); 
  //mf.nestedLoop();
  //mf.nestedLoop2();
  //mf.nestedLoop3();
  //mf.nestedLoop4();
  //mf.nestedLoop5();
  //mf.nestedLoop6();
  //mf.nestedLoop7();
  //mf.nestedLoop8();
  //mf.nestedLoop9();
  //mf.nestedLoop10();
  //mf.nestedLoop11();
  // mf.nestedLoop12();
  //mf.nestedLoop13();
  
  }
  private void fibonacciSeries() {
	// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt(); 
	    int no=0,no1=1,temp; 
	    System.out.print(no+" "+no1);
	    for(no=2;no<upper;no++)
	   {
	    	temp=no+no1;
	    	 System.out.print(temp+" ");
	    	no=no1;
	    	no1=temp;
	    }
}
private void nestedLoop13() {//pascal triangle
	// TODO Auto-generated method stub
	  int n = 8;    //n is the number of rows you want to print  
	  for (int i = 0; i < n; i++)   
	  {  
	  int number = 1;  
	  System.out.printf("%" + (n - i) * 2 + "s", "");  
	  for (int j = 0; j <= i; j++)   
	  {  
	  System.out.printf("%4d", number);  
	  number = number * (i - j) / (j + 1);  
	  }  
	  System.out.println();  
	  }  
}
private void nestedLoop12() {
	// TODO Auto-generated method stub
	  int i,j,k,row;
	  System.out.print("Enter number of rows ");
	   Scanner sc = new Scanner(System.in);
			row = sc.nextInt();
	  for(i=1;i<=row;i++)
	  {
	  for(j=row;j>i;j--)
	  {
		System.out.print(" ");
	  }
	  System.out.print(i+" "); 
	  for(k=1;k<2*(i-1);k++) 
	  {
		  System.out.print(" ");
	  }
	  if(i==1)
		  System.out.println("");
	  else
		  System.out.println(i-1+" ");
	 	  }
	  for(i=row-1;i>=1;i--)
	  {
	  for(j=row;j>i;j--)
	  {
		System.out.print(" ");
	  }
	  System.out.print(i+" "); 
	  for(k=1;k<2*(i-1);k++) 
	  {
		  System.out.print(" ");
	  }
	  if(i==1)
		  System.out.println("");
	  else
		  System.out.println(i-1+" ");
	 	  }
	
	
}
private void nestedLoop11()//diamond pattern
	  {
	  int i,j,r;
	   System.out.print("Input number of rows (half of the diamond) : ");
	   Scanner in = new Scanner(System.in);
			    r = in.nextInt();
	   for(i=0;i<=r;i++)
	   {
	     for(j=1;j<=r-i;j++)
	     System.out.print(" ");
	     for(j=1;j<=2*i-1;j++)
	       System.out.print("*");
	     System.out.println();
	   }
	 
	   for(i=r-1;i>=1;i--)
	   {
	     for(j=1;j<=r-i;j++)
	     System.out.print(" ");
	     for(j=1;j<=2*i-1;j++)
	       System.out.print("*");
	     System.out.println();
	   }
	  }
 
private void nestedLoop10() {
	// TODO Auto-generated method stub
	  int row=5;
	  while(row>=1)
	  {
	  int col=3;
	  while(col<=1)
	  {
	  System.out.print(" ");
	  col=col+1;
	  }
	  int star=5;
	  while(star>=row)
	  {
	  System.out.print("*"+" ");
	  star=star-1;
	  }
	  System.out.println();
	  row=row-1;
	  }

}
private void nestedLoop9() {
	// TODO Auto-generated method stub
	  int row=1;
	  while(row<=5)
	  {
	  int col=row;
	  while(col<=5)
	  {
	  System.out.print(col+" ");
	  col=col+1;
	  }
	  int star=1;
	  while(star<=row)
	  {
	  System.out.print("* ");
	  star=star+1;
	  }
	  System.out.println();
	  row=row+1;
	  }
}
private void nestedLoop8() {
	// TODO Auto-generated method stub
	  int row=1;
	  while(row<=5)
	  {
	  int col=1;
	  while(col<=row)
	  {
	System.out.print(col+row-1+" ");
	  col=col+1;
	  }
	  	  System.out.println();
	  row=row+1;
	  }
}
private void nestedLoop7() {
	// TODO Auto-generated method stub
	  int i=5;
		int row=5;
		while(row>=1) {
			int col=1;
			while(col<=row)
		{
			System.out.print(i+" ");
			col=col+1;
		}
		System.out.println();
		i=i-1;
		row=row-1;
		}
}
private void nestedLoop6() {
	int i=1;
	int row=5;
	while(row>=1) {
		int col=1;
		while(col<=row)
	{
		System.out.print(i+" ");
		col=col+1;
	}
	System.out.println();
	i=i+1;
	row=row-1;
	}
	}
private void nestedLoop5() {
	    // TODO Auto-generated method stub
	    int row = 5; 
	    while(row>=3)
	    {
	    int col = 1; 
	    while(col<=5)
	    {
	    System.out.print(row+" "); 
	    col= col+1; 
	    }
	    System.out.println(); 
	    row = row -1; 
	    }
	  }

	  private void nestedLoop4() {
	    // TODO Auto-generated method stub
	    int row = 1; 
	    while(row<=3)
	    {
	    int col = 5; 
	    while(col>=1)
	    {
	    System.out.print(col); 
	    col = col - 1; 
	    }
	    System.out.println();
	    row=row+1;  
	    } 
	  }

	  private void nestedLoop3() {
	    // TODO Auto-generated method stub
	    // TODO Auto-generated method stub
	    int row = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. of rows ");
	    int maxRow = sc.nextInt(); 
	    System.out.println("Enter no. of cols "); 
	    int maxCol = sc.nextInt();
	    while(row<=maxRow)
	    {
	    int column = 1; 
	    while(column<=maxCol)
	      {
	        System.out.print(column); 
	        column=column+1; 
	      }
	    System.out.println(); 
	    row= row+1;
	    }
	  }

	  private void nestedLoop2() {
	    // TODO Auto-generated method stub
	    int row = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. of rows ");
	    int maxRow = sc.nextInt(); 
	    
	    System.out.println("Enter no. of cols "); 
	    int maxCol = sc.nextInt();
	    while(row<=maxRow)
	    {
	    int column = 1; 
	    while(column<=maxCol)
	      {
	        System.out.print(row); 
	        column=column+1; 
	      }
	    System.out.println(); 
	    row= row+1;
	    }
	  }
	  private void nestedLoop() {
	    // TODO Auto-generated method stub
	    int i = 1; 
	    while(i<=3)
	    {
	    int count = 1; 
	    while(count<=5){
	    System.out.print(1+ " "); 
	    count=count+1;
	    }
	    System.out.println(); 
	    i =i +1; 
	    }
	  }
	  private void findStrongNumber() {
	    // TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter no. ");
		  int no = sc.nextInt();
		  int no2 = no;
		  int sum=0;
	    while(no>0)
	    {
	    int digit = no%10; 
	    int f = findFact(digit);
	    sum = sum + f; 
	    no = no/10; // 14
	    }
	    System.out.println("Sum is "+ sum);
	    if(sum == no2)
	      System.out.println("Strong number");
	    else
	      System.out.println("Not a Strong number");	    
	  }

	  private int findFact(int digit) {
	    // TODO Auto-generated method stub
	    int fact = 1; 
	    while(digit>0)
	    {
	    fact = fact * digit; 
	    digit= digit -1; 
	    }
	    return fact;
	  }

	  private void findDivisors() {
	    // TODO Auto-generated method stub
	    
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    int no = sc.nextInt();
	    int i = 1; 
	    int total = 0; 
	    while(i<no)
	    {
	    if(no%i==0)
	      total = total + i; 
	    i= i+1; 
	    }
	    System.out.println("Total is "+ total);
	    if(total == no)
	      System.out.println("Perfect number");
	    else
	      System.out.println("Not Perfect number");
	    
	  }

	  private void findNeon() {
	    // TODO Auto-generated method stub
	    int no = 9; 
	    int no2 = no * no; 
	    System.out.println(no2); //81 
	    int digits = 0; 
	    while(no2>0)
	    {
	    digits = digits + no2%10; 
	    no2 = no2/10;
	    }
	    System.out.println(digits); 
	    
	  }

	  private void findArmstrong() {
	    // TODO Auto-generated method stub
	    
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    int no = sc.nextInt();
	    int no2 = no; //no2 = 153
	    System.out.println(no);//153
	    int plate = 0; 
	    while(no>0)
	    {
	      int rem = no%10;   //5
	    plate = plate + (rem*rem*rem); //27 + (5*5*5)
	    no = no/10; //15
	    }
	  if(no2 == plate)
	  {
	    System.out.println("Armstrong Number");
	  }
	  else
	    System.out.println("Not Armstrong");

	    
	    
	  }

	  private void reverseNo() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    int no = sc.nextInt();
	    int no2 = no; //no2 = 1234
	    System.out.println(no);//1234
	    int plate = 0; 
	    while(no>0)
	    {
	    plate = (plate*10) + no%10; 
	    no = no/10; 
	    }
	    System.out.println(plate);
	  if(no2 == plate)
	  {
	    System.out.println("Palindrome");
	  }
	  else
	    System.out.println("Not Palindrome");
    }

	  private void additionOfDigits() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
      //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);
	    int no = sc.nextInt(); //123456
	    int no2 = no; 
	    int count = 0; 
	    while(no>0)
	    {
	   //System.out.println(no%10);
	    count = count + (no%10); 
	    no = no/10; 
	    }
	    System.out.println("Addition of digits are "+ count);    
	  }

	  private void countOfDigits() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    
	  //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);

	    int no = sc.nextInt(); //123456
	    int no2 = no; 
	    int count = 0; 
	    while(no>0)
	    {
	      System.out.println(no%10);
	    count = count + 1; 
	    no = no/10; 
	    }
	    System.out.println("No. of digits are "+ count);
	    
	  }

	  private void printReverse4() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    
	  //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);
	int no = sc.nextInt(); //123456
	    int no2 = no; 
	    
	    while(no>1)
	    {
	    System.out.println(no%100); 
	    no = no/10; 
	    }
	  }

	  private void printReverse3() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	  //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);
	    int no = sc.nextInt(); //123456
	    int no2 = no; 
	    while(no>0)
	    {
	    System.out.println(no%100); 
	    no = no/100; 
	    }
	  }

	  private void printReverse2() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    
	  //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);

	    int no = sc.nextInt(); //123456
	    int no2 = no; 
	    
	    while(no>0)
	    {
	    System.out.println(no%10); 
	    no = no/100; 
	    }
	  }

	  private void printReverse() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	  //  System.out.println("Direct " + 5);
	  //  int i = 5; 
	  //  System.out.println("i stored value " + i);
	    int no = sc.nextInt(); //123456
	   // int no2 = no; 
	    while(no>0)
	    {
	    System.out.println(no%10); 
	    no = no/10; 
	    }
	   }

	  private void find2() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt();            int i = 2; 
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no*i;   
	    i= i+2;         //  1  +  3  +  5  +  7  +  9
	    }
	    System.out.println(total);
	    
	  }

	  private void find() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt();            
	    int i = 2; 
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no*i;   
	    i= i+1;         //  1  +  3  +  5  +  7  +  9
	    }
	    System.out.println(total);
	  }

	  private void findtwoPowerNosAddition() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt();
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no*2;           //  1  +  3  +  5  +  7  +  9
	    }
	    System.out.println(no);
	  }

	  private void findEvenNosAddition() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 2; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt();
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no+2;           //  1  +  3  +  5  +  7  +  9
	    }
	    System.out.println(total);
	    
	  }

	  private void findOddNosAddition() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt();
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no+2;           //  1  +  3  +  5  +  7  +  9
	    }
	    System.out.println(total);
	    
	  }

	  private void findAdditionNNumbers() {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    int no = 1; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter upper limit ");
	    int upper = sc.nextInt(); 
	    while(no<=upper){
	    total = total + no;  // total = 1
	    no = no+1; 
	    }
	    System.out.println(total);
	     }
	  
	private void findNNumbers() {
	   int total=1;
	   int no=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter upper limit ");
	   int upper=sc.nextInt();
	   while(no<=upper)
	   {
		   total=total*no;
		   no=no+1;
	   }
	   System.out.println(total);
	  }
}