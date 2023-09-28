package funtask;

public class PalinromNumber {

	public static void main(String[] args) {
int a=121;
int b=0;
int c=a;
while(a!=0)
{
	b=b*10+a%10;
	a=a/10;
}
System.out.println(b);
//this is to print whether given number is palindorme are not  
if (b==c) { 
  System.out.println("yes"); 

} else { 
  System.out.println("no"); 
} 
	}

}
