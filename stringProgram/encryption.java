package stringProgram;

public class encryption {

	public static void main(String[] args) {
		String a="java";
        String b="";
        char[] c=a.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            c[i]= (char) ((char)c[i]+3);


        }
        for(int i=0;i<c.length;i++)
        {
            b=b+c[i];

        }
        System.out.println(b);
	}

}
