package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileReadWrite {

	public static void main(String[] args) {
		try {
	        BufferedReader reader= new BufferedReader(new FileReader("F:\\Sujitha\\Documents\\docs\\Sujitha.txt")); 
	        String line=null;
	        while((line=reader.readLine()) != null ){
	            System.out.println(line);
	        }
	        }catch (Exception ex){
	        	System.out.println("Error occured");
	        }		
		}
}

