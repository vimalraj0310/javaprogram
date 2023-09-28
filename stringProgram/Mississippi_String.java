package stringProgram;

public class Mississippi_String {

	public static void main(String[] args) {
		// 1.Search and repalce 'i' --> '!'
		//2. occurrence of 'i''s''p';
		String s="mississippi";
		int countI=0,countS=0,countP=0;
		char srch1='i';
		
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)=='i')
			{
				countI=countI+1;
			}
			else if(s.charAt(i)=='s')
			{
				countS=countS+1;
				
			}
			else if(s.charAt(i)=='p')
			{
				countP=countP+1;
			}
			
		}
		
		System.out.println(" count I :"+countI+"\n"+"count S :"+countS+"\n"+"count P: "+countP);

char c[]=new char[s.length()];
for(int i=0;i<s.length();i=i+1)
{
	c[i]=s.charAt(i);
	
	
}
		for(int i=0;i<c.length;i=i+1)
		{
			if(c[i]==srch1)
			{
				c[i]='!';
			}
		
		}
		System.out.println(c);
		
		
}
	
	
	
	
	
	}
