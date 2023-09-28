package stringProgram;

public class Anagram {

	String sort(String a)
	{
		String output="";
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i=i+1)
		{
			for(int j=i+1;j<c.length;j=j+1)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
				
			}
		}
			
			for(int i=0;i<c.length;i=i+1)
			{
				output=output+c[i];
				
				
			}
			
		
		
		
		
		return output;
	}
	
	
	public static void main(String[] args) {
		String i="not";
		String j="ton";
		Anagram Ana=new Anagram();
		String x=Ana.sort(i);
		String y=Ana.sort(j);
		if(x.equals(y))
		{
			System.out.println("this is anagram");
			
		}
		else
		{
			System.out.println("not a anagram");
		}
		
	}

}
