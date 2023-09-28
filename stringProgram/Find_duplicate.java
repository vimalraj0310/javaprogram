package stringProgram;

public class Find_duplicate {

	public static void main(String[] args) {
		// find duplicate
		
		String str="mississippi";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i=i+1)
		{
			for(int j=i+1;j<c.length;j=j+1)
			{
				if(c[i]>c[j]) {
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
				}
			}
			
		}
		
		
		for(int i=0;i<c.length;i=i+1)
		{
			for(int j=i+1;j<c.length;j=j+1)
			{
				if(c[i]==c[j])
				{
					c[j]=' ';
				}
				
				
			}
			
		}
		for(char i:c)
		{
			if(i!=' ')
			{
				System.out.println(i);
			}
			
			
		}
	}

}
