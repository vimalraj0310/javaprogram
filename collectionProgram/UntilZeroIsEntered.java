package collectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class UntilZeroIsEntered {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Character c=' ';
		String s = "";
		ArrayList<String> al = new ArrayList<String>();
		while (!s.equalsIgnoreCase("quit")) {
			System.out.println("Enter a Character:");
			s = sc.nextLine();
			al.add(s);
		}
al.remove(al.size()-1);
		System.out.println(al);
		sc.close();

	}

}
