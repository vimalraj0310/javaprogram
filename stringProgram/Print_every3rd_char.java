package stringProgram;

public class Print_every3rd_char {

	public static void main(String[] args) {
		// print every 3rd character of a sentence
		String a="biswa is learning java along with imraan";
		for(int i=2;i<a.length();i=i+3)
		{
			System.out.print(a.charAt(i));
			
		}

	}

}
