package stringProgram;

public class PrintEvery3rdChar {

	public static void main(String[] args) {
		String a="Biswa is learning java along with imraan";
        for(int i=2;i<a.length();i=i+3)
        {
            System.out.print(a.charAt(i));
        }
	}

}
