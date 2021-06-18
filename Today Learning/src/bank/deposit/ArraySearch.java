package bank.deposit;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		ArraySearch arrs=new ArraySearch();
		//arrs.linearSearch();
		//arrs.binarySearch();
		//arrs.countfirstChar();
		//arrs.countofChar();
		//arrs.countVowels();
		//arrs.countConsonants();
		arrs.printConsonants();
			}
	private void printConsonants() {
		// TODO Auto-generated method stub
		char[] name = {'r','a','m','k','u','m','a','r', 'k','u','m','a','r','i'}; 
		  //  char[] vowels = {'a','e','i','o','u'}; 
		    int count=0; 
		    for(int i=0; i<name.length;i++)
		    {
		    if(name[i]!='a' && name[i] !='e' && name[i] !='i'  && name[i] !='o'  && name[i] !='u')
		      {
		      count++; 
		      System.out.println(name[i]);
		      }
		    }
		    System.out.println(count);
	}
	private void countConsonants() {
		// TODO Auto-generated method stub
		char[] name = {'r','a','m','k','u','m','a','r', 'k','u','m','a','r','i'}; 
	    char[] vowels = {'a','e','i','o','u'}; 
	    Scanner sc = new Scanner(System.in); 
	    int j = 0; 
	    int total =0; 
	    while(j<vowels.length)
	    {
	      char ch = vowels[j]; 
	    //  System.out.println(ch);
	      int count = 0; 
	      for(int i=0;i<name.length;i++)
	      {
	        if(ch == name[i])
	          //name[i]='-';
	          count++; 
	      }
	    System.out.println(ch + " comes " + count + " times");
	    total = total + count; 
	    j++; 
	  }
	    System.out.println("Total no. of vowels "+ total);
	    
	    int consonantsCount = name.length - total; 
	    System.out.println(consonantsCount);

	}
	private void countVowels() {
		// TODO Auto-generated method stub
		char[] name = {'r','a','m','k','u','m','a','r', 'k','u','m','a','r','i'}; 
	    char[] vowels = {'a','e','i','o','u'}; 
	    Scanner sc = new Scanner(System.in); 
	    int j = 0; 
	    while(j<vowels.length)
	    {
	      char ch = vowels[j]; 
	    //  System.out.println(ch);
	      int count = 0; 
	      for(int i=0;i<name.length;i++)
	      {
	        if(ch == name[i])
	          count++; 
	      }
	    System.out.println(ch + " comes " + count + " times");
	    j++; 
	  }
	}

	private void countfirstChar() {
		// TODO Auto-generated method stub
		char[] name = {'r','a','m','k','u','m','a','r'}; 
	    Scanner sc = new Scanner(System.in);   
	      char ch = name[0]; 
	    //  System.out.println(ch);
	      int count = 1; 
	      for(int i=1;i<name.length;i++)
	      {
	        if(ch == name[i])
	          count++; 
	      }
	    System.out.println(ch + " comes " + count + " times");	
	}

	private void countofChar() {
		// TODO Auto-generated method stub
		char[] name = {'r','a','m','k','u','m','a','r'}; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter any name");
	    String s = sc.next(); 
	      char ch = s.charAt(0); 
	    //  System.out.println(ch);
	      int count = 0; 
	      for(int i=0;i<name.length;i++)
	      {
	        if(ch == name[i])
	          count++; 
	      }
	    System.out.println(ch + " comes " + count + " times");
	}

	private void binarySearch() {
		// TODO Auto-generated method stub
		int[] ar = {5,8,9,11,17,25,36,63,98}; 
                 // 0,1,2, 3, 4, 5, 6, 7, 8 
   Scanner sc = new Scanner(System.in); 
   System.out.println("Enter no. "); 
   int no = sc.nextInt(); //9
   int min =0, max = ar.length-1; //8
   while(min<=max)
   {
    int avg = (min+max)/2; // avg = 2
     if(ar[avg] == no) 
      {// 9==9
      System.out.println("Yes, no. is present at " + avg); 
      break;
      }
     else if(no>ar[avg])// 9>8
     {
      min = avg+1; // min = 2
     }
     else{
     max = avg-1; // max = 3
     }
     }
     if(min>max)
     {
      System.out.println("No. is not present");
     }	
	}

	private void linearSearch() {
		// TODO Auto-generated method stub
		int[] ar = {10, 6, 4, 8, 12}; 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. ");
	    int no = sc.nextInt(); 
	    int i; 
	    for(i=0; i<ar.length; i++)
	    {
	    if(no == ar[i])
	    {
	    System.out.println("no is present at " + i); 
	    break; 
	    }
	    }
	    if(ar.length == i )
	    System.out.println("No. is not present");
	}

}
