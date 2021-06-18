package bank.deposit;
import java.util.Scanner;
public class ArrayLearningDemo {
	  public static void main(String[] args) {
		  ArrayLearningDemo ald=new ArrayLearningDemo();
		  ald.getStudentDetails();
		  //ald.learnArray();
		  //ald.sortAscendingArray();
		  //ald.sortDescendingArray();
		  //ald.selectionSort();
		  // TODO Auto-generated method stub
	   }
		private void selectionSort() {
			// TODO Auto-generated method stub
			int size, i, j, temp;  
		       int ar[] = new int[5];  
		       Scanner sc = new Scanner(System.in);    
		       System.out.print("Enter Array Size : ");  
		       size = sc.nextInt();  		         
		       System.out.print("Enter Array Elements : ");  
		       for(i=0; i<size; i++)   
		       {  
		           ar[i] = sc.nextInt();
		       }  
		       System.out.print("Sorting Array using Selection Sort Technique..\n");  
		       for(i=0; i<size; i++)  
		       {  
		           for(j=i+1; j<size; j++)  
		           {  
		               if(ar[i] > ar[j])  
		               {  
		                   temp = ar[i];  
		                   ar[i] = ar[j];  
		                   ar[j] = temp;  
		               }  
		           }  
		       }  
		       System.out.print("Now the Array after Sorting is :\n");  
		       for(i=0; i<size; i++)  
		       {  
		           System.out.print(ar[i]+ "  ");  
		       }  
					}
	private void sortDescendingArray() {
		// TODO Auto-generated method stub
		int ar[]= {20,30,50,10,40};
			//      0  1  2  3  4 
		System.out.println("Before Swapping ");
		  for (int i = 0; i < ar.length; i++) 
		  {
		    System.out.print(ar[i] + " ");
		  }
		  for(int j=1;j<ar.length;j++)
		  {
		for(int i=0;i<ar.length-1;i++)
		{
		if(ar[i+1]>ar[i]) {
			int temp = ar[i+1];
	        ar[i+1] = ar[i]; // 40
	        ar[i] = temp; // 50
	   }
		}
		  }
		 System.out.println("After Swapping ");
		    for (int i = 0; i < ar.length; i++) {
		      System.out.print(ar[i] + " ");
		    }
		    int len = ar.length; //4
		    System.out.println("Minimum is " + ar[len-1]);
		    System.out.println("Second Minimum is "+ ar[len-2]);
		    System.out.println("Third Minimum is "+ ar[len-3]);	
		    System.out.println("Forth Minimum is  "+ar[len-4]);
			
	}

	private void sortAscendingArray() {
		// TODO Auto-generated method stub
		int[] ar = { 10, 40, 20, 50,30 };
        // 0 1 2 3
  System.out.println("Before Swapping ");
  for (int i = 0; i < ar.length; i++) 
  {
    System.out.print(ar[i] + " ");
  }
  for(int j = 1;j < ar.length; j++)
  {
    for (int i = 0; i < ar.length - j; i++) 
    {
      if (ar[i] > ar[i + 1]) 
      {
        int temp = ar[i];
        ar[i] = ar[i + 1]; // 40
        ar[i + 1] = temp; // 50
      }
    }
  }
  
  System.out.println("After Swapping ");
    for (int i = 0; i < ar.length; i++) {
      System.out.print(ar[i] + " ");
    }

    int len = ar.length; //4
    System.out.println("Maximum is " + ar[len-1]);
    System.out.println("Second Maximum is "+ ar[len-2]);
    System.out.println("Third Maximum is "+ ar[len-3]);	
    System.out.println("Forth Maximum is  "+ar[len-4]);
	}

	private void learnArray() {
		// TODO Auto-generated method stub
		int[] ar= {10,200,-5,40,5};
		int min=ar[0];
		int sMin=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				sMin=min;
				min=ar[i];
			}	
			else if(ar[i]<sMin)
				sMin=ar[i];
		}
		System.out.println(min);
		System.out.println(sMin);
		}

	private void getStudentDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter no of subjects");
		  int no=sc.nextInt();      
		  int[] ar=new int[no];
			  int total=0;
			  for(int i=0;i<ar.length;i++) 
			  {
				  System.out.println("Please enter the value");
				  ar[i]=sc.nextInt();
				  total=total+ar[i];
			  }
			  for(int i=0;i<ar.length;i++) 
			  {
				  System.out.println((i+1)+"-->"+ar[i]);
			  }
			  System.out.println("Total is "+total);	
		 System.out.println(total/ar.length);
		  	 
	}

	}