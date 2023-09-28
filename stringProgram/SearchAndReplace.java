package stringProgram;

public class SearchAndReplace {

	public static void main(String[] args) {
		   String x="she sell sea shell on the sea shore";
	        String y[]=x.split(" ");
	for(int i=0;i<y.length;i=i+1)
	{
	    for(int j=i+1;j<y.length;j=j+1){
	        if(y[i].equals(y[j])){
	            y[j]="";
	        }
	    }
	    System.out.print(y[i]);
	}
	System.out.println();
	System.out.println();
	//search and replace all
	       for(int i=0;i< y.length;i=i+1)
	       {
	           if(y[i].equals("sea")){
	               y[i]="see";
	           }
	           System.out.print(y[i]);
	       }
	}

}
