package stringProgram;

public class OccurrenceOfChar_String {

	public static void main(String[] args) {
		// occurrence of 'a' in each word in given String array
		String str[]={"aadhavan","anto","vidhya","rahaman","vimala"};

		for(int i=0;i<str.length;i=i+1)
		{
			String s=str[i];
			
		char c[]=s.toCharArray();
		int count=0;
		for(char j:c)
		{
			if(j=='a'||j=='A')
			{
				count=count+1;
			}
			
			
		}
		System.out.println(s+"  "+count);		
		}
		
	}

}
