package stringHomeWork;

import java.util.Scanner;

public class IndividualVowelsCount4 {
//4. How to find individual vowels count in given string?
	public static void main(String[] args) {
	int	counta=0,counte=0,counti=0,counto=0,countu=0,countTotalVowel=0;
	try (Scanner in = new Scanner(System.in)) {
		String s;
	System.out.println("Enter your String:\n");
		s=in.nextLine();
			System.out.println(s);

char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
		c[i]=s.charAt(i);
}

for(int i=0;i<c.length;i=i+1)
{
	if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
	{
		countTotalVowel=countTotalVowel+1;
	}
		if(c[i]=='a')
	
		counta=counta+1;
		
		if(c[i]=='e')
			
			counte=counte+1;
		if(c[i]=='i')
			
			counti=counti+1;
			
			if(c[i]=='o')
				
				counto=counto+1;
			if(c[i]=='u')
				
				countu=countu+1;
		
}
	}
System.out.println("total nuber of vowels:"+countTotalVowel);
	System.out.println("\ncounta"+counta);
System.out.println("counte"+counte);
System.out.println("counti"+counti);
System.out.println("counto"+counto);
System.out.println("countu"+countu);
	}

}
