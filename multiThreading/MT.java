package multiThreading;

import java.io.FileReader;

class A extends Thread
{
	public void run() {
		
		try  {
			FileReader fr = new FileReader("/home/vimalraj/Documents/Files/Reader.txt");
			int i=0;
			String s="";
			//file read
			while((i=fr.read())!=-1)
			{
			
				s=s+((char)i);
			}
			//file close
			fr.close();
			
			System.out.print(s);
			
			
		} catch (Exception e) {

		System.out.println("please try again");
		}
		
		
	}
	
}
class B extends Thread
{
public void run() {
		
	String s[]= {"java","c++","c#","python","Scala","Ruby"};
	for(int i=0;i<s.length;i=i+1)
	{
		for(int j=i+1;j<s.length;j=j+1)
		{
		if(s[i].compareTo(s[j])>0)
		{
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
				
		
			
		}
		}
	for(String i:s)
	{
		System.out.println(i);
	}
	
	
	}
}
class C extends Thread

{
public void run() {
	  int a=0;	  
      int b=1;
      int c;

   System.out.println(a);
   System.out.println(b);

for(int i=1;i<=10;i++)
{
	try {//sleep delay time 
		sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   c=a+b;
   System.out.println(c);
   a= b;
   b= c;
}

	}
	
}
public class MT {

	public static void main(String[] args) {
A a=new A();
B b=new B();
C c=new C();

a.start();
b.start();
c.start();


		
	}

}
