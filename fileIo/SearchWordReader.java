package fileIo;

import java.io.FileReader;
import java.util.Scanner;

public class SearchWordReader {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("/home/vimalraj/Documents/Files/Reader.txt");
			try (Scanner in = new Scanner(System.in)) {
				String srch="Sea";
				//System.out.println("enter search word:");
				//srch = in.nextLine();

				Boolean flag = false;
				String s = "";
				for (int i = 0; (i = fr.read()) != -1;) {
					s = s + ((char) +i);
				}
				String y[] = s.split(" ");
				for (String z : y) {
					if (z.equalsIgnoreCase(srch)) {
						flag = true;
					}
				}
				System.out.println(flag);
				System.out.println(s);
			}

			fr.close();
		} catch (Exception e) {
			System.out.println("pleaase try again");
		}

	}

}
