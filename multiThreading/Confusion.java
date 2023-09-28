package multiThreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class a extends Thread
{
	public synchronized void run() {
		String s1="";
		FileReader fr;
		try {
			
			fr = new FileReader("/home/vimalraj/Documents/Files/Abc.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				s1=s1+((char)i);
			}
			System.out.println(s1);
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
class b extends Thread
{
	 public synchronized void  run()
	{
		
		String s="write";
		FileWriter fw;
		try {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fw = new FileWriter("/home/vimalraj/Documents/Files/Abc.txt");
			System.out.println(s);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
System.out.println("plese try again");
}
		
		
	}
	
	
}
public class Confusion {

	public static void main(String[] args) {
		a A= new a();
		b B=new b();
		B.start();
		A.start();

	}

}
