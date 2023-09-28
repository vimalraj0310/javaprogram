package twoDimensionAarry;

public class UpperTriangle {

	public static void main(String[] args) {
		int a[][] = { { 5, 6, 7, 8 }, { 7, 8, 9, 3 }, { 9, 2, 7, 9 }, { 6, 8, 7, 4 } };
		  int b[][] = new int[a.length][a.length]; // created new array
		  for (int i = 0; i < a.length; i++) {
		   for (int j = i; j <a[i].length; j++) {
		    b[i][j] = a[i][j]; // transfer upper tri ele
		   }
		  }
		// just for printing 
		  for (int i = 0; i < a.length; i++) {
		   for (int j =0; j < a[i].length; j++) {
		    if (b[i][j]!=0)
		     System.out.print(b[i][j]+" ");
		    else
		     System.out.print(b[i][j]+" ");

		   }
		   System.out.println();

		  }


	}

}
