package interviewPrograms;

//import java.io.FileNotFoundException;
import java.io.FileReader;

public class SumofNoUsingFile {

	public static void main(String[] args) {
		
		
		
		int sum = 0;
		  String s = "";
		  try {

		   FileReader fr = new FileReader("/home/vimalraj/Documents/Files/sum.txt");
		   int i = 0;
		   while ((i = fr.read()) != -1) {
		    s = s + (char) i;
		   }
		   System.out.println(s);
		   fr.close();
		  } catch (Exception expect) {
		   System.out.println("file not readable");
		  }

		  String ss[] = s.split(" ");
		  for (String i : ss) {
		   sum = sum + Integer.parseInt(i);
		  }
		  
		  System.out.println(sum);
		
	}

}
