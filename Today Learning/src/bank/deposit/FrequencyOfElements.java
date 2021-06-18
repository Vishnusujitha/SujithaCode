package bank.deposit;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 10, 80 };
		int[] freq = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (no == a[j]) {
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1) {
			freq[i]=count;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(freq[i]>1) {
			//System.out.print("| "+freq[i]+ " |");
			}
			}
		int max=Integer.MIN_VALUE;
		int position=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>max) {
				max=freq[i];
				position=i;
			}
		}
		System.out.println(max+" comes at "+position);
		System.out.println(a[position]);
	}

}
