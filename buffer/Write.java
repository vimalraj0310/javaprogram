package buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		String s="Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts: Object. Class. Inheritance.";
		try {
		FileWriter fw=new FileWriter("/home/vimalraj/Documents/Files/Bufffiles.txt");
BufferedWriter bf=new BufferedWriter(fw);

		bf.write(s);
		//bf.flush();
		bf.close();
		}
			catch(Exception e) {
		System.out.println("please try again:");
		}
	}

}
