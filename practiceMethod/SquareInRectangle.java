package practiceMethod;

public class SquareInRectangle {
 int squareinrectangle(int side,int length,int breadth)
 {
	 int AreaOfSquare=side*side;
	 int AreaOfRectangle=length*breadth;
	 int number=AreaOfRectangle/AreaOfSquare;
	 System.out.println(number);
	 return number;
	 
	 
 }
	
	
	public static void main(String[] args) {
SquareInRectangle SIR=new SquareInRectangle();
SIR.squareinrectangle(4, 12, 8);
	}

}
