package filehandling;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff = new File("F:\\Sujitha");
		File[] f = ff.listFiles();
		for (int i = 0; i < f.length; i++) {
			if (f[i].isFile()) {
				String s = f[i].getName();
				if(s.charAt(0)=='I')
					System.out.println(s);
			}
		}
		//int position = s.lastIndexOf(".");
		//String ss = s.substring(position + 1);
		//if (ss.equals("jpg"))
		/*
		 * try { if(!ff.exists()) ff.createNewFile();
		 * System.out.println("File created successfully"); } catch (IOException e) { //
		 * TODO Auto-generated catch block
		 * System.out.println("Specified Location is not present "); }
		 */
		// File ff = new File("F:\\Sujitha\\Documents\\docs\\sujitha.docx");
		// if(ff.exists()) {
		// ff.delete();
		// System.out.println("File deleted");
		// }
		// else {
		// System.out.println("File not present in the specified path");
		// }
	}

}
