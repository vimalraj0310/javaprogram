package fileInOut;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		// file writer using java
		char c[]= {'v','i','m','a','l'};
		try {
			String s=String.valueOf(c);
		FileWriter fw=new FileWriter("/home/vimalraj/Desktop/vimal/i.txt");
		System.out.println(s);
		fw.write(s);
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println("error founded");
		}
		
	}

}
