package fileIOPractice;

import java.io.FileReader;

public class SearchWord {

	public static void main(String[] args) {
try {
	FileReader fr=new FileReader("/home/vimalraj/Documents/Files/VIM.txt");
	String srch="bad";
	String s="";

	boolean flag=false;
	int i=0;
	while((i=fr.read())!=-1)
	{
		s=s+((char)i);
		
	}
	String y[]=s.split(" ");
	for(String z:y)
	{
		if(z.equalsIgnoreCase(srch))
		{
			flag=true;
		}
	}
	fr.close();
	System.out.println(flag);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
