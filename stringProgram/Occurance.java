package stringProgram;

import java.util.Scanner;

public class Occurance {
	static int occurance()
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a sentence");
      String x=sc.nextLine();
      String y[]=x.split(" ");
      int counter=0;
      for(String z:y){
			   if(z.equals("sea"))
			       counter=counter+1;
      }
      System.out.println(counter);
      return counter;
		}
    }

	public static void main(String[] args) {
        occurance();
	}

}
