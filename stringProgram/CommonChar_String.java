package stringProgram;

public class CommonChar_String {

	public static void main(String[] args) {
		// find common Char Among Two Words
		String s="internationalisation";
		String ss="mississippi";
		
		char c[]=s.toCharArray();
		char cc[]=ss.toCharArray();
		
		for(int i=0;i<s.length();i=i+1)
		{
			for(int j=0;j<ss.length();j=j+1)
			{
				if(c[i]==cc[j])
				{
					System.out.println(c[i]);	

					cc[j]=' ';
					
					
				}
				
			}
			
			

		}
		
		
		
	}

}
