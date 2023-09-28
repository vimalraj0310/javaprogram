package stringProgram;

public class Typecast_String {

	public static void main(String[] args) {
		//type casting
		String Str_name[]= {"zuhair","Stancy","Selva","karthik","java"};
		for(int i=0;i<Str_name.length;i=i+1)
		{
			String s=Str_name[i];
			char c[]=s.toCharArray();
			
			for(char j:c)
			{
				System.out.println(j+"  "+((int)+j));
			}
			
		}
		
		
		
		
	}

}
