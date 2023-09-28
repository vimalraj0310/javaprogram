package fileInOut;
import java.io.*;

public class FileReadExample {

	public static void main(String[] args) {
		//file read using java
		FileReader FR;
		try {
			FR = new FileReader("/home/vimalraj/Desktop/vimal/v.txt");
		
		int i=0;
		String s="";
		
			while((i=FR.read())!=-1) {
				
				s=s+((char)i);
				
				
			
		} 
			System.out.println(s);
			FR.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
				
		

	}

}
