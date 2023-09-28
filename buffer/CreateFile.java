package buffer;
import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
try
{
	File file=new File("/home/vimalraj/Documents/Files");
	//boolean flag=file.mkdir();
	//System.out.println(flag);
	File f[]=file.listFiles();
	for( File i:f) {
	System.out.println(i+" "+i.canRead());


	}

	
	}
catch(Exception e)
{
	System.out.println("pleasecheck");
}
	}

}
