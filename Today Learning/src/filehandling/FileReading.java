package filehandling;

import java.io.File;
import java.util.Date;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\Sujitha\\Documents\\docs");
		File[] ff = f.listFiles();
		int[] date = new int[ff.length];
		for (int i = 0; i < ff.length; i++) {
			String fileName = ff[i].getName();
			int position = fileName.lastIndexOf(".");
			String s = fileName.substring(position + 1);
			if (s.equals("jpg")) {
				long Modified = ff[i].lastModified();
				Date D = new Date(Modified);
				date[i] = D.getDate();
				System.out.println(fileName + "-->" + D);
			}
		}
		System.out.println();
		System.out.println("Before sorting");
		for (int i = 0; i < ff.length; i++) {
			if (date[i] != 0) {
				System.out.println(date[i]);
			}
		}
		System.out.println();
		for (int j = 1; j < ff.length; j++) {
			for (int i = 0; i < ff.length - j; i++) {
				if (date[i] > date[i + 1]) {
					int temp = date[i];
					date[i] = date[i + 1];
					date[i + 1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int i = 0; i < ff.length; i++) {
			if (date[i] != 0) {
				System.out.println(date[i]);
			}
		}
	}
}