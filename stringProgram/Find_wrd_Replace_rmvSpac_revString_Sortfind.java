package stringProgram;

public class Find_wrd_Replace_rmvSpac_revString_Sortfind {
//find no of word ,replace char i to '!' ,Remove Space,Reverse String,Sort and Find Duplicate
	
	
	public static void main(String[] args) {
		String v="vimal is a good boy and he is also bad boy";
	int	countspace=0;
	//1.no of words
		for(int i=0;i<v.length();i=i+1)
		{
			if(v.charAt(i)==' ')
			{
				countspace=countspace+1;
			}
		}
System.out.println(countspace+1);
System.out.println();
	//2.replace 'i' by '!'

char c[]=new char[v.length()];	
for(int i=0;i<v.length();i=i+1)
{
	c[i]=v.charAt(i);
	if(c[i]=='i')
	{
		c[i]='!';
	}
	
	System.out.println(c[i]);
}
System.out.println();	


//3.Reverse String 

for(int i=v.length()-1;i>=0;i=i-1)
{
	System.out.println(v.charAt(i));
}
System.out.println();


//4.remove between space
char c1[]=new char[v.length()];
for(int i=0;i<v.length();i=i+1)
{
	c1[i]=v.charAt(i);
	if(c1[i]!=' ') {
		System.out.print(c1[i]);
	}
}
	
//5. sort and find duplicate 
char cc[]=v.toCharArray();
for(int i=0;i<cc.length;i=i+1)
{
	for(int j=i+1;j<cc.length;j=j+1)
	{
		if(cc[i]>cc[j])
		{
			char temp=cc[i];
			cc[i]=cc[j];
			cc[j]=temp;
			
			
		}
		if(cc[i]==cc[j])
		{
			cc[j]=' ';
		}
		System.out.println(cc[i]+"   "+cc[j]);
	}
}

/*for(char i:c)
{
	if(i!=' ')
	{
		System.out.println(i);
	}
	
}
*/
	
	}	
}
