package fileIOPractice;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {

	public static void main(String[] args){
		
		try {
			FileReader fr = new FileReader("/home/vimalraj/Documents/Files/NewFile.txt");
			
			FileWriter fw =new FileWriter("/home/vimalraj/Documents/Files/NewFile1.txt");
			
			
			String s="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				s=s+((char)i);
						
					}
			//System.out.println(s);
			String y[]=s.split(" ");
			for(int j=0;j<y.length;j++)
			{
				char c[]=y[i].toCharArray();
				for(int z=0;z<c.length;z++)
				{
					if(c[z]=='a')
					{
						System.out.println(y[i]);
					}
				}
			}
			
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("please try again");
		}	
	}

}
