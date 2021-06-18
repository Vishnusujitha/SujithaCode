package bank.deposit;

import java.util.Scanner;
public class FrequencyOfCharacter {
public static void main(String[] args) {
	String name="VISHNU SUJITHA";
	char[] a=name.toCharArray();
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
			System.out.println(a[i]+" comes "+freq[i]+ " times");
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
