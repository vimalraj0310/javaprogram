package buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {
	
		try  {
			String s="";
			int count=0;
			FileReader fr = new FileReader("/home/vimalraj/Documents/Files/Reader.txt");
			BufferedReader bf=new BufferedReader(fr);
			while(bf.ready())
			{
				count=count+1;
			s=bf.readLine();
			System.out.println(s);
		
			//int i=0;
			}
			System.out.println(count);
			
			//file read
	
			//while((i=bf.read())!=-1)
			//{
		
			//	s=s+((char)i);
			//}
			//file close
			bf.close();
			
		} catch (Exception e) {

		System.out.println("please try again");
		}
		
	}

}
