package fileIo;

import java.io.FileReader;

public class CountNoCharacter {

	public static void main(String[] args)
	{
	String s = "";
	//int count = 0;
	try{
    FileReader fr = new  FileReader("/home/vimalraj/Documents/Files/VIM.txt");
    for(int i = 0;(i=fr.read())!=-1;) {
    s= s+((char)+i);	
    }
    //for(int i=0;i<s.length()-1;i=i+1)
   // {
   /// 	if(s.charAt(i)!=' ')
   // 	{
    	//	count++;
    //	}
    
    System.out.println(s.length());
    fr.close();
	}		
    catch(Exception e)	
	{
	System.out.print("please try again");
	}
    		
    		
    		
    		
    		
    		
    		
	}

}
