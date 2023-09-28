package fileIo;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {

	
char c='A';
try {
	String s=String.valueOf(c);
	FileWriter FW=new FileWriter("/home/vimalraj/Documents/Files/Writefile.txt");
	
	FW.write(s);
	FW.close();
} catch (Exception e) {
	System.out.println("please try again:");
}

	}

}
