package fileIo;

import java.io.FileReader;

public class CountNoWords {

	public static void main(String[] args) {
		String s = "";
	
		try {
			FileReader fr = new FileReader("/home/vimalraj/Documents/Files/VIM.txt");
			for (int i = 0; (i = fr.read()) != -1;) {
				s = s + ((char) +i);
			}
			String y[] = s.split(" ");
			System.out.println(y.length);

			fr.close();
		} catch (Exception e) {
			System.out.println("please recheck!");
		}
	}

}
