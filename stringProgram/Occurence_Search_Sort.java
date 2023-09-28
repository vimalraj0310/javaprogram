package stringProgram;

public class Occurence_Search_Sort {

	public static void main(String[] args) {
		/*String str="she sell sea shell on the sea shore";
		 * 1.find occurrence of "sea"
		 * 2.search "sea" and replace " " empty space
		 * 3.Sorting words in a given sentence
		 */

		String str="she sell sea shell on the sea shore";
		int count=0;
		String s[]=str.split(" ");
		String srch="sea";
		//1.find occurrence 
		for(String i:s)
		{
			if(i.equals(srch))
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
		System.out.println();
		
		//2.search and replace
		for(int i=0;i<s.length;i=i+1)
		{
			if(s[i].equals(srch))
			{
				s[i]="see";
				
			}
			
			
		}
		
		for(String j:s)
		{
			System.out.print(j);
			
		}
		
		//3.sorting words in  a given sentence
		
		for(int i=0;i<s.length;i=i+1)
		{
			for(int j=i+1;j<s.length;j=j+1)
			{
				if(s[i].compareToIgnoreCase(s[j])>0)
				{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
					
				}
				
				
			}
			
		}
		for(String j:s)
		{
			System.out.println(j);
		}
		
		
	}

}
