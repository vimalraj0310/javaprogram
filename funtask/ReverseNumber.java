package funtask;

public class ReverseNumber {

	public static void main(String[] args) {
/*int a=1947;
int b=a%10;
int c=(a%100)/10;
int d=(a%1000)/100;
int e=(a/1000);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);*/
		 int a = 1848, b = 0; 
	     for (; a  >0;) { 
	       b =b*10+a % 10; 
	       a = a / 10; 
	     } 
	     System.out.println(b); 
	     
	}

}
