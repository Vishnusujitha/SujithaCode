package bank.deposit;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
		Array arr=new Array();
		//arr.oneDimensionalArray();
		//arr.twoDimensionalArray1();
		//arr.twoDimensionalArray2();
		//arr.twoDimensionalArray3();
		//arr.jaggedArray();
		//arr.twoDimensionalArray4();
		arr.transposeMatrix();
		// TODO Auto-generated method stub
		}
	
	private void twoDimensionalArray4() {
		// TODO Auto-generated method stub
		 int[][] ar = new int[3][]; 
		  //System.out.println(ar.length);
		  Scanner sc = new Scanner(System.in);
		  ar[0] = new int[3]; 
		  ar[1] = new int[5]; 
		  ar[2] = new int[2]; 
		  for(int j = 0; j<ar.length; j++)
		  {
		  for(int i=0;i<ar[j].length;i++)
		  {
		    System.out.println("Enter value ");
		   ar[j][i] = sc.nextInt(); 
		  }
		  }
	}

	private void jaggedArray() {
		// TODO Auto-generated method stub
		int[] a = {10,20,30}; 
	    System.out.println(a.length);
	  int[][] ar = { // Jagged Array
	        {10,20,30,35},      //10  40  70
	        {40,50,60,65,68},      //20  50  80
	        {70,80,90,95,100,105}      //30  60  90
	        };
	  System.out.println(ar.length);
	  System.out.println(ar[0].length);
	  System.out.println(ar[1].length);
	  System.out.println(ar[2].length);	
	}

	private void twoDimensionalArray3() {
		// TODO Auto-generated method stub
		int[][] ar = {
		        {10,20,30},
		        {40,50,60},
		        {70,80,90}
		        }; 
		  for(int  col=0;col<3;col++) 
		  {
		  for(int row=0; row<3;row++)
		  {
		  System.out.print(ar[row][col]+" ");
		  }
		  System.out.println();
		  }
	
	}

		private void twoDimensionalArray2() {
		// TODO Auto-generated method stub
		int[][] ar = {
		        {10,20,30},
		        {40,50,60},
		        {70,80,90}
		        }; 
		  for(int row = 0; row<3; row++)
		  {
		  for(int col =0; col<3; col++)
		  {
		  ar[row][col] = ar[row][col]+ 100; 
		  System.out.print(ar[row][col]+ " ");
		  }
		  System.out.println();
		  }	
	}

	private void twoDimensionalArray1() {
		// TODO Auto-generated method stub
		int[][] ar = {
		        {10,20,30},
		        {40,50,60},
		        {70,80,90}
		        }; 
		  for(int row = 0; row<3; row++)
		  {
		  for(int col =0; col<3; col++)
		  {
		  System.out.print(ar[row][col]+ " ");
		  }
		  System.out.println();
		  }
	}

	private void oneDimensionalArray() {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,40,50,60, 70,80, 90}; 
		  for(int i =0;i<ar.length;i++)
		  {	    
		    System.out.print(ar[i] + " ");
		    if(ar[i]%30==0)
		      System.out.println("|"); 
		  }
	}

	private void transposeMatrix() 
	{
		int[][] ar = {
		        {10,20,30},      //10  40  70
		        {40,50,60},      //20  50  80
		        {70,80,90}      //30  60  90
		        }; 
		int[][] br = new int[3][3];
		  for(int r=0;r<3;r++) 
		   {
		    for(int c=0;c<3;c++)
		     {
		       br[r][c]=ar[c][r]; 
		     }
		   }
		  for(int r=0;r<3; r++) 
		   {
		    for(int c=0;c<3;c++)
		    {
		      System.out.print(br[r][c]+ " ");
		    }
		    System.out.println();
		   }	
	}

}
