package stringHomeWork;

public class SearchWordInside {

	public static void main(String[] args) {
String s="i am doing my home work";
String Srch="work";
boolean flag=false;
String s1[]=s.split(" ");
for(int i=0;i<s1.length;i++)
{
	if(s1[i].equalsIgnoreCase(Srch)) {
		flag=true;
	}
}
System.out.println(flag);
	}

}
