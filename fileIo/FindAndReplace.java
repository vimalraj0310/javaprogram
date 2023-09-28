package fileIo;

import java.io.FileReader;
import java.io.FileWriter;

public class FindAndReplace {

	public static void main(String[] args) {

		try {

			String s = "";
			String srch = "was";
			FileReader Fr = new FileReader("/home/vimalraj/Documents/Files/VIM.txt");
			FileWriter Fw = new FileWriter("/home/vimalraj/Documents/Files/VIM.txt", true);
			for (int i = 0; (i = Fr.read()) != -1;) {
				s = s + ((char) i);

			}
			System.out.print(s);
			String y[] = s.split(" ");
			for (int i = 0; i < y.length; i++) {
				if (y[i].equalsIgnoreCase(srch)) {
					y[i] = "is";
				}
				Fw.write(y[i]+"\n");
				System.out.println(y[i]);

			}
	
			Fw.close();

			Fr.close();

		} catch (Exception e) {
			System.out.println("please try again");
		}

	}

}
