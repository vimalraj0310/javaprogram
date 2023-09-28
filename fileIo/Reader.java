package fileIo;

import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {
		
try  {
	FileReader fr = new FileReader("/home/vimalraj/Documents/Files/Reader.txt");
	int i=0;
	String s="";
	//file read
	while((i=fr.read())!=-1)
	{
	
		s=s+((char)i);
	}
	//file close
	fr.close();
	
	System.out.print(s);
	
	
} catch (Exception e) {

System.out.println("please try again");
}
	}

}
